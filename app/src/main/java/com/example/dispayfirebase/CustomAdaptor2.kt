package com.example.dispayfirebase


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter2(var context: Context, var data:ArrayList<User>):BaseAdapter() {
    private class ViewHolder(row:View?){
        var mTxtName:TextView
        var mTxtAge:TextView
        var mTxtGroup:TextView
        var mTxtPhone:TextView
        var mTxtLoc:TextView

        init {
            this.mTxtName = row?.findViewById(R.id.mTvName) as TextView
            this.mTxtAge = row?.findViewById(R.id.mTvAge) as TextView
            this.mTxtGroup = row?.findViewById(R.id.mTvGroup) as TextView
            this.mTxtPhone = row?.findViewById(R.id.mTvPhone) as TextView
            this.mTxtLoc = row?.findViewById(R.id.mTvLoc) as TextView

        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.receivers,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:User = getItem(position) as User
        viewHolder.mTxtName.text = item.name
        viewHolder.mTxtAge.text = item.email
        viewHolder.mTxtGroup.text = item.pass
        viewHolder.mTxtPhone.text = item.pass
        viewHolder.mTxtLoc.text = item.pass
        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }}