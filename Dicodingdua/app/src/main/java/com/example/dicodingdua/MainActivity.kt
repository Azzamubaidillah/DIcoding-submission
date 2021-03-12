package com.example.dicodingdua

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnData: Button = findViewById(R.id.btn_move_with_data)
        btnData.setOnClickListener(this)

        val btnDial: Button = findViewById(R.id.btn_dial)
        btnDial.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
        }

        when (v?.id) {
            R.id.btn_move_with_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "KotlinBoy")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveWithDataIntent)
            }
        }

        when (v?.id) {
            R.id.btn_dial -> {
                val number = "085155351216"
                val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
                startActivity(dialIntent)
            }
        }
    }
}