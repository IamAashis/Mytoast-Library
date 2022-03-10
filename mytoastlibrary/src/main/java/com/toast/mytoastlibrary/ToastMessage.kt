package com.toast.mytoastlibrary

import android.content.Context
import android.widget.Toast


/**
 * Created by Aashis on 3/10/2022.
 */
class ToastMessage {

    fun showShortToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_LONG).show()
    }

}