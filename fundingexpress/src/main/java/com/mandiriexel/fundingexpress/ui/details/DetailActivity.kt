package com.mandiriexel.fundingexpress.ui.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.core.model.funding.Detail
import kotlinx.android.synthetic.main.activity_detail.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.mandiriexel.fundingexpress.adapter.DetailAdapter


class DetailActivity : AppCompatActivity() {
    var keyword:String = ""
    var data:ArrayList<Detail> = ArrayList()
    private lateinit var adapter: DetailAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.mandiriexel.fundingexpress.R.layout.activity_detail)
        try {
            keyword = intent?.data?.lastPathSegment as String
        } catch (e: Exception) {
            finish()
        }
        if(keyword.equals("cepat")){
            cepat()
            uiTitle.text="Dana Cepat"
        }else if(keyword.equals("pendidikan")){
            pendidikan()
            uiTitle.text="Dana Pendidikan"
        }else{
            usaha()
            uiTitle.text="Dana Usaha"
        }
        uiBack.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                onBackPressed();
            }
        })
        val horizontalLayoutManager = LinearLayoutManager(this@DetailActivity, LinearLayoutManager.HORIZONTAL, false)
        uiList.setLayoutManager(horizontalLayoutManager);
        adapter =  DetailAdapter(this)
        adapter.addData(data)
        uiList.setAdapter(adapter);
    }
    fun cepat(){
        var add:Detail = Detail("Paket 1 - Dana Cepat","5000000","450000")
        data.add(add)
        data.add(add)
        data.add(add)
    }
    fun pendidikan(){
        var add:Detail = Detail("Paket 1 - Dana Pendidikan","6000000","450000")
        data.add(add)
        data.add(add)
        data.add(add)
    }
    fun usaha(){
        var add:Detail = Detail("Paket 1 - Dana Usaha","8000000","450000")
        data.add(add)
        data.add(add)
        data.add(add)
    }
}
