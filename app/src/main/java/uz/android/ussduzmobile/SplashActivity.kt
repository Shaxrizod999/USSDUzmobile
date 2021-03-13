package uz.android.ussduzmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import uz.android.ussduzmobile.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val timer = object: CountDownTimer(3000, 1000)
        {
            override fun onTick(millisUntilFinished: Long) {

            }
            override fun onFinish() {
                val intent = Intent(this@SplashActivity, LanguageActivity::class.java)
                startActivity(intent)
            }
        }
        timer.start()
    }
}