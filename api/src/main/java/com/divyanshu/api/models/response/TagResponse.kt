package com.divyanshu.api.models.response


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TagsResponse(
  @Json(name = "tags")
  val tags: List<String>
)