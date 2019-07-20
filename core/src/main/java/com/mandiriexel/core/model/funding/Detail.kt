package com.mandiriexel.core.model.funding

import com.google.gson.annotations.SerializedName

data class Detail (
    @SerializedName("nama") val nama : String,
    @SerializedName("harga") val harga : String,
    @SerializedName("cicilan") val cicilan : String
)