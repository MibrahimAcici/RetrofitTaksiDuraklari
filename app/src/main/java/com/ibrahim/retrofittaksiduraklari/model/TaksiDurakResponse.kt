package com.ibrahim.retrofittaksiduraklari.model

import com.google.gson.annotations.SerializedName

data class TaksiDurakResponse(

	@field:SerializedName("kayit_sayisi")
	val kayitSayisi: Int? = null,

	@field:SerializedName("sayfadaki_kayitsayisi")
	val sayfadakiKayitsayisi: Int? = null,

	@field:SerializedName("sayfa_numarasi")
	val sayfaNumarasi: Int? = null,

	@field:SerializedName("onemliyer")
	val onemliyer: List<OnemliyerItem?>? = null,

	@field:SerializedName("toplam_sayfa_sayisi")
	val toplamSayfaSayisi: Int? = null
)