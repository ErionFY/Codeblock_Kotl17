package com.example.mobiledev17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.example.mobiledev17.databinding.ActivityCodeblockBinding
import com.example.mobiledev17.databinding.ActivityMainBinding

class CodeblockActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCodeblockBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCodeblockBinding.inflate(layoutInflater)
        setContentView(binding.root)

//------------------------------------------------- slidable menu with navigation drawer
        toggle = ActionBarDrawerToggle (this,binding.drawerLayout,R.string.open,R.string.close)
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.navView.setNavigationItemSelectedListener {
            when(it.itemId)
            {   R.id.nav_home->{ Toast.makeText(applicationContext,"Clicked Home",Toast.LENGTH_SHORT).show();   finish()}
                R.id.nav_intVar-> {Toast.makeText(applicationContext,"Created Integer variable",Toast.LENGTH_SHORT).show();     }
                R.id.nav_assignValtoVar->{ Toast.makeText(applicationContext,"Created Assigning value",Toast.LENGTH_SHORT).show();    }
                R.id.nav_arithmeticExp-> {Toast.makeText(applicationContext,"Created Arithmetic Expression",Toast.LENGTH_SHORT).show();   }
                R.id.nav_if-> {Toast.makeText(applicationContext,"Created If",Toast.LENGTH_SHORT).show()}

//PS: можно написать функцию, которая будет вызываться при нажатии кнопки)))
            }
            true
        }
//------------------------------------------------



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)

        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item))
        return true
        return super.onOptionsItemSelected(item)
    }

}