package com.mandiriexel.core.model.transfer

import com.google.gson.annotations.SerializedName

data class TransferResponse (
	@SerializedName("Response") val response : Response
)