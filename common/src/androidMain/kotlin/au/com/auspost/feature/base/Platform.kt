package au.com.auspost.feature.base

import android.os.Build

actual open class Platform : IPlatform {
    actual override fun getOS() = "Android ${Build.VERSION.SDK_INT}"
}