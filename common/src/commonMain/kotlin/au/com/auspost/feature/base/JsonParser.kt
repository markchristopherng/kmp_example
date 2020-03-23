package au.com.auspost.feature.base

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

object JsonParser {
    val json = Json(JsonConfiguration.Stable)
}