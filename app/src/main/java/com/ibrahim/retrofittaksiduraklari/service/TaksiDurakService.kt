package com.ibrahim.retrofittaksiduraklari.service

import com.ibrahim.retrofittaksiduraklari.model.TaksiDurakResponse
import retrofit2.Call
import retrofit2.http.GET

interface TaksiDurakService {
    @GET("taksiduraklari")
    fun getTaksiDurak() : Call<TaksiDurakResponse>
}
//Liste değil [ ile başlamıyor Call<List<şeklinde yazmadık
/* companion object{
     const val TAKSI_DURAKLARI = "cbs/taksiduraklari"
 }*/
//https://openapi.izmir.bel.tr/api/ibb/cbs/taksiduraklari
//https://api.orhanaydogdu.com.tr/deprem/live.php?limit=100
//BASE URL     /     "live.php" GET içerisine yazılacak
//BASE URL     /..... ?    "limit" Query içerisine yazılacak
//BASE URL     /live.php?limit=100 getPlaces fun çağırıldığında 100 değeri girilecek getPlaces(100) şeklinde