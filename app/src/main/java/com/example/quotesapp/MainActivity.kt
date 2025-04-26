package com.example.quotesapp

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quotesapp.screens.QuoteDetail
import com.example.quotesapp.screens.QuoteScreen
import com.example.quotesapp.ui.theme.QuotesAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        CoroutineScope(Dispatchers.IO).launch{
                delay(3000)
            DataManager.loadAssetsFromFile(applicationContext)
        }

        setContent {

            App()

        }
    }
}

@Composable
fun App() {
    if (DataManager.isDataLoaded.value) {

        if (DataManager.currentPage.value == Pages.LISTING) {

            QuoteScreen(data = DataManager.data) {

                DataManager.switchPages(it)
            }
        }
        else{
            DataManager.currentQuote?.let {
                QuoteDetail(quote = it)
            }
        }


    }
    else{
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize(1f)
        ) {
            Text(text = "Loading...")
        }
    }
}

enum class Pages{
    LISTING, DETAILS
}

