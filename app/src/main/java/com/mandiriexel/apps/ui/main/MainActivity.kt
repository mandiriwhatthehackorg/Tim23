package com.mandiriexel.apps.ui.main

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.apps.R
import com.mandiriexel.core.db.SessionManager
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {
    private lateinit var session: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        session = SessionManager(applicationContext)
        uiSaldo.text = "IDR ${currencyFormat(session.getSaldo)}"
        uiName.text = session.getName
        uiId.text = session.getID
        uiFunding.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://fundingmenu")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
        uiClick.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://main")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
        uiOffline.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val uri = Uri.parse("mandiri://main")
                val intent = Intent(Intent.ACTION_VIEW, uri)
                startActivity(intent)
            }
        })
    }
    fun currencyFormat(amount: String): String {
        val formatter = DecimalFormat("###,###,##0.00")
        return formatter.format(java.lang.Double.parseDouble(amount)).toString()
    }
    override fun onBackPressed() {
        val homeIntent = Intent(Intent.ACTION_MAIN)
        homeIntent.addCategory(Intent.CATEGORY_HOME)
        homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(homeIntent)
    }
}
