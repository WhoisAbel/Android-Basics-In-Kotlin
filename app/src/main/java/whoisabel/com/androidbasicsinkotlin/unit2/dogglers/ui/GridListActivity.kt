package whoisabel.com.androidbasicsinkotlin.unit2.dogglers.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import whoisabel.com.androidbasicsinkotlin.R
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityGridListBinding
import whoisabel.com.androidbasicsinkotlin.unit2.dogglers.adapter.DogCardAdapter
import whoisabel.com.androidbasicsinkotlin.unit2.dogglers.const.Layout

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}