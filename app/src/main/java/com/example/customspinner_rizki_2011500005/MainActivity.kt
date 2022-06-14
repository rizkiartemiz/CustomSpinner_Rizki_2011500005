package com.example.customspinner_rizki_2011500005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    val nama=arrayOf(
        "Kota Pangkalpinang", "Kabupaten Bangka", "Kabupaten Bangka Barat",
        "Kabupaten Bangka Tengah", "Kabupaten Bangka Selatan", "Kabupaten Belitung",
        "Kabupaten Belitung Timur"
    )
    val logo= intArrayOf(
        R.drawable.logo_pkp,R.drawable.logo_bangka,R.drawable.logo_babar,R.drawable.logo_bateng,
        R.drawable.logo_basel,R.drawable.logo_belitung,R.drawable.logo_belitung_timur
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spnKabKota=findViewById<Spinner>(R.id.spnKabKota)

        val adpKabKota=KabKota(this@MainActivity,logo,nama)
        spnKabKota.adapter = adpKabKota
    }
}