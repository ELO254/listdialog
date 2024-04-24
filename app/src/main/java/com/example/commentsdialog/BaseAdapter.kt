package com.example.commentsdialog

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class baseAdapter(var items:List< Items>): BaseAdapter() {
    override fun getCount(): Int {
        return items.size
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        var holder:ViewHolder

        if(view == null){
            view = LayoutInflater.from(parent?.context).inflate(R.layout.listview,parent, false)
            holder = ViewHolder()
            holder.imageView = view.findViewById(R.id.imageView)
            holder.textView = view.findViewById(R.id.textView2)
            view.tag = holder
        }else{
            holder = view.tag as ViewHolder
        }

        var item = items[position]
        holder.textView.text = item.title
        holder.imageView.setImageResource(item.image)


        return view!!
    }
    class ViewHolder{

        lateinit var imageView: ImageView
        lateinit var textView: TextView

    }

}