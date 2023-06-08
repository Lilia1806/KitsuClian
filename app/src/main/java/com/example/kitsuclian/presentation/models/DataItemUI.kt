package com.example.kitsuclian.presentation.models

import android.os.Parcelable
import com.example.kitsuclian.domain.models.DataItem
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataItemUI(
    @SerializedName("id")
    val id: String,
    @SerializedName("attributes")
    val attributes: AttributesUI,
    @SerializedName("type")
    val type: String
): Parcelable

fun DataItem.toUI(): DataItemUI {
    return DataItemUI(id, attributes.toUI(), type)
}