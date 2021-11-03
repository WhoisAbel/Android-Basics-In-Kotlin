package whoisabel.com.androidbasicsinkotlin.unit2.dogglers.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import whoisabel.com.androidbasicsinkotlin.R
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityVerticalListBinding
import whoisabel.com.androidbasicsinkotlin.unit2.dogglers.adapter.DogCardAdapter
import whoisabel.com.androidbasicsinkotlin.unit2.dogglers.const.Layout

class VerticalListActivity  : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.VERTICAL
        )

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
