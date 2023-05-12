package com.example.projectscreen
 object DataSource {
     const val TYPE_TITLE = 0
     const val TYPE_MEETING_INFO = 1
     const val TYPE_ATTENDEES = 2
     const val TYPE_HISTORY = 3

     fun getItems() : ArrayList<Any>{
         val itemList =  arrayListOf<Any>()
         itemList.add(DetailRecyclerViewItem.Title(1,"Design"))
         itemList.add(DetailRecyclerViewItem.Title(2,"Meeting info"))
         itemList.add(DetailRecyclerViewItem.MeetingInfo(1,"Start Meeting",">",R.drawable.timer,R.color.white))
         itemList.add(DetailRecyclerViewItem.MeetingInfo(2,"Length","5 minutes",R.drawable.emptyhourglass,R.color.white))
         itemList.add(DetailRecyclerViewItem.MeetingInfo(3,"Theme","Teal",R.drawable.paint_palette,R.color.teal_200))

         itemList.add(DetailRecyclerViewItem.Title(3,"Attendees"))
         itemList.add(DetailRecyclerViewItem.Attendees(1,"Muzammil"))
         itemList.add(DetailRecyclerViewItem.Attendees(2,"Rafay"))
         itemList.add(DetailRecyclerViewItem.Attendees(3,"Hamza"))
         itemList.add(DetailRecyclerViewItem.Attendees(4,"Maaz"))

         itemList.add(DetailRecyclerViewItem.Title(4,"History"))
         itemList.add(DetailRecyclerViewItem.History(1,"No History to show"))


         return itemList
     }
}