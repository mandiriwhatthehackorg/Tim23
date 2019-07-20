package com.mandiriexel.fundingexpress.ui.menu

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.fundingexpress.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        uiDanacepat.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://fundingdetail/cepat")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
        uiDanapendidikan.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://fundingdetail/pendidikan")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
        uiDanausaha.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://fundingdetail/usaha")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
        btnBack.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                onBackPressed();
            }
        })
    }

}
