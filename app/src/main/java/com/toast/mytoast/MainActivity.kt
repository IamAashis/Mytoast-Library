package com.toast.mytoast

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.toast.mytoastlibrary.ToastMessage


class MainActivity : AppCompatActivity() {

    lateinit var btnToastTestOne: AppCompatButton
    lateinit var btnToastTestTwo: AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnToastTestOne = findViewById(R.id.btnToastTestOne)
        btnToastTestTwo = findViewById(R.id.btnToastTestTwo)

//        ToastMessage().customToast(this, imvPicassso, "https://i.imgur.com/DvpvklR.png")

        btnToastTestOne.setOnClickListener {
            ToastMessage().showToastWithIcon(
                this,
                "test success",
                ContextCompat.getDrawable(this, android.R.drawable.ic_lock_idle_alarm)
            )
        }

        btnToastTestTwo.setOnClickListener {
            ToastMessage().showToastWithIcon(
                this,
                "testsuccess",
                url = "https://i.imgur.com/DvpvklR.png"
            )
        }

    }
}