package com.ibrahim.retrofittaksiduraklari.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TaksiDurakAPI {

        private val BASE_URL = "https://openapi.izmir.bel.tr/api/ibb/cbs/"

        private val taksidurakApi: TaksiDurakService = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TaksiDurakService::class.java)

        fun getTaksiDurakService() = taksidurakApi
    }