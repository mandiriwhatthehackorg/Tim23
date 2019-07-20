package com.mandiriexel.core.model.transfer

import com.google.gson.annotations.SerializedName

data class Request (
    @SerializedName("Exception") val exception : Exception,
    @SerializedName("transactionID") val transactionID : String,
    @SerializedName("transactionDate") val transactionDate : String,
    @SerializedName("referenceID") val referenceID : String,
    @SerializedName("remittanceNumber") val remittanceNumber : String,
    @SerializedName("availableBalance") val availableBalance : String
)