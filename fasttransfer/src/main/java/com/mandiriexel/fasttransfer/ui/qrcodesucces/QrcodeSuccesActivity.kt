package com.mandiriexel.fasttransfer.ui.qrcodesucces

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.fasttransfer.R
import kotlinx.android.synthetic.main.activity_qrcode_succes.*

class QrcodeSuccesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode_succes)
        uiSelesai.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://main")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
    }
}
