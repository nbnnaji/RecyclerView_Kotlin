package com.example.nnaji_macpro1.recyclerview_kotlin.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nnaji_macpro1.recyclerview_kotlin.R
import android.support.v7.widget.RecyclerView

/**
 * Created by Nnaji-MacPro1 on 7/27/18.
 */


import kotlinx.android.synthetic.main.video_row.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {
    val videoTitles = listOf<String>("Meet The Parents", "Avengers","Spiderman")

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val titleList = videoTitles.get(position)
        holder?.view?.textView_video_title?.text =titleList

    }
    //Number/size of list
    override fun getItemCount(): Int {
        return videoTitles.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder{
        val layoutInflator = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflator.inflate(R.layout.video_row, parent, false)
        return CustomViewHolder(cellForRow)
    }
}
class CustomViewHolder(val view: View):RecyclerView.ViewHolder(view){

}