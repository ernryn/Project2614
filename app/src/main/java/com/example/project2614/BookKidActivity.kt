package com.example.project2614

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.project2614.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        //INSTANCE
        val btnFairy:Button = findViewById(R.id.buttonFairy)
        val btnFable:Button = findViewById(R.id.buttonFable)
        val btnScience:Button = findViewById(R.id.buttonScience)

        //event button fairy
        btnFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }
        //event button fairy
        btnFable.setOnClickListener{
            replaceFragment(FableFragment())
        }
        //event button fairy
        btnScience.setOnClickListener{replaceFragment(ScienceFragmentFragment())
        }
    }

    //create method replace fragment
    private fun replaceFragment(frg:Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}