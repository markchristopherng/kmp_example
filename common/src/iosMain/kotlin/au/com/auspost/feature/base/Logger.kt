package au.com.auspost.feature.base

import platform.Foundation.NSLog

actual object Logger {

    actual fun logMessage(msg: String) {
        NSLog(msg)
    }
}