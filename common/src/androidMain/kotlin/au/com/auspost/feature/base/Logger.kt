package au.com.auspost.feature.base

import android.util.Log

actual object Logger {

    actual fun logMessage(msg: String) {
        Log.d("AndroidApp", msg)
    }
}