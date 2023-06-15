package com.example.contacts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.ftButton.setOnClickListener{
            val intent = Intent(this, FormContact::class.java)
            startActivity(intent)
        }
    }


    override fun onResume() {
        super.onResume()
        displayContacts()
    }
    fun displayContacts(){
        var contact1 = contactData("https://images.unsplash.com/photo-1508184964240-ee96bb9677a7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","MaryOngongo","0729071785","mary@gmail.com")
        var contact2 = contactData("https://images.unsplash.com/photo-1484517186945-df8151a1a871?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=449&q=80","Brian Ongongo","0794563828","brian@gmail.com")
        var contact3 = contactData("https://images.unsplash.com/photo-1541216970279-affbfdd55aa8?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Winnie Onsakia","0717620238","win@gmail.com")
        var contact4 = contactData("https://images.unsplash.com/photo-1527201987695-67c06571957e?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=404&q=80","Joyce Mugure","0708455032","joy@gmail.com")
        var contact5 = contactData("https://images.unsplash.com/photo-1514222709107-a180c68d72b4?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=449&q=80","Joyce Jemimah","0706738392","jemimah@gmail.com")
        var contact6 = contactData("https://images.unsplash.com/photo-1495846101638-bd8e9a23f8ee?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Jeff Chege","075363738262","jeff@gmail.com")
        var contact7 = contactData("https://images.unsplash.com/photo-1512361436605-a484bdb34b5f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=870&q=80","Fred Ooko","0767543292","fred@gmail.com")
        var contactList = listOf<contactData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7)
        binding.rvRecycler.layoutManager=LinearLayoutManager(this)
        var contactAdapter = Adapter(contactList)
        binding.rvRecycler.adapter = contactAdapter
    }
}