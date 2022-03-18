package com.toast.mytoast

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import com.toast.mytoastlibrary.ToastMessage


class MainActivity : AppCompatActivity() {

    lateinit var imvPicassso: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imvPicassso = findViewById(R.id.imvPicassso)

    /*    Glide.with(this)
            .load("https://cdn2.iconfinder.com/data/icons/sports-i-color/300/25-512.png")
            .centerCrop()
            .into(imvPicassso)*/
//        ToastMessage().myToast(this, "Hello")
//        ToastMessage().loadProfile("https://cdn2.iconfinder.com/data/icons/sports-i-color/300/25-512.png", imvPicassso)

       ToastMessage().customToast(this, imvPicassso, "https://i.imgur.com/DvpvklR.png")


        ToastMessage().myToast(this, "This is Toast Message")
    }


}