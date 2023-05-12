package com.example.projectscreen

import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes

sealed class DetailRecyclerViewItem{
    data class Title(
        val id: Int,
        val title: String
    ) : DetailRecyclerViewItem()
    data class Attendees(
        val id: Int,
        val name: String
    ) : DetailRecyclerViewItem()
    data class History(
        val id: Int,
        val title: String
    ) : DetailRecyclerViewItem()
    data class MeetingInfo(
        val id: Int,
        val title: String,
        val action: String,
        @DrawableRes val drawable : Int,
        @ColorRes val actionColorRes: Int,
    ) : DetailRecyclerViewItem()

}
