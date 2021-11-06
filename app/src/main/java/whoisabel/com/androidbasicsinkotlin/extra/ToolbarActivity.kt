package whoisabel.com.androidbasicsinkotlin.extra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityToolbarBinding

class ToolbarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityToolbarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityToolbarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.toolbar.setNavigationOnClickListener { finish() }
    }
}