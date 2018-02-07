package com.my.retrolin.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.my.retrolin.R
import com.my.retrolin.models.Dealer
import kotlinx.android.synthetic.main.custom_row.view.*

class PixabayAdapter(var dealerlist:List<Dealer>?) : RecyclerView.Adapter<PixabayAdapter.MyViewHolder>() {


    lateinit var dealerList:List<Dealer>

    init {

        dealerList=dealerlist!!

    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MyViewHolder {
        val view: View = LayoutInflater.from(parent?.context).inflate(R.layout.custom_row, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder?, position: Int) {


        var dealer:Dealer = dealerList[position]


        holder?.tags?.setText(dealer.name)
        holder?.downloads?.setText(dealer.address)
        holder?.likes?.setText("${dealer.district_id} Likes")
        holder?.comments?.setText("${dealer.id} Likes")
        holder?.user?.setText(dealer.created_at)


    }

    override fun getItemCount(): Int = 10

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
         var tags: TextView
         var downloads: TextView
         var likes: TextView
         var comments: TextView
         var user: TextView

        init {
            tags=itemView.tags
            downloads=itemView.downloads
            likes=itemView.downloads
            comments=itemView.comments
            user=itemView.user
        }
    }
}
