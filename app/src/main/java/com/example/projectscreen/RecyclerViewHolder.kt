package com.example.projectscreen

//import androidx.databinding.tool.writer.ViewBinding
import android.content.Context
import android.graphics.Color
import android.text.SpannableStringBuilder
import androidx.core.content.ContextCompat
import androidx.core.text.color
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.projectscreen.databinding.ListAttendeesBinding
import com.example.projectscreen.databinding.ListHistoryBinding
import com.example.projectscreen.databinding.ListMeetinginfoBinding
import com.example.projectscreen.databinding.ListTitleBinding

sealed class RecyclerViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root) {

    class TitleViewHolder(private  val binding : ListTitleBinding,private val context : Context) : RecyclerViewHolder(binding){
        fun bind(title: DetailRecyclerViewItem.Title){
            binding.textView.text = title.title
        }
    }

    class AttendeesViewHolder(private val binding: ListAttendeesBinding,private val context : Context) : RecyclerViewHolder(binding){
        fun bind(attendees: DetailRecyclerViewItem.Attendees){
            binding.textView2.text = attendees.name
        }
    }

    class MeetingInfoViewHolder(private val binding: ListMeetinginfoBinding,private val context : Context) : RecyclerViewHolder(binding){
        fun bind(info: DetailRecyclerViewItem.MeetingInfo){
            binding.textView4.text = info.title
            binding.textView5.text = info.action
            binding.textView5.setBackgroundColor(ContextCompat.getColor(context,info.actionColorRes))
            binding.imageView3.setImageResource(info.drawable)

        }
    }
    class  HistoryViewHolder(private val binding: ListHistoryBinding,private val context: Context) : RecyclerViewHolder(binding){
        fun bind(infoViewHolder: DetailRecyclerViewItem.History){
            binding.textView3.text = infoViewHolder.title
        }
    }
}
