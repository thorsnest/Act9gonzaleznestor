package com.example.act9gonzaleznestor

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.act9gonzaleznestor.databinding.CardviewTipusBinding

class Adaptador(private val tipusList: List<TipusCategories>): RecyclerView.Adapter<Adaptador.ViewHolder>() {
    class ViewHolder(val binding : CardviewTipusBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CardviewTipusBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if(tipusList[position].tipus == 0){
            holder.binding.nomTipusTv.text = ""
            Glide.with(holder.binding.root.context).load(tipusList[position].imatge).into(holder.binding.imatgeTipusIv)
            holder.binding.imatgeTipusIv.getLayoutParams().width = 1000
        }else{
            holder.itemView.setOnClickListener{
                when(position) {
                    1 -> it.findNavController().navigate(R.id.nav_gallery)
                    2 -> it.findNavController().navigate(R.id.nav_slideshow)
                    3 -> it.findNavController().navigate(R.id.nav_gallery)
                    4 -> it.findNavController().navigate(R.id.nav_gallery)
                }
            }
        holder.binding.nomTipusTv.text = tipusList[position].nom
        Glide.with(holder.binding.root.context).load(tipusList[position].imatge).into(holder.binding.imatgeTipusIv)
        }
    }

    override fun getItemCount(): Int = tipusList.size
}