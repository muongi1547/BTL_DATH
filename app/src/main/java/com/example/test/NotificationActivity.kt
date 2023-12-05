package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class SectionNotificationAdapter(private val items: List<Any>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val SECTION_ITEM_TYPE_1 = 1
    // Add more section types as needed

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {

            SECTION_ITEM_TYPE_1 -> SectionItem1ViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.notification_layout, parent, false)
            )

            // Add more cases for additional section types
            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SectionItem1ViewHolder -> {
                val sectionItem1 = items[position] as SectionNotifications
                holder.bind(sectionItem1)
            }
            // Add more cases for additional section types
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is SectionNotifications -> SECTION_ITEM_TYPE_1

            else -> throw IllegalArgumentException("Invalid item type")
        }
    }


    // ViewHolder for Section Item Type 1
    class SectionItem1ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(sectionItem1: SectionNotifications) {
            itemView.findViewById<TextView>(R.id.textView16).text = sectionItem1.stockName
            itemView.findViewById<TextView>(R.id.textView17).text = sectionItem1.price.toString()
            itemView.findViewById<TextView>(R.id.textView15).text = sectionItem1.status.toString()
            itemView.findViewById<TextView>(R.id.textView18).text = sectionItem1.volumn.toString()

        }
    }

}
