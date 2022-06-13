package com.reeta.onsaveinstanceproject.validEmailOrNot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.reeta.onsaveinstanceproject.R
import kotlinx.android.synthetic.main.activity_check_for_valid_email.*

class CheckForValidEmailActivity : AppCompatActivity() {

    private var validEmail: Regex = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+" as Regex

  //  private val validEmail = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_for_valid_email)
        btnLogin.setOnClickListener {
           if (isEmailValid() && isPasswordValid()){
               Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
           }else{
               Toast.makeText(this,"Login Failed",Toast.LENGTH_SHORT).show()
           }
        }
    }

    private fun isEmailValid():Boolean{
        return if (edtValidGmail.text.toString().length>1 && edtValidGmail.text.toString().matches(validEmail)){
            true
        }else{
            edtValidGmail.error="Invalid Email"
            false
        }
    }

    // trim use for removing the blank space
    private fun isPasswordValid():Boolean{
        return if (edtPassword.text.toString().trim().length>=6){
            true
        }else{
            edtPassword.error="length is too short"
            false
        }
    }
}