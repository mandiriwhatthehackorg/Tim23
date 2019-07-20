package com.mandiriexel.core.model.transfer

import com.google.gson.annotations.SerializedName

data class Exception (
    @SerializedName("status") val status : Int
)