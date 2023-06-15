package com.example.contacts



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.Toast
import com.example.contacts.databinding.ActivityFormContactBinding
import com.example.contacts.databinding.ActivityMainBinding

class FormContact : AppCompatActivity() {
    lateinit var binding: ActivityFormContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityFormContactBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val button2 = findViewById<Button>(R.id.buttonSave)
        button2.setOnClickListener {
            val intent = Intent(this@FormContact, MainActivity::class.java)
            startActivity(intent)
        }
        onResume()
    }

    override fun onResume() {
        super.onResume()
        clearErrors()
        validateContacts()
    }



    fun clearErrors(){

        binding.tieFirstname.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilFirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )

        binding.tieLastName.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilLastName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.tiePhoneNumber.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilPhoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.tieEmail.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
    }
    fun validateContacts(){
        val name =binding. tieFirstname.text.toString()
        val contacts = binding.tieLastName.text.toString()

        val email =binding. tieEmail.text.toString()

        var error = false
        if (name.isBlank()){
            binding. tieFirstname.error = "name is required"
            error = true
        }

        if (name.isBlank()){
            binding. tieLastName.error = "name is required"
            error = true
        }

        if (contacts.isBlank()){
            binding.tiePhoneNumber.error = "contacts is required"
            error = true
        }

        if (email.isBlank()){
            binding.tieEmail.error = "Email is required"
            error = true
        }


        if (!error){
            Toast.makeText(this,"$name,$contacts, $email", Toast.LENGTH_LONG).show()
        }

    }
}


