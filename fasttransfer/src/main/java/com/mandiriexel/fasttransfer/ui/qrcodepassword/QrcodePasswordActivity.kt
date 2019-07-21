package com.mandiriexel.fasttransfer.ui.qrcodepassword

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.fasttransfer.R
import kotlinx.android.synthetic.main.activity_qrcode_password.*

class QrcodePasswordActivity : AppCompatActivity() {

    var point = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qrcode_password)
        btn1.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                counter()
            }
        })
        btn2.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                counter()
            }
        })
        btn3.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                counter()
            }
        })
        uiBack.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                onBackPressed();
            }
        })
    }

    fun counter(){
        point+=1
        if(point==1){
            ic1.setImageResource(R.drawable.ic_ellipse_2)
        }else if(point==2){
            ic2.setImageResource(R.drawable.ic_ellipse_2)
        }else if(point==3){
            ic3.setImageResource(R.drawable.ic_ellipse_2)
        }else if(point==4){
            ic4.setImageResource(R.drawable.ic_ellipse_2)
        }else if(point==5){
            ic5.setImageResource(R.drawable.ic_ellipse_2)
        }else{
            ic6.setImageResource(R.drawable.ic_ellipse_2)
            val uri = Uri.parse("mandiri://qrcodesucces")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}
