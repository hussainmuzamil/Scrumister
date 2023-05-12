package com.example.projectscreen

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectscreen.DataSource.TYPE_ATTENDEES
import com.example.projectscreen.DataSource.TYPE_HISTORY
import com.example.projectscreen.DataSource.TYPE_MEETING_INFO
import com.example.projectscreen.DataSource.TYPE_TITLE
import com.example.projectscreen.databinding.ListAttendeesBinding
import com.example.projectscreen.databinding.ListHistoryBinding
import com.example.projectscreen.databinding.ListMeetinginfoBinding
import com.example.projectscreen.databinding.ListTitleBinding

class DetailRecyclerViewAdapter(private val context: Context) : RecyclerView.Adapter<RecyclerViewHolder>() {
    private val items = arrayListOf<Any>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return when(viewType){
            TYPE_TITLE -> RecyclerViewHolder.TitleViewHolder(
                ListTitleBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ),context
            )
            TYPE_ATTENDEES-> RecyclerViewHolder.AttendeesViewHolder(
                ListAttendeesBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ),context
            )
            TYPE_MEETING_INFO -> RecyclerViewHolder.MeetingInfoViewHolder(
                ListMeetinginfoBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ),context
            )
            TYPE_HISTORY->RecyclerViewHolder.HistoryViewHolder(
                ListHistoryBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                ),context
            )
            else -> throw IllegalArgumentException("Invalid ViewType Provided")
        }
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        when(holder){
            is RecyclerViewHolder.MeetingInfoViewHolder -> holder.bind(items[position] as DetailRecyclerViewItem.MeetingInfo)
            is RecyclerViewHolder.AttendeesViewHolder -> holder.bind(items[position] as DetailRecyclerViewItem.Attendees)
            is RecyclerViewHolder.TitleViewHolder -> holder.bind(items[position] as DetailRecyclerViewItem.Title)
            is RecyclerViewHolder.HistoryViewHolder -> holder.bind(items[position] as DetailRecyclerViewItem.History)
        }
    }

    override fun getItemCount() = items.size

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is DetailRecyclerViewItem.MeetingInfo -> TYPE_MEETING_INFO
            is DetailRecyclerViewItem.Attendees -> TYPE_ATTENDEES
            is DetailRecyclerViewItem.Title -> TYPE_TITLE
            is DetailRecyclerViewItem.History -> TYPE_HISTORY
            else -> throw IllegalArgumentException("Invalid Item")
        }
    }
    fun updateList(updatedList : List<Any> ){
        items.clear()
        items.addAll(updatedList)
        notifyDataSetChanged()
    }
}