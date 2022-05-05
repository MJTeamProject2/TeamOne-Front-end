package com.team1.teamone.member.presenter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.team1.teamone.R
import com.team1.teamone.board.model.BoardResponse

class BoardAdapter(val boardList: ArrayList<BoardResponse>) : RecyclerView.Adapter<BoardAdapter.CustomViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {

        return boardList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.classTitle.text = boardList.get(position).classTitle
        holder.title.text = boardList.get(position).title
        holder.content.text = boardList.get(position).content
    }


    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val classTitle = itemView.findViewById<TextView>(R.id.tv_name2)   //이름
        val title= itemView.findViewById<TextView>(R.id.tv_age)   //나이
        val content = itemView.findViewById<TextView>(R.id.tv_job)  //직업
       // val viewCount
    }

}

