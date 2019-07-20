package com.mandiriexel.apps.ui.login

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mandiriexel.apps.R
import com.mandiriexel.core.db.SessionManager
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    var name:ArrayList<String> = ArrayList()
    var username:ArrayList<String> = ArrayList()
    var code:ArrayList<String> = ArrayList()
    var password:ArrayList<String> = ArrayList()
    var applink:ArrayList<String> = ArrayList()
    var saldo:ArrayList<String> = ArrayList()
    private lateinit var session: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        akun()
        session = SessionManager(applicationContext)
        if (session.isLoggedIn) {
            val uri = Uri.parse("mandiri://main")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        btnLogin.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                for (i in 0..username.size-1) {
                    if(username[i].equals(uiUser.text.toString())) {
                        uiSalahUser.visibility = View.INVISIBLE
                        if (password[i].equals(uiPassword.text.toString())) {
                            uiSalahPassword.visibility = View.INVISIBLE
                            session.setLogin(true, applink[i])
                            session.setUser(code[i], username[i], "123456", name[i], password[i],saldo[i])
                            val uri = Uri.parse("mandiri://main")
                            val intent = Intent(Intent.ACTION_VIEW, uri)
                            startActivity(intent)
                            break
                        } else {
                            uiSalahPassword.visibility = View.VISIBLE
                        }
                    }
                }
            }
        })
    }

    fun akun(){
        name.add("Alzahid Muhasabah")
        username.add("zermen")
        code.add("1111006394613")
        password.add("test")
        applink.add("gieg87ib3gig92b3k")
        saldo.add("2500000000")
        name.add("M Nahromi")
        username.add("test1")
        code.add("1111006399750")
        password.add("test")
        applink.add("dae3e24fw3535gfw3")
        saldo.add("250000000")
        name.add("M Nahromi")
        username.add("test2")
        code.add("1111006405082")
        password.add("test")
        applink.add("sfw432342rc234rd2")
        saldo.add("25000000")
    }
}
