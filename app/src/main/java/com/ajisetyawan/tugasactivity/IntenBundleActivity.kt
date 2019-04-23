package com.ajisetyawan.tugasactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_inten_bundle.*

class IntenBundleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inten_bundle)

        val NAMA = intent.getStringExtra("NAMA")
        val NPM = intent.getStringExtra("NPM")
        val KELAS = intent.getStringExtra("KELAS")
        val FOTO = intent.getStringExtra("FOTO")
        val IG = intent.getStringExtra("IG")

        tvNamaku.text = NAMA
        tvNpm.text = NPM
        tvKelas.text = KELAS
        tvIg.text = IG
    }
}
