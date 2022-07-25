package com.toast.mytoastlibrary

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso


/**
 * Created by Aashis on 3/10/2022.
 */
class ToastMessage {
    private var imageView: ImageView? = null
    private var msgText: TextView? = null

    fun showShortToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show()
    }

    fun showToastWithIcon(
        context: Context,
        message: String?,
        icon: Drawable? = null,
        url: String? = null
    ) {
        customToast(context, icon, message, url)
    }

    private fun customToast(
        context: Context,
        imageViewDrawable: Drawable?,
        msg: String?,
        urlImageUrl: String?
    ) {
        val view = setLayout(context)
        msgText?.text = msg

        if (!urlImageUrl.isNullOrEmpty())
            Picasso.get().load(urlImageUrl).into(imageView)
        else
            imageView?.setImageDrawable(imageViewDrawable)

        val toast = Toast(context)
        toast.duration = Toast.LENGTH_SHORT
        toast.setGravity(Gravity.CENTER, 0, 0)
        toast.view = view
        toast.show()
    }

    private fun setLayout(context: Context): View? {
        val customLayout = LinearLayout.inflate(context, R.layout.toast_custom, null)

        imageView = customLayout.findViewById(R.id.imvToastImage)
        msgText = customLayout.findViewById(R.id.txvToastTitle)

        return customLayout.rootView
    }

    class toastSetup() {

    }
}