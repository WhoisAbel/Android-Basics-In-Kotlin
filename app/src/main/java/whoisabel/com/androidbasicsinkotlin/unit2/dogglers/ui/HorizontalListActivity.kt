package whoisabel.com.androidbasicsinkotlin.unit2.dogglers.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import whoisabel.com.androidbasicsinkotlin.R
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityHorizontalListBinding
import whoisabel.com.androidbasicsinkotlin.unit2.dogglers.adapter.DogCardAdapter
import whoisabel.com.androidbasicsinkotlin.unit2.dogglers.const.Layout

class HorizontalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )

        // Specify fixed size to improve performance
        binding.horizontalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
