package com.example.contacts

import android.provider.ContactsContract.Contacts
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.databinding.ContactlistBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation

class Adapter(var contactList: List<contactData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
      var binding = ContactlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }





    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        var contact = contactList.get(position)

        holder.binding.tvName.text = contact.names
        holder.binding.tiePhoneNumber.text = contact.phoneNum
        holder.binding.tieEmail.text = contact.email
        holder.binding.tvName.text = contact.avatar
        Picasso
            .get()
            .load(contact.avatar)
            .resize(80,80)
            .centerCrop()
            .transform(CropCircleTransformation())
            .into(holder.binding.imageView)
    }
    override fun getItemCount(): Int {
        return contactList.size
    }
}
class ContactViewHolder(var binding: ContactlistBinding):RecyclerView.ViewHolder(binding.root){

}