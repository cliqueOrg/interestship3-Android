package com.wecure.patient

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AppointmentDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointmentdetails_doctor)
        supportActionBar?.hide()
    }
}