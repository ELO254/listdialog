package com.example.commentsdialog

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AlertDialogLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var comment:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        comment = findViewById(R.id.btncomment)

        var it = listOf(Items(R.drawable.nikecanvas, "nike"),
            Items(R.drawable.nikerunners, "nike runners")
        )
        
        var adapter = baseAdapter(it)

        comment.setOnClickListener {
            var dialogAlert = AlertDialog.Builder(this)
            dialogAlert.setTitle("comments")
            
            dialogAlert.setAdapter(adapter){dialogAlert, click ->
                Toast.makeText(this, "${click}", Toast.LENGTH_SHORT).show()
            }

            dialogAlert.setPositiveButton("ok"){dialogAlert, click ->
                dialogAlert.dismiss()

            }
            dialogAlert.create()
            dialogAlert.show()

        }

    }
}