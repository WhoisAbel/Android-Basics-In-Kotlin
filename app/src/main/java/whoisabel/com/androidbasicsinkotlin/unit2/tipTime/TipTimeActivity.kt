package whoisabel.com.androidbasicsinkotlin.unit2.tipTime

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import whoisabel.com.androidbasicsinkotlin.R
import whoisabel.com.androidbasicsinkotlin.databinding.ActivityTipTimeBinding
import java.text.NumberFormat
import kotlin.math.ceil

class TipTimeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTipTimeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTipTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnCalculateButton.setOnClickListener { calculateTip() }

    }


    private fun calculateTip() {

        val stringInTextField = binding.etCostOfService.text.toString()
        val cost = stringInTextField.toDoubleOrNull()
        if (cost == null) {
            binding.tvTipResult.text = ""
            return
        }
        val tipPercentage = when (binding.rgTipOptions.checkedRadioButtonId) {
            R.id.rb_option_twenty_percent -> 0.20
            R.id.rb_option_eighteen_percent -> 0.18
            else -> 0.15
        }

        var tip = tipPercentage * cost
        val roundUp = binding.swRoundUpSwitch.isChecked
        if (roundUp) {
            tip = ceil(tip)
        }

        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tvTipResult.text = getString(R.string.tip_amount, formattedTip)
        binding.btnCalculateButton.setOnKeyListener { view, keyCode, _ ->
            handleKeyEvent(
                view,
                keyCode
            )
        }
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            // Hide the keyboard
            val inputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
            return true
        }
        return false
    }

}