package com.pratice.android_tutorial

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.pratice.android_tutorial.fragment.FragmentPage

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val linearLayoutbtn: Button = findViewById(R.id.Linearlayoutbt)
        val RelativelLayoutbtn: Button = findViewById(R.id.Relativelayoutbt)
        val ConstraintLayouts: Button = findViewById(R.id.constraintlayoutbt)
        val FrameLayouts: Button = findViewById(R.id.framelayoutbt)
        val viewElementlayoutbt: Button = findViewById(R.id.viewElementlayoutbt)
        val implicitbt: Button = findViewById(R.id.implicitbt)
        val ListViewbt: Button = findViewById(R.id.ListViewbt)
        val CustListViewbt: Button = findViewById(R.id.CustListViewbt)
        val RecycleViewbt: Button = findViewById(R.id.RecycleViewbt)
        val Fragmentlayoutbt: Button = findViewById(R.id.Fragmentlayoutbt)
        val Customdialogbt: Button = findViewById(R.id.Customdialogbt)
        val BottomSheetdialogbt: Button = findViewById(R.id.BottomSheetdialogbt)


        linearLayoutbtn.setOnClickListener{
         val intent = Intent(this,LinearLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        RelativelLayoutbtn.setOnClickListener{
         val intent = Intent(this,RelativelLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        ConstraintLayouts.setOnClickListener{
         val intent = Intent(this,ConstraintLayout::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        FrameLayouts.setOnClickListener{
         val intent = Intent(this,FrameLayout::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        viewElementlayoutbt.setOnClickListener{
         val intent = Intent(this,ViewElements::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        ListViewbt.setOnClickListener{
         val intent = Intent(this,ListViewfile::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        CustListViewbt.setOnClickListener{
         val intent = Intent(this,CustomListView::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        RecycleViewbt.setOnClickListener{
         val intent = Intent(this,RecycleViewPage::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        Fragmentlayoutbt.setOnClickListener{
         val intent = Intent(this,FragmentPage::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }
        Customdialogbt.setOnClickListener {
            val message= "Do you really want to logout ??"
            showdialog(message)
        }

        BottomSheetdialogbt.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view  = layoutInflater.inflate(R.layout.bottom_sheet_dialog,null)
            val btnclose =  view.findViewById<Button>(R.id.idBtnDismiss)
            btnclose.setOnClickListener{
                dialog.dismiss()
            }
            dialog.setCancelable(false)
            dialog.show()
        }

        implicitbt.setOnClickListener{
            val url = "https://www.geeksforgeeks.org/implicit-and-explicit-intents-in-android-with-examples/"
         val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))//Implicit Intent
            startActivity(intent)
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
        }


    }

    private fun showdialog(message: String) {
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_box)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val tvMessage:TextView = dialog.findViewById(R.id.titletxt)
        val yesbtn:TextView = dialog.findViewById(R.id.yesbtn)
        val nobtn:TextView = dialog.findViewById(R.id.nobtn)

        tvMessage.setText(message)
        yesbtn.setOnClickListener{
            Toast.makeText(this,"Clicked Yes",Toast.LENGTH_SHORT).show()
        }
        nobtn.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()

    }

}