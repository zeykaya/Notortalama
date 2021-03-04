package com.kaya.notortalama

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kaya.notortalama.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonHesapla.setOnClickListener {
            if (binding.editTextNumber1.text.isNotEmpty() && binding.editTextNumber2.text.isNotEmpty()) {
                var sinav1 = binding.editTextNumber1.text.toString().toInt()
                var sinav2 = binding.editTextNumber2.text.toString().toInt()
                var ortalama: Double = ((sinav1 * 40 / 100) + (sinav2 * 60 / 100)).toDouble()

                if (ortalama >=50) {
                    binding.sonucText.text = ortalama.toString() + " " + "Geçtiniz"
                    binding.sonucText.setTextColor(getColor(R.color.green))

                }
                else {
                    binding.sonucText.text = ortalama.toString() + " " + "Kaldınız"
                    binding.sonucText.setTextColor(getColor(R.color.red))

                }


            } else {
                binding.sonucText.text = "Sınav Notunuzu Giriniz"
                binding.sonucText.setTextColor(getColor(R.color.red))

            }
        }
    }
}