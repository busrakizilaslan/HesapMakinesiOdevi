package com.busrayalcin.hesapmakinesiodevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.busrayalcin.hesapmakinesiodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var girilenSayi = 0
    var toplam = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView0.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 0
            }else{
                girilenSayi = 0
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView1.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 1
            }else{
                girilenSayi = 1
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView2.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 2
            }else{
                girilenSayi = 2
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView3.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 3
            }else{
                girilenSayi = 3
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView4.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 4
            }else{
                girilenSayi = 4
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView5.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 5
            }else{
                girilenSayi = 5
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView6.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 6
            }else{
                girilenSayi = 6
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView7.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 7
            }else{
                girilenSayi = 7
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView8.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 8
            }else{
                girilenSayi = 8
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageView9.setOnClickListener {
            if (girilenSayi > 0){
                girilenSayi = (girilenSayi * 10) + 9
            }else{
                girilenSayi = 9
            }
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageViewToplama.setOnClickListener {
            toplam += girilenSayi
            girilenSayi = 0
            binding.textViewSonuc.text = "$toplam"
        }

        binding.imageViewSifirlama.setOnClickListener {
            girilenSayi = 0
            toplam = 0
            binding.textViewSonuc.text = "$toplam"
        }

        binding.imageViewSilme.setOnClickListener {
            girilenSayi = (girilenSayi - (girilenSayi % 10)) / 10
            binding.textViewSonuc.text = "$girilenSayi"
        }

        binding.imageViewEsittir.setOnClickListener {
            toplam += girilenSayi
            girilenSayi = 0
            binding.textViewSonuc.text = "$toplam"
        }
    }
}