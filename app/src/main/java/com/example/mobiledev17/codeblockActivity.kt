package com.example.mobiledev17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class codeblockActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_codeblock)

        val drawerLayout:DrawerLayout= findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle (this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId)
            {   R.id.nav_home->this.finish()
                R.id.nav_intVar-> Toast.makeText(applicationContext,"Created Integer variable",Toast.LENGTH_SHORT).show()
                R.id.nav_assignValtoVar-> Toast.makeText(applicationContext,"Created Assigning value",Toast.LENGTH_SHORT).show()
                R.id.nav_arithmeticExp-> Toast.makeText(applicationContext,"Created Arithmetic Expression",Toast.LENGTH_SHORT).show()
                R.id.nav_if-> Toast.makeText(applicationContext,"Created If",Toast.LENGTH_SHORT).show()
//PS: можно написать функцию, которая будет вызываться при нажатии кнопки)))
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
        {return true}
        return super.onOptionsItemSelected(item)
    }

}