package com.example.recyclerviewgridlayout

data class RecyclerData(
    var office: String,
    var device: String,
    var img: Int,
    var isSelected: Boolean

) {

    //took isSelected for marking one item as selected or not

    fun setIsSelected(value: Boolean) {
        isSelected = value
    }
}