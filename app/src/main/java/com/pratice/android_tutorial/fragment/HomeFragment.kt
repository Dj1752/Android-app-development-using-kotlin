package com.pratice.android_tutorial.fragment

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.pratice.android_tutorial.ConstraintLayout
import com.pratice.android_tutorial.CustomListView
import com.pratice.android_tutorial.FrameLayout
import com.pratice.android_tutorial.LinearLayouts
import com.pratice.android_tutorial.ListViewfile
import com.pratice.android_tutorial.R
import com.pratice.android_tutorial.RecycleViewPage
import com.pratice.android_tutorial.RelativelLayouts
import com.pratice.android_tutorial.SharePreference
import com.pratice.android_tutorial.TabLayouts
import com.pratice.android_tutorial.ViewElements

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for activity fragment
        val view  =  inflater.inflate(R.layout.fragment_home, container, false)
        val linearLayoutbtn: Button = view.findViewById(R.id.Linearlayoutbt)
        val RelativelLayoutbtn: Button = view.findViewById(R.id.Relativelayoutbt)
        val ConstraintLayouts: Button = view.findViewById(R.id.constraintlayoutbt)
        val FrameLayouts: Button = view.findViewById(R.id.framelayoutbt)
        val viewElementlayoutbt: Button = view.findViewById(R.id.viewElementlayoutbt)
        val implicitbt: Button = view.findViewById(R.id.implicitbt)
        val ListViewbt: Button = view.findViewById(R.id.ListViewbt)
        val CustListViewbt: Button = view.findViewById(R.id.CustListViewbt)
        val RecycleViewbt: Button = view.findViewById(R.id.RecycleViewbt)
        val Fragmentlayoutbt: Button = view.findViewById(R.id.Fragmentlayoutbt)
        val Customdialogbt: Button = view.findViewById(R.id.Customdialogbt)
        val BottomSheetdialogbt: Button = view.findViewById(R.id.BottomSheetdialogbt)
        val TabLayoutbt: Button = view.findViewById(R.id.TabLayoutbt)
        val SharePreferencebt: Button = view.findViewById(R.id.SharePreferencebt)

        linearLayoutbtn.setOnClickListener{
            val intent = Intent(activity, LinearLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        RelativelLayoutbtn.setOnClickListener{
            val intent = Intent(activity, RelativelLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        ConstraintLayouts.setOnClickListener{
            val intent = Intent(activity, ConstraintLayout::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        FrameLayouts.setOnClickListener{
            val intent = Intent(activity, FrameLayout::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        viewElementlayoutbt.setOnClickListener{
            val intent = Intent(activity, ViewElements::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        ListViewbt.setOnClickListener{
            val intent = Intent(activity, ListViewfile::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        CustListViewbt.setOnClickListener{
            val intent = Intent(activity, CustomListView::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        RecycleViewbt.setOnClickListener{
            val intent = Intent(activity, RecycleViewPage::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        Fragmentlayoutbt.setOnClickListener{
            val intent = Intent(activity,FragmentPage::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        Customdialogbt.setOnClickListener {
            val message= "Do you really want to logout ??"
            showdialog(message)
        }

        BottomSheetdialogbt.setOnClickListener {
            val dialog = BottomSheetDialog(requireActivity())
            val view  = layoutInflater.inflate(R.layout.bottom_sheet_dialog,null)
            val btnclose =  view.findViewById<Button>(R.id.idBtnDismiss)
            btnclose.setOnClickListener{
                dialog.dismiss()
            }
            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }

        implicitbt.setOnClickListener{
            val url = "https://www.geeksforgeeks.org/implicit-and-explicit-intents-in-android-with-examples/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))//Implicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        TabLayoutbt.setOnClickListener{
            val intent = Intent(activity, TabLayouts::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
        SharePreferencebt.setOnClickListener{
            val intent = Intent(activity, SharePreference::class.java)//Explicit Intent
            startActivity(intent)
            Toast.makeText(activity,"Clicked", Toast.LENGTH_SHORT).show()
        }
     
        return view

    }

    private fun showdialog(message: String) {
        val dialog = Dialog(requireActivity())
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_box)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        val tvMessage: TextView = dialog.findViewById(R.id.titletxt)
        val yesbtn: TextView = dialog.findViewById(R.id.yesbtn)
        val nobtn: TextView = dialog.findViewById(R.id.nobtn)

        tvMessage.setText(message)
        yesbtn.setOnClickListener{
            Toast.makeText(activity,"Clicked Yes",Toast.LENGTH_SHORT).show()
        }
        nobtn.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()

    }
}