package com.ajisetyawan.tugasactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ajisetyawan.tugasactivity.R.id.btnPindahActivityIntentBundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnPindahActivityExplisit.setOnClickListener {
            startActivity(Intent(this, ExplisitIntenActivity::class.java))
        }
        btnPindahActivityImplisit.setOnClickListener {
            startActivity(Intent(this, ImplisitIntenActivity::class.java))
        }
        btnPindahActivityIntentBundle.setOnClickListener {
            val intent:Intent = Intent(this, IntenBundleActivity::class.java)
            intent.putExtra("NAMA", "Nama : Ahmad Aji Nursetyawan")
            intent.putExtra("NPM", "NPM : 16670003")
            intent.putExtra("KELAS", "Kelas : Informatika 6A")
            intent.putExtra("FOTO", "R.drawable.ajii")
            intent.putExtra("IG", "IG : kak.ajisetyawan")
            startActivity(intent)
        }
    }
}
