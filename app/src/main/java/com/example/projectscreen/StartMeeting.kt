package com.example.projectscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StartMeeting : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var progressBar2: ProgressBar? = null
    private var txtView1: TextView? = null
    private var txtView2: TextView? = null
    private val handler = Handler()
    private var i = 0
    private var t1 = 0
    private var t2 = 0
    private  var totalTime = 544
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_meeting)
        progressBar = findViewById<ProgressBar>(R.id.progressBar) as ProgressBar
        progressBar2 = findViewById<ProgressBar>(R.id.mainProgressBar) as ProgressBar
        txtView2 = findViewById<TextView>(R.id.textView12) as TextView
        txtView1 = findViewById<TextView>(R.id.textView11) as TextView

    }

     fun recordMeeting(view: View) {
        progressBar?.visibility  = View.VISIBLE

        i = progressBar!!.progress
        Thread(Runnable {
            // this loop will run until the value of i becomes 99
            while (i < totalTime) {
                i += 1
                runOnUiThread {
                    txtView2?.text  = ""+i
                    txtView1?.text  = ""+(totalTime-i)
                }
                // Update the progress bar and display the current value
                if(i%10 ==0) {
                    t1 +=1
                    handler.post(Runnable {
                        progressBar!!.progress = t1
                        // setting current progress to the textview
                    })
                }
                try {
                    Thread.sleep(1000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
            // setting the visibility of the progressbar to invisible
            // or you can use View.GONE instead of invisible
            // View.GONE will remove the progressbar
            //progressBar!!.visibility = View.INVISIBLE

        }).start()
         progressBar!!.progress = 0
         progressBar2?.visibility  = View.VISIBLE
         Thread(Runnable {
             // this loop will run until the value of i becomes 99
             while (i < totalTime) {
                 i += 1
                 // Update the progress bar and display the current value

                 handler.post(Runnable {
                     progressBar2!!.progress = i
                         // setting current progress to the textview
                 })
                 try {
                     Thread.sleep(60000)
                 } catch (e: InterruptedException) {
                     e.printStackTrace()
                 }
             }

             // setting the visibility of the progressbar to invisible
             // or you can use View.GONE instead of invisible
             // View.GONE will remove the progressbar
             //progressBar!!.visibility = View.INVISIBLE

         }).start()
        progressBar2!!.progress = 0
    }
}