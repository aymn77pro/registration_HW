package com.example.registration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     binding = ActivityMainBinding.inflate(layoutInflater)
     setContentView(binding.root)
     binding.register.setOnClickListener { sineup() }
//main
    }
    fun sineup(){
        var name = binding.nameEdit.text.toString()
        var pass1 = binding.editTextTextPassword1Edit.text.toString()
        var pass2 = binding.editTextTextPassword2Edit.text.toString()
        var email = binding.emailEdit.text.toString()
        var birth = binding.birthEdit.text.toString()
        if (name.isEmpty()||pass1.isEmpty()||pass2.isEmpty()||email.isEmpty()||birth.isEmpty()){
            binding.massage.text = "empty"
        }
        else if (pass1!=pass2){
            binding.massage.text = "password is not same"
        }
        else if (!email.contains('@',)&&!email.contains(".com")){
            binding.massage.text = "email is not correct"
        }
        else {
            binding.massage.text = "${name}\n${email}"

        }
    }
}
