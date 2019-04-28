package edu.washington.alkwan.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var player01Life: TextView
    lateinit var player02Life: TextView
    lateinit var player03Life: TextView
    lateinit var player04Life: TextView

    lateinit var player01PlusFive: Button
    lateinit var player01PlusOne: Button
    lateinit var player01MinusFive: Button
    lateinit var player01MinusOne: Button

    lateinit var player02PlusFive: Button
    lateinit var player02PlusOne: Button
    lateinit var player02MinusFive: Button
    lateinit var player02MinusOne: Button

    lateinit var player03PlusFive: Button
    lateinit var player03PlusOne: Button
    lateinit var player03MinusFive: Button
    lateinit var player03MinusOne: Button

    lateinit var player04PlusFive: Button
    lateinit var player04PlusOne: Button
    lateinit var player04MinusFive: Button
    lateinit var player04MinusOne: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        player01Life = findViewById(R.id.player_01_life)
        player02Life = findViewById(R.id.player_02_life)
        player03Life = findViewById(R.id.player_03_life)
        player04Life = findViewById(R.id.player_04_life)

        player01PlusFive = findViewById(R.id.button_plus_five_01)
        player01PlusOne = findViewById(R.id.button_plus_01)
        player01MinusOne = findViewById(R.id.button_minus_01)
        player01MinusFive = findViewById(R.id.button_minus_five_01)

        player02PlusFive = findViewById(R.id.button_plus_five_02)
        player02PlusOne = findViewById(R.id.button_plus_02)
        player02MinusOne = findViewById(R.id.button_minus_02)
        player02MinusFive = findViewById(R.id.button_minus_five_02)

        player03PlusFive = findViewById(R.id.button_plus_five_03)
        player03PlusOne = findViewById(R.id.button_plus_03)
        player03MinusOne = findViewById(R.id.button_minus_03)
        player03MinusFive = findViewById(R.id.button_minus_five_03)

        player04PlusFive = findViewById(R.id.button_plus_five_04)
        player04PlusOne = findViewById(R.id.button_plus_04)
        player04MinusOne = findViewById(R.id.button_minus_04)
        player04MinusFive = findViewById(R.id.button_minus_five_04)

        player01PlusFive.setOnClickListener {
            addFive(player01Life)
        }

        player01PlusOne.setOnClickListener {
            addOne(player01Life)
        }

        player01MinusOne.setOnClickListener {
            subtractOne(player01Life, "Player 01")
        }

        player01MinusFive.setOnClickListener {
            subtractFive(player01Life, "Player 01")
        }

        player02PlusFive.setOnClickListener {
            addFive(player02Life)
        }

        player02PlusOne.setOnClickListener {
            addOne(player02Life)
        }

        player02MinusOne.setOnClickListener {
            subtractOne(player02Life, "Player 02")
        }

        player02MinusFive.setOnClickListener {
            subtractFive(player02Life, "Player 02")
        }

        player03PlusFive.setOnClickListener {
            addFive(player03Life)
        }

        player03PlusOne.setOnClickListener {
            addOne(player03Life)
        }

        player03MinusOne.setOnClickListener {
            subtractOne(player03Life, "Player 03")
        }

        player03MinusFive.setOnClickListener {
            subtractFive(player03Life, "Player 03")
        }

        player04PlusFive.setOnClickListener {
            addFive(player04Life)
        }

        player04PlusOne.setOnClickListener {
            addOne(player04Life)
        }

        player04MinusOne.setOnClickListener {
            subtractOne(player04Life, "Player 04")
        }

        player04MinusFive.setOnClickListener {
            subtractFive(player04Life, "Player 04")
        }
    }

    private fun addFive(life : TextView) {
        var lifePoints = life.text.toString().toInt()
        lifePoints += 5
        life.text = lifePoints.toString()
    }

    private fun addOne(life: TextView) {
        var lifePoints = life.text.toString().toInt()
        lifePoints++
        life.text = lifePoints.toString()
    }

    private fun subtractOne(life: TextView, player: String) {
        var lifePoints = life.text.toString().toInt()
        lifePoints--
        life.text = lifePoints.toString()
        if (lifePoints <= 0) {
            val text = "$player LOSES!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }

    private fun subtractFive(life: TextView, player: String) {
        var lifePoints = life.text.toString().toInt()
        lifePoints -= 5
        life.text = lifePoints.toString()
        if (lifePoints <= 0) {
            val text = "$player LOSES!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}
