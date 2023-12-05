package com.example.test

import android.content.Intent
import android.provider.Telephony.Mms.Intents
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity

class SectionAdapter(private val items: List<Any>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val SECTION_TITLE = 0
    private val SECTION_ITEM_TYPE_1 = 1
    private val SECTION_ITEM_TYPE_2 = 2
    private val SECTION_ITEM_TYPE_3 = 3
    // Add more section types as needed

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            SECTION_TITLE -> SectionTitleViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_section_title, parent, false)
            )
            SECTION_ITEM_TYPE_1 -> SectionItem1ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.price_alert, parent, false)
            )
            SECTION_ITEM_TYPE_2 -> SectionItem2ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.assests, parent, false)
            )
            SECTION_ITEM_TYPE_3 -> SectionItem3ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.market_history, parent, false)
            )
            // Add more cases for additional section types
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SectionTitleViewHolder -> {
                val sectionTitle = items[position] as SectionTitle
                holder.bind(sectionTitle)
            }
            is SectionItem1ViewHolder -> {
                val sectionItem1 = items[position] as SectionItem1
                holder.bind(sectionItem1)
            }
            is SectionItem2ViewHolder -> {
                val sectionItem2 = items[position] as SectionItem2
                holder.bind(sectionItem2)
            }
            is SectionItem3ViewHolder -> {
                val sectionItem3 = items[position] as SectionItem3
                holder.bind(sectionItem3)
            }
            // Add more cases for additional section types
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is SectionTitle -> SECTION_TITLE
            is SectionItem1 -> SECTION_ITEM_TYPE_1
            is SectionItem2 -> SECTION_ITEM_TYPE_2
            is SectionItem3 -> SECTION_ITEM_TYPE_3
            // Add more cases for additional section types
            else -> throw IllegalArgumentException("Invalid item type")
        }
    }

    // ViewHolder for Section Title
    class SectionTitleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sectionTitle: SectionTitle) {
            itemView.findViewById<TextView>(R.id.textView).text = sectionTitle.title
        }
    }

    // ViewHolder for Section Item Type 1
    class SectionItem1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sectionItem1: SectionItem1) {
            itemView.findViewById<TextView>(R.id.textViewStockName).text = sectionItem1.stockName
            itemView.findViewById<TextView>(R.id.textViewBoughtPrice).text = sectionItem1.priceBought.toString()
            itemView.findViewById<TextView>(R.id.textViewChangeAmount).text = sectionItem1.amountChange.toString()
            itemView.findViewById<TextView>(R.id.textViewVolumn).text = sectionItem1.volumn.toString()


            //When click on the Alert button
            val bt:Button =itemView.findViewById(R.id.button)
                bt.setOnClickListener(){
                   // Toast.makeText(itemView.context,"You clicked",Toast.LENGTH_LONG).show()
                    var i: Intent = Intent(itemView.context,MainActivity4::class.java)
                    startActivity(itemView.context,i,Bundle())
            }
            //When click on the RecyclerView
            itemView.setOnClickListener(){
                bt.setOnClickListener(){
                    Toast.makeText(itemView.context,"You clicked on RecyclerView",Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    // ViewHolder for Section Item Type 2
    class SectionItem2ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sectionItem2: SectionItem2) {
            itemView.findViewById<TextView>(R.id.textView5).text = sectionItem2.totalAssests
            itemView.findViewById<TextView>(R.id.textView8).text = sectionItem2.purchasingPower
            itemView.findViewById<TextView>(R.id.textView11).text = sectionItem2.stockValue
        }
    }
    class SectionItem3ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sectionItem3: SectionItem3) {
            itemView.findViewById<TextView>(R.id.textViewDateTime).text = sectionItem3.date_time
            itemView.findViewById<TextView>(R.id.textViewStockName).text =sectionItem3.stockName
            itemView.findViewById<TextView>(R.id.textViewBuySell).text = sectionItem3.status
            itemView.findViewById<TextView>(R.id.textViewVolumn).text =sectionItem3.volumn
            itemView.findViewById<TextView>(R.id.textViewPrice).text = sectionItem3.price
        }
    }

    // Add more ViewHolder classes for additional section types as needed
}
