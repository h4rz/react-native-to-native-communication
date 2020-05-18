package com.samplernapp

import android.content.Intent
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

/**
 * Created by Harsh Rajgor on 12/03/20.
 */

class ActivityStarterModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    override fun getName(): String = "ActivityStarter"

    /**
     * Methods annotated with @ReactMethod are exposed to javascript and can be used in javascript
     */

    @ReactMethod
    fun startNativeAppActivity(username: String, password:String){
        val activity = currentActivity
        if(activity != null){
            val intent = Intent(activity,NativeAppActivity::class.java)
            intent.putExtra("username",username)
            intent.putExtra("password",password)
            activity.startActivity(intent)
        }
    }
}