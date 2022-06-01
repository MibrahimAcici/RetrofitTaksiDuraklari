package com.ibrahim.retrofittaksiduraklari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.ibrahim.retrofittaksiduraklari.adapter.TaksiDurakAdapter
import com.ibrahim.retrofittaksiduraklari.databinding.ActivityMainBinding
import com.ibrahim.retrofittaksiduraklari.model.TaksiDurakResponse
import com.ibrahim.retrofittaksiduraklari.service.TaksiDurakAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding //Viewbinding
    lateinit var taksidurakAdapter: TaksiDurakAdapter  //Adapter tanımlama
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater) //Viewbinding
        setContentView(binding.root) //Viewbinding

        initAdapter()
        fetchPlace()
    }

    private fun initAdapter() {
        //Adapter Tanımlayıp başlatma
        taksidurakAdapter = TaksiDurakAdapter()
        binding.recyclerView.adapter = taksidurakAdapter
        //Adapterin Ekrandaki Görünümü
        val layoutManager = LinearLayoutManager(applicationContext)
        binding.recyclerView.layoutManager = layoutManager
    }

    private fun fetchPlace() {
        binding.recyclerView.isVisible = false
        binding.progress.isVisible = true
        //Servise istek atma
        val request = TaksiDurakAPI().getTaksiDurakService().getTaksiDurak()
        request.enqueue(object : Callback<TaksiDurakResponse> {//Liste değil [ ile başlamıyor Callback<List<şeklinde yazmadık
        override fun onResponse(
            call: Call<TaksiDurakResponse>,
            response: Response<TaksiDurakResponse>
        ) {
            //Toast.makeText(applicationContext, response.body()?.result?.get(0)?.lokasyon,Toast.LENGTH_LONG).show()

            taksidurakAdapter.setList(response.body()?.onemliyer ?: emptyList())
            binding.recyclerView.isVisible = true
            binding.progress.isVisible = false
        }

            override fun onFailure(call: Call<TaksiDurakResponse>, t: Throwable) {
                Toast.makeText(applicationContext,t.message.toString(), Toast.LENGTH_LONG).show()
                binding.recyclerView.isVisible = true
                binding.progress.isVisible = false
            }
        })
    }}
