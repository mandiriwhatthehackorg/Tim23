package com.mandiriexel.core.model.transfer

import com.google.gson.annotations.SerializedName

data class TransferRequest (
	@SerializedName("Request") val request : Request
)