package whoisabel.com.androidbasicsinkotlin.unit1.pathWay4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import whoisabel.com.androidbasicsinkotlin.R

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */

class RollDiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)

        val rollButton = findViewById<Button>(R.id.btn_roll)
        //val resultTextView = findViewById<TextView>(R.id.tv_roll)
        rollButton.setOnClickListener {
            //Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_LONG).show()
            //resultTextView.text = "6"
            rollDice()
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Find the ImageView in the layout
        val diceImage = findViewById<ImageView>(R.id.iv_roll)

        // Determine which drawable resource ID to use based on the dice roll
        val diceImageResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(diceImageResource)
    }
}