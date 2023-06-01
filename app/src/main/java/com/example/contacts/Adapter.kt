package com.example.contacts

import android.provider.ContactsContract.Contacts
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.databinding.ContactlistBinding

class Adapter(var contactList: List<contactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
      var binding = ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactList.get(position)
        holder.binding.tvName.text = contact.names
        holder.binding.tvNumber.text = contact.phoneNum
        holder.binding.tvEmail.text = contact.email
        holder.binding.tvName.text = contact.avatar
    }
    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding):RecyclerView.ViewHolder(binding.root)