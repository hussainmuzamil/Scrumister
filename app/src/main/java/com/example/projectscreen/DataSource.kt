package com.example.projectscreen
 object DataSource {
     const val TYPE_TITLE = 0
     const val TYPE_MEETING_INFO = 1
     const val TYPE_ATTENDEES = 2
     const val TYPE_HISTORY = 3

     fun getItems(item: ScrumModel) : ArrayList<Any>{
         val itemList =  arrayListOf<Any>()
         //itemList.add(DetailRecyclerViewItem.Title(1,"Meeting info"))
        // itemList.add(DetailRecyclerViewItem.Title(2,"Attendees"))
         //itemList.add(DetailRecyclerViewItem.Title(4,"History"))
         //itemList.add(DetailRecyclerViewItem.MeetingInfo(1,"Start Meeting",">",R.drawable.timer,R.color.white))
//         for (i in list.indices) {
//
//             itemList.add(DetailRecyclerViewItem.MeetingInfo(2,
//                 "Length",
//                 ""+ list[i].lengthInMinutes+"minutes"
//                 ,R.drawable.emptyhourglass,R.color.white))
//             itemList.add(DetailRecyclerViewItem.MeetingInfo(3,
//                 "Theme","Teal",
//                 R.drawable.paint_palette,R.color.teal_200))
//             val arr = list[i].attendees
//             for(l in arr.indices){
//                 itemList.add(DetailRecyclerViewItem.Attendees(l,arr[l]))
//             }
//             itemList.add(DetailRecyclerViewItem.History(1,"No History to show"))
//         }


         itemList.add(DetailRecyclerViewItem.Title(1,item.title))
         itemList.add(DetailRecyclerViewItem.Title(2,"Meeting info"))
         itemList.add(DetailRecyclerViewItem.MeetingInfo(1,"Start Meeting",">",R.drawable.timer,R.color.white))
         itemList.add(DetailRecyclerViewItem.MeetingInfo(2,"Length",item.title+"minutes",R.drawable.emptyhourglass,R.color.white))
         itemList.add(DetailRecyclerViewItem.MeetingInfo(3,"Theme","Teal",R.drawable.paint_palette,R.color.teal_200))

         itemList.add(DetailRecyclerViewItem.Title(3,"Attendees"))
         val arr = item.attendees
         for(l in arr.indices){
                 itemList.add(DetailRecyclerViewItem.Attendees(l,arr[l]))
         }

         itemList.add(DetailRecyclerViewItem.Title(4,"History"))
         itemList.add(DetailRecyclerViewItem.History(1,"No History to show"))
         return itemList
     }
}