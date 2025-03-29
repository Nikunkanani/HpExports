package com.hpexports.Webservice

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.ConnectivityManager
import android.util.DisplayMetrics
import android.view.Gravity
import android.view.Window
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.hpexports.R


class Uttils(activity: FragmentActivity?) {
    init {
        uttils = this
    }

    companion object {
        lateinit var uttils: Uttils
        var dialoug_Progress: Dialog? = null
        var bl_Internet: Boolean = false

        fun getInternetConnection(context: Context): Boolean {
            val ConnectionManager =
                context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = ConnectionManager.activeNetworkInfo


            if (networkInfo != null && networkInfo.isConnected == true) {
                bl_Internet = true
            } else {
                bl_Internet = false
            }

            return bl_Internet
        }


        fun showToast(context: Context?, str_Message: String?) {
            val toast = Toast.makeText(context, str_Message, Toast.LENGTH_LONG)
            toast.show()
        }


        fun showProgressDialoug(context: Context) {
            val activity = context as Activity

            dialoug_Progress = Dialog(context)
            dialoug_Progress!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialoug_Progress!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialoug_Progress!!.window!!.setGravity(Gravity.CENTER)

            dialoug_Progress!!.setCanceledOnTouchOutside(true)

            //setting custom layout to dialog_car_variant
            dialoug_Progress!!.setContentView(R.layout.dialoug_progressbar)

            val displaymetrics = DisplayMetrics()
            activity.windowManager.defaultDisplay.getMetrics(displaymetrics)

            val height = displaymetrics.heightPixels
            val width = displaymetrics.widthPixels


            dialoug_Progress!!.window!!.setLayout(width, height)

            if (dialoug_Progress != null && !dialoug_Progress!!.isShowing) {
                dialoug_Progress!!.show()
            }
        }


        fun dismissDialoug() {
            if (dialoug_Progress != null && dialoug_Progress!!.isShowing) {
                dialoug_Progress!!.dismiss()
            }
        }
    }
}
