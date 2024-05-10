package com.sajal.phonebook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ContactAdapter(private val contacts:List<Contact>):RecyclerView.Adapter<ContactAdapter.ViewHolder>(){
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val nameTextView:TextView=itemView.findViewById(R.id.nameTextView)
        val phoneTextView:TextView=itemView.findViewById(R.id.phoneNumberTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.item_contact,parent,false)
        return ViewHolder(itemView)

    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        val contact=contacts[position]
        holder.imageView.setImageResource(contact.image)
        holder.nameTextView.text=contact.name
        holder.phoneTextView.text=contact.phoneNumber

    }

    override fun getItemCount(): Int {
       return contacts.size
    }
}