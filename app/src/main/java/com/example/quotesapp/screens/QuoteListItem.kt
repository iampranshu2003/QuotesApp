package com.example.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quotesapp.model.Quote
import java.nio.file.WatchEvent


@Composable
fun QuoteListItem(quote: Quote, onClick: (quote: Quote) -> Unit){
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.padding(8.dp).clickable{onClick(quote)}
    ) {

            Row(modifier = Modifier.padding(16.dp)) {
                Image(
                    imageVector = Icons.Filled.Close,
                    alignment = Alignment.TopStart,
                    contentDescription = "Close",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier.size(40.dp)
                        .background(color = Color.Black)

                )
                Spacer(modifier = Modifier.padding(4.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = quote.text,
                        style = MaterialTheme.typography.bodySmall,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,6.dp)
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(.4f).height(1.dp).background(Color.LightGray)

                    ) {}
                        Text(
                            text = quote.author,
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.Thin,
                            modifier = Modifier.padding(top = 8.dp)

                        )


                }
            }
        }

}


