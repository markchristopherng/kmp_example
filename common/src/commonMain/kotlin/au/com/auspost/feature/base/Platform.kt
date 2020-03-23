package au.com.auspost.feature.base

interface IPlatform {
    fun getOS(): String
}

expect open class Platform actual constructor() : IPlatform {
    override fun getOS(): String
}