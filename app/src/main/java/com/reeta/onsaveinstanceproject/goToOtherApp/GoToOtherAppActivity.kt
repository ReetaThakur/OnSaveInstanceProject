package com.reeta.onsaveinstanceproject.goToOtherApp

import android.content.Intent
import android.content.pm.ResolveInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.reeta.onsaveinstanceproject.R
import kotlinx.android.synthetic.main.activity_go_to_other_app.*

class GoToOtherAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go_to_other_app)
        btnSecondApp.setOnClickListener {
            var intent=Intent()
            intent.action = "android.reeta.app" // action come from second app manifest life
            intent.type="plain/text" // this type also come in second app manifest file
            intent.putExtra("name","reeta")
            var packageManager= packageManager
            var list: List<ResolveInfo> = packageManager.queryIntentActivities(intent,0)
            if (list.isNotEmpty()){
                startActivity(intent)
            }else{
                Toast.makeText(this,"No app found to open intent", Toast.LENGTH_SHORT).show()
            }
        }
    }
}