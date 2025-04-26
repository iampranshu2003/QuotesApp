package com.example.quotesapp.model

import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("quote") val text: String,
    val author: String
)