package com.rafael.dados


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.rafael.dados.databinding.ActivityMainBinding
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMain.setOnClickListener {
            binding.imvDice.apply {
                animate().rotationXBy(180F).rotationYBy(180F)
                val number = (1..6).random()
                when (number) {

                    1 -> binding.imvDice.setImageResource(R.drawable.dice1)
                    2 -> binding.imvDice.setImageResource(R.drawable.dice2)
                    3 -> binding.imvDice.setImageResource(R.drawable.dice3)
                    4 -> binding.imvDice.setImageResource(R.drawable.dice4)
                    5 -> binding.imvDice.setImageResource(R.drawable.dice5)
                    else -> binding.imvDice.setImageResource(R.drawable.dice6)
                }
            }
        }
    }
}