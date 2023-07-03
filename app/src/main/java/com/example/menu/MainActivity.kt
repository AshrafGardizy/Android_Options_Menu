package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.myToolbar))
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

    //Attach xml menu file (my_menu.xml) to Main Activity
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.my_menu,menu)
        return true
    }
    //Menu Item event
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.newMenu -> Toast.makeText(this,"New is clicked",Toast.LENGTH_SHORT).show()
            R.id.saveMenu -> Toast.makeText(this,"Save is clicked",Toast.LENGTH_SHORT).show()
            R.id.saveasMenu -> Toast.makeText(this,"Save As is clicked",Toast.LENGTH_SHORT).show()
            R.id.editMenu -> Toast.makeText(this,"Edit is clicked",Toast.LENGTH_SHORT).show()
            R.id.exitMenu -> Toast.makeText(this,"Exit is clicked",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}