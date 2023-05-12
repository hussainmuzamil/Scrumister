package com.example.projectscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class AddScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_screen)
    }

    fun addAttendees(view: View) {
        showEditTextDialog()

    }
    private fun showEditTextDialog(){
        val builder = AlertDialog.Builder(this)
        val dialogLayout = LayoutInflater.from(this).inflate(R.layout.edit_text_layout,null)
        val editText = dialogLayout.findViewById<EditText>(R.id.edit_text)
        with(builder){
            setTitle("Enter some text!")
            setPositiveButton("OK"){dialog,which->
                Log.d("Main","Positive button clicked")
                //here use this to add elements in recycler view row or list
            }
            setNegativeButton("Cancel"){
                dialog,which->
                Log.d("Main","Negative button clicked")
            }
            setView(dialogLayout)
            show()

        }
    }
}