package ro.pub.cs.systems.eim.practicaltest01var06

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var06MainActivity : AppCompatActivity() {

    val possible = listOf("1", "2", "3", "*")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var06_main)

        val playButton = findViewById<Button>(R.id.playButton)
        val computeButton = findViewById<Button>(R.id.compute)
        val check1 = findViewById<CheckBox>(R.id.check1)
        val check2 = findViewById<CheckBox>(R.id.check2)
        val check3 = findViewById<CheckBox>(R.id.check3)
        val text1 = findViewById<TextView>(R.id.text1)
        val text2 = findViewById<TextView>(R.id.text2)
        val text3 = findViewById<TextView>(R.id.text3)

        playButton.setOnClickListener {
            val t1 = possible.random()
            val t2 = possible.random()
            val t3 = possible.random()
            if (!check1.isChecked) {
                text1.text = t1
            }
            if (!check2.isChecked) {
                text2.text = t2
            }
            if (!check3.isChecked) {
                text3.text = t3
            }
        }

    }
}