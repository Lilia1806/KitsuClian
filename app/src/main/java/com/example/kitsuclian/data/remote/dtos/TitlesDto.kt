package com.example.kitsuclian.data.remote.dtos

import com.example.kitsuclian.domain.models.Titles
import com.google.gson.annotations.SerializedName

data class TitlesDto(
    @SerializedName("en_jp")
    val enJp: String
)

fun TitlesDto.toDomain(): Titles {
    return Titles(enJp)
}