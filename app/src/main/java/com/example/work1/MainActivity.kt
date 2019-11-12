package com.example.work1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_LASTNAME: String = "LASTNAME"
    public final var TAG_NAME: String = "NAME"
    public final var TAG_EMAIL: String = "EMAIL"
    public final var TAG_ADDRESS: String = "ADDRESS"
    public final var TAG_NINENAME: String = "NINENAME"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        savedata.setOnClickListener {
            var name = Name1.text.toString()
            var lastname = lname2.text.toString()
            var email = email_text.text.toString()
            var address = ad_text.text.toString()
            var ninkname = ninename.text.toString()

            sentderFun(name, lastname,email,address,ninkname)
        }
    }
    fun sentderFun(arg2: String, arg3: String, arg4: String, arg5: String, arg6: String ) {
        var goMainActivity2 = Intent(this,MainActivity2::class.java)
        goMainActivity2.putExtra(TAG_LASTNAME, arg2)
        goMainActivity2.putExtra(TAG_NAME, arg3)
        goMainActivity2.putExtra(TAG_EMAIL, arg4)
        goMainActivity2.putExtra(TAG_ADDRESS, arg5)
        goMainActivity2.putExtra(TAG_NINENAME, arg6)
        startActivity(goMainActivity2)
    }
    fun ClearFun(){
        Name1.setText("")
        lname2.setText("")
    }
}
