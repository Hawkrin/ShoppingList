package com.project.todolist

import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import android.view.View

class ShoppingList(
    private val shopping: MutableList<Shopping>
) {


    class ShoppingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}