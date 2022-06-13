package com.reeta.onsaveinstanceproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.reeta.onsaveinstanceproject.databinding.ActivityMainBinding
import com.reeta.onsaveinstanceproject.goToOtherApp.GoToOtherAppActivity
import com.reeta.onsaveinstanceproject.gowebpage.GoWebPageActivity
import com.reeta.onsaveinstanceproject.onsaveAndonRestoreMethods.MainActivity2
import com.reeta.onsaveinstanceproject.searchEditTextBox.SearchActivity
import com.reeta.onsaveinstanceproject.sendEmails.SendEmailsActivity
import com.reeta.onsaveinstanceproject.validEmailOrNot.CheckForValidEmailActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val TAG="reeta"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.apply {

            btnEmailAndPass.setOnClickListener {
                var intent=Intent(this@MainActivity,CheckForValidEmailActivity::class.java)
                startActivity(intent)
            }
            btnGoToOtherApp.setOnClickListener {
                var intent=Intent(this@MainActivity,GoToOtherAppActivity::class.java)
                startActivity(intent)
            }
            btnSendEmails.setOnClickListener {
                var intent=Intent(this@MainActivity,SendEmailsActivity::class.java)
                startActivity(intent)
            }
            btnsaveInstance.setOnClickListener {
               var intent=Intent(this@MainActivity,MainActivity2::class.java)
                startActivity(intent)
            }
            btnLaunch.setOnClickListener {
                var intent=Intent(this@MainActivity,SearchActivity::class.java)
                startActivity(intent)
            }
            btngoWebPage.setOnClickListener {
                var intent=Intent(this@MainActivity,GoWebPageActivity::class.java)
                startActivity(intent)
            }
        }

    }


}