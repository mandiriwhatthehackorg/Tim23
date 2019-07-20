package com.mandiriexel.fundingexpress.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.mandiriexel.core.model.funding.Detail
import com.mandiriexel.fundingexpress.R
import kotlinx.android.synthetic.main.list_card_detail.view.*
import java.text.DecimalFormat
import java.util.ArrayList

class DetailAdapter (private val context: Context?) : RecyclerView.Adapter<DetailAdapter.ViewHolder>(){
    private var data: List<Detail> = ArrayList()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val root = (LayoutInflater.from(parent.context).inflate(R.layout.list_card_detail, parent, false))
        return ViewHolder(root)
    }

    fun addData(data: List<Detail>?) {
        if (data != null) {
            this.data = data
            notifyDataSetChanged()
        }
    }

    inner class ViewHolder(root: View) : RecyclerView.ViewHolder(root) {
        init {
            itemView.setOnClickListener {
                if (adapterPosition != RecyclerView.NO_POSITION) {
                    val uri = Uri.parse("mandiri://fundingrincian")
                    val intent = Intent(Intent.ACTION_VIEW, uri)
                    context?.let { it1 -> ContextCompat.startActivity(it1, intent, null) }
                }
            }
        }

        fun bind(data: Detail) = with(itemView) {
            uiCicilan.text = "Cicilan mulai Rp${currencyFormat(data.cicilan)}"
            uiDana.text = "Rp${currencyFormat(data.harga)}"
            uiName.text = "${data.nama}"
        }
        fun currencyFormat(amount: String): String {
            val formatter = DecimalFormat("###,###,###")
            return formatter.format(java.lang.Double.parseDouble(amount)).toString()
        }
    }}