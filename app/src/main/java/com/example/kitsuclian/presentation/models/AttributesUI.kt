package com.example.kitsuclian.presentation.models

import android.os.Parcelable
import com.example.kitsuclian.domain.models.Attributes
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AttributesUI(
    @SerializedName("posterImage")
    val posterImage: PosterImageUI,
    @SerializedName("titles")
    val titles: TitlesUI
): Parcelable

fun Attributes.toUI(): AttributesUI {
    return AttributesUI(posterImage.toUI(), titles.toUI())
}