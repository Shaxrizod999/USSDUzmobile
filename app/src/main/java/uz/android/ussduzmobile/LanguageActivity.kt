package uz.android.ussduzmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.android.ussduzmobile.databinding.ActivityLanguageBinding

class LanguageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLanguageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.uzbek.setOnClickListener{
            val intent = Intent(this@LanguageActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}