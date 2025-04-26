package com.example.quotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.quotesapp.model.Quote

@Composable
fun QuoteScreen(data: Array<Quote>?, onClick: () -> Unit){
    Column {
        Text(
            text = "Quote App",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.fillMaxWidth(1f).padding(8.dp,24.dp)
        )
        QuoteList(data = data){
            onClick()
        }

    }
}