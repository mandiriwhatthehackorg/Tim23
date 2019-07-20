package com.mandiriexel.core.db

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.util.Log

class SessionManager(private val _context: Context) {

    // Shared Preferences
    private val pref: SharedPreferences

    private val editor: Editor

    // Shared pref mode
    private val PRIVATE_MODE = 0

    val isLoggedIn: Boolean
        get() = pref.getBoolean(KEY_IS_LOGGEDIN, false)

    val getUser:String
        get() = pref.getString(KEY_IS_USER, "")

    val getID:String
        get() = pref.getString(KEY_IS_ID,"")

    val getName:String
        get() = pref.getString(KEY_IS_ROLENAME,"")

    val getSaldo:String
        get() = pref.getString(KEY_IS_SALDO,"")

    init {
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }

    fun setSaldo(saldo:String){
        editor.putString(KEY_IS_SALDO, saldo)
        editor.commit()
    }
    fun setLogin(isLoggedIn: Boolean, applink:String) {
        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn)
        editor.putString(KEY_APPLINK, applink)
        // commit changes
        editor.commit()
        Log.d(TAG, "User login session modified!")
    }
    fun setUser(id:String,  user:String, code:String,  roleName:String, passsword:String, saldo:String){
        editor.putString(KEY_IS_ID, id)
        editor.putString(KEY_IS_USER, user)
        editor.putString(KEY_IS_CODE, code)
        editor.putString(KEY_IS_ROLENAME, roleName)
        editor.putString(KEY_IS_PASSSWORD, passsword)
        editor.putString(KEY_IS_SALDO, saldo)
        editor.commit()

        Log.d(TAG, "User login modified!")
    }

    companion object {
        // LogCat tag
        private val TAG = SessionManager::class.java.simpleName

        // Shared preferences file name
        private val PREF_NAME = "mandiri_login"
        private val KEY_IS_LOGGEDIN = "isLoggedIn"
        private val KEY_IS_USER= "isUser"
        private val KEY_IS_CODE = "isCode"
        private val KEY_IS_ID= "isId"
        private val KEY_APPLINK = "isAppslink"
        private val KEY_IS_PASSSWORD = "isPassword"
        private val KEY_IS_ROLENAME = "isRoleName"
        private val KEY_IS_SALDO = "isSaldo"

    }
}