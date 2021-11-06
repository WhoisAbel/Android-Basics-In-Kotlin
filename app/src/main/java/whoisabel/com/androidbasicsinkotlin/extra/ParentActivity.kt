package whoisabel.com.androidbasicsinkotlin.extra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import whoisabel.com.androidbasicsinkotlin.R
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityParentBinding

class ParentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityParentBinding

    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            btnActionBar.setOnClickListener { launchActionBarActivity() }
            btnToolbar.setOnClickListener { launchToolbarActivity() }
            btnAppBar.setOnClickListener { launchAppBarActivity() }
        }
    }


    private fun launchActionBarActivity() {
        listIntent = Intent(this, ActionBarActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchToolbarActivity() {
        listIntent = Intent(this, ToolbarActivity::class.java)
        startActivity(listIntent)
    }

    private fun launchAppBarActivity() {
        listIntent = Intent(this, ActionBarActivity::class.java)
        startActivity(listIntent)
    }
}