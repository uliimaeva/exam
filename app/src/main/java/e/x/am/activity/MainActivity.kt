package e.x.am.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneNumberFormattingTextWatcher
import android.view.View
import android.widget.ImageView
import androidx.core.view.isVisible
import e.x.am.R
import e.x.am.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        openFact()
    }

    private fun openFact() {
        binding.arr1.setOnClickListener {
            binding.text1.visibility = View.VISIBLE
            binding.arr1.isClickable = false
            binding.arr11.isClickable = true
        }
        binding.arr2.setOnClickListener {
            binding.text2.visibility = View.VISIBLE
            binding.arr2.isClickable = false
            binding.arr21.isClickable = true
        }
        binding.arr3.setOnClickListener {
            binding.text3.visibility = View.VISIBLE
            binding.arr3.isClickable = false
            binding.arr31.isClickable = true
        }
        binding.arr4.setOnClickListener {
            binding.text4.visibility = View.VISIBLE
            binding.arr4.isClickable = false
            binding.arr41.isClickable = true
        }
        binding.arr11.setOnClickListener {
            binding.text1.visibility = View.GONE
            binding.arr11.isClickable = false
            binding.arr1.isClickable = true
        }
        binding.arr21.setOnClickListener {
            binding.text2.visibility = View.GONE
            binding.arr21.isClickable = false
            binding.arr2.isClickable = true
        }
        binding.arr31.setOnClickListener {
            binding.text3.visibility = View.GONE
            binding.arr31.isClickable = false
            binding.arr3.isClickable = true
        }
        binding.arr41.setOnClickListener {
            binding.text4.visibility = View.GONE
            binding.arr41.isClickable = false
            binding.arr4.isClickable = true
        }
    }
}