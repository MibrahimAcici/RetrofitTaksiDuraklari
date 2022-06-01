package com.ibrahim.retrofittaksiduraklari.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ibrahim.retrofittaksiduraklari.DurakDetayActivity
import com.ibrahim.retrofittaksiduraklari.databinding.ItemTaksidurakBinding
import com.ibrahim.retrofittaksiduraklari.model.OnemliyerItem

class TaksiDurakAdapter() : RecyclerView.Adapter<TaksiDurakAdapter.TaksiDurakVH>() {

    private var taksidurakList: ArrayList<OnemliyerItem?> = arrayListOf()

    fun setList(newList: List<OnemliyerItem?>) {
        this.taksidurakList.clear()
        this.taksidurakList.addAll(newList)
        notifyDataSetChanged()
    }

    inner class TaksiDurakVH(val binding: ItemTaksidurakBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaksiDurakVH {
        return TaksiDurakVH(ItemTaksidurakBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: TaksiDurakVH, position: Int) {
        val taksidurak=taksidurakList[position]

        holder.binding.tvDurakAdi.text=taksidurak?.aDI
        holder.binding.tvDurakIlce.text = taksidurak?.iLCE
        holder.binding.tvDurakMahalle.text = taksidurak?.mAHALLE

        holder.binding.root.setOnClickListener(){
        val intent= Intent(holder.binding.root.context,DurakDetayActivity::class.java)
        intent.putExtra("durakIsmi",taksidurak?.aDI)
        holder.binding.root.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = taksidurakList.size
}