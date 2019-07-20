package com.mandiriexel.fundingexpress.ui.report

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.fundingexpress.R
import kotlinx.android.synthetic.main.activity_report.*

class ReportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_report)
        uiSelesai.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://main")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
    }
}
