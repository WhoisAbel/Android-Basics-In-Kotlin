package whoisabel.com.androidbasicsinkotlin.unit2.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityAffirmationsBinding
import whoisabel.com.androidbasicsinkotlin.unit2.affirmations.adapter.AffirmationAdapter
import whoisabel.com.androidbasicsinkotlin.unit2.affirmations.data.DataSource

class AffirmationsActivity : AppCompatActivity() {

    lateinit var binding: ActivityAffirmationsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAffirmationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize data.
        val myDataset = DataSource().loadAffirmations()

        binding.rvAffirmations.adapter = AffirmationAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        binding.rvAffirmations.setHasFixedSize(true)
    }

}