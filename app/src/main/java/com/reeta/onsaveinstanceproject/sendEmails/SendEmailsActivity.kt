package com.reeta.onsaveinstanceproject.sendEmails

import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.ResolveInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.reeta.onsaveinstanceproject.R
import kotlinx.android.synthetic.main.activity_send_emails.*

class SendEmailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_emails)

        btnSendEmail.setOnClickListener {
            val emailIntent=Intent(Intent.ACTION_SEND)
            emailIntent.type = "text/plain"
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"email subject")
            var email="thakurreeta1995@gmail.com"
            emailIntent.putExtra(Intent.EXTRA_CC, arrayOf(email))
            emailIntent.putExtra(Intent.EXTRA_TEXT, "email content goes here")
           var packageManager= packageManager
            var list: List<ResolveInfo> = packageManager.queryIntentActivities(emailIntent,0)
            if (list!=null && list.isNotEmpty()){
                startActivity(emailIntent)
            }else{
                Toast.makeText(this,"No app found to open intent",Toast.LENGTH_SHORT).show()
            }
        }
    }
}