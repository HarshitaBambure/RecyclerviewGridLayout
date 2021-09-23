package com.example.recyclerviewgridlayout

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val context: Context, val dataList: List<RecyclerData>) :
    RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //item initalization
        var ll_design: LinearLayout = itemView.findViewById(R.id.ll_design)
        var iv_office: ImageView = itemView.findViewById(R.id.iv_office)
        var tv_office: TextView = itemView.findViewById(R.id.tv_office)
        var tv_device: TextView = itemView.findViewById(R.id.tv_device)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerAdapter.MyViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.MyViewHolder, position: Int) {
        holder.itemView.setOnClickListener {

            //is selected is used for selecting the position of item
            if (dataList[position].isSelected) {
                dataList[position].setIsSelected(false)
                holder.ll_design.setBackgroundColor(Color.GREEN)
            } else {
                dataList[position].setIsSelected(true)

                holder.ll_design.setBackgroundColor(Color.WHITE)
            }
        }
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}