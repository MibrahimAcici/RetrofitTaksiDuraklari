package com.ibrahim.retrofittaksiduraklari.model

import com.google.gson.annotations.SerializedName

data class OnemliyerItem(

	@field:SerializedName("ILCEID")
	val iLCEID: String? = null,

	@field:SerializedName("MAHALLEID")
	val mAHALLEID: Any? = null,

	@field:SerializedName("KAPINO")
	val kAPINO: String? = null,

	@field:SerializedName("ADI")
	val aDI: String? = null,

	@field:SerializedName("ILCE")
	val iLCE: String? = null,

	@field:SerializedName("YOL")
	val yOL: String? = null,

	@field:SerializedName("MAHALLE")
	val mAHALLE: String? = null,

	@field:SerializedName("ACIKLAMA")
	val aCIKLAMA: String? = null,

	@field:SerializedName("ENLEM")
	val eNLEM: Double? = null,

	@field:SerializedName("BOYLAM")
	val bOYLAM: Double? = null
)