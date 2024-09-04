package com.example.toolbar

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toolbar.R.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            id.action_one -> {
                Toast.makeText(this, "click en herramientas", Toast.LENGTH_SHORT).show()
                true
            }
            id.action_two -> {
                Toast.makeText(this, "click en llamadas", Toast.LENGTH_SHORT).show()
                true
            }

            id.action_four -> {
                Toast.makeText(this, "click en opcion 1 ", Toast.LENGTH_SHORT).show()
                true
            }
            id.action_five -> {
                Toast.makeText(this, "click en opcion 2", Toast.LENGTH_SHORT).show()
                true
            }
            id.action_six -> {
                Toast.makeText(this, "click en opcion 3", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
    }
}
}