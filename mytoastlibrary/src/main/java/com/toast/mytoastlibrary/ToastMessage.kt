package com.toast.mytoastlibrary

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso
import es.dmoral.toasty.Toasty


/**
 * Created by Aashis on 3/10/2022.
 */
class ToastMessage {

    fun myToast(c: Context?, message: String?) {
        Toasty.error(c!!, message!!, Toast.LENGTH_SHORT, true).show()
    }

    fun customToast(context: Context, imageView: ImageView, url: String) {
/*
        val customLayout = LinearLayout.inflate(context, R.layout.toast_custom, null)

        val imageView = customLayout.findViewById<ImageView>(R.id.imvLayout)
        val msgText = customLayout.findViewById<TextView>(R.id.text)

        msgText.text = toastText
*/

        Picasso.get().load(url).into(imageView);
/*
        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.BOTTOM, 0, 0)
        toast.view = customLayout
        toast.show()
*/

    }

    /*   fun showToast() {
           val inflater = layoutInflater
           val layout: View = inflater.inflate(
               android.R.layout.,
               findViewById<View>(android.R.id.toast_root) as ViewGroup
           )
           val toastText: TextView = layout.findViewById(android.R.id.toast_text)
           val toastImage: ImageView = layout.findViewById(android.R.id.toast_image)
           toastText.text = "This is a different text"
   //        toastImage.setImageResource(R.drawable.ic_toasticon)
           val toast = Toast(applicationContext)
           toast.setGravity(Gravity.CENTER, 0, 0)
           toast.duration = Toast.LENGTH_LONG
           toast.setView(layout)
           toast.show()
       }*/

    fun showShortToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show()
    }

}