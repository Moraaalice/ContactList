package com.example.contacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }


    fun displayContacts(){
        var contact1 = contactData("Mary","MaryOngongo","0729071785","mary@gmail.com")
        var contact2 = contactData("Brian","Brian Ongongo","0794563828","brian@gmail.com")
        var contact3 = contactData("Winnie","Winnie Onsakia","0717620238","win@gmail.com")
        var contact4 = contactData("Joy","Joyce Mugure","0708455032","joy@gmail.com")
        var contact5 = contactData("Jem","Joyce Jemimah","0706738392","jemimah@gmail.com")
        var contact6 = contactData("Jeff","Jeff Chege","075363738262","jeff@gmail.com")
        var contact7 = contactData("Fred","Fred Ooko","0767543292","fred@gmail.com")
        var contactList = listOf<contactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        binding.rvRecycler.layoutManager=LinearLayoutManager(this)
        var contactAdapter = Adapter(contactList)
        binding.rvRecycler.adapter = contactAdapter
    }
}