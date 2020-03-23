package au.com.auspost.feature.base

import platform.UIKit.UIDevice

actual open class Platform : IPlatform {
    actual override fun getOS() = "iOS" + UIDevice.currentDevice().systemVersion()
}
