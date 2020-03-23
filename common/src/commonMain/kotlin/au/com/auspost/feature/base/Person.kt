package au.com.auspost.feature.base

import kotlinx.serialization.Serializable

@Serializable
data class Person constructor(var firstName: String, var lastName: String)