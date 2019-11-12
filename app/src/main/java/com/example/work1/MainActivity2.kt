package com.example.work1
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page2.*

class MainActivity2 :AppCompatActivity () {
    public final var TAG_NAME_1: String = "NAME"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        setTitle("Page2")
        var lastname = intent.extras?.getString(MainActivity().TAG_LASTNAME)
        var address = intent.extras?.getString(MainActivity().TAG_ADDRESS)
        var ninename = intent.extras?.getString(MainActivity().TAG_NINENAME)
        var name = intent.extras?.getString(MainActivity().TAG_NAME)
        var em = intent.extras?.getString(MainActivity().TAG_EMAIL)

        button2.setOnClickListener {
            var name_text_unduod = name_text.text.toString()
            sentderFun__2(name_text_unduod)
        }
        lname_text.text = lastname
        name_text.text =  name
        textView5.text = address
        ninename__text.text = ninename
        em_text.text = em
    }

    fun sentderFun__2(arg1: String) {
        var goMainActivity2 = Intent(this,MainActivity3::class.java)
        goMainActivity2.putExtra(TAG_NAME_1, arg1)
        startActivity(goMainActivity2)
    }

}