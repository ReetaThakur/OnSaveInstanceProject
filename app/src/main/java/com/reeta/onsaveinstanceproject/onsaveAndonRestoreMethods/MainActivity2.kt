package com.reeta.onsaveinstanceproject.onsaveAndonRestoreMethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.reeta.onsaveinstanceproject.R
import com.reeta.onsaveinstanceproject.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private val TAG="reeta"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main2)

        binding.apply {
            btnLaunch.setOnClickListener {
                tvName.text="Deeksha"
            }
        }
        Log.d(TAG,"onCreate Activity A")

        //we can also restore our data in oncreate method beacuse onCreate also have same bundle
//        if (savedInstanceState!=null){
//            var name=savedInstanceState.getString("name")
//            binding.tvName.text=name
//        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart Activity A")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG,"onRestoreInstanceState Activity A")
        var name=savedInstanceState.getString("name")
        binding.tvName.text=name
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Activity A")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause Activity A")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG,"onSaveInstanceState Activity A")
        var name=binding.tvName.toString()
        outState.putString("name",name)
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Activity A")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart Activity A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy Activity A")
    }
}