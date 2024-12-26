package com.example.freeui.data

import com.example.freeui.R

data class Item (
    val id: Int,
    val image: Int,
    val name: String,
    val description: String,
    val price: String

)

class ItemRep {
    val itemList = listOf(
        Item(
            id = 1,
            image = R.drawable.iv_first_model,
            name = "Black Coat",
            description = "Black classic coat for women",
            price = "$120"
        ),
        Item(
            id = 2,
            image = R.drawable.iv_second_model,
            name = "Brown cozy Turtleneck",
            description = "Brown old fashioned TurtleNck for women",
            price = "$80"
        ),
        Item(
            id = 3,
            image = R.drawable.iv_third_model,
            name = "Blue cozy v-neck ",
            description = "Blue old fashioned v-neck for women",
            price = "$70"
        ),
        Item(
            id = 4,
            image = R.drawable.iv_fourth_model,
            name = "Cream Coat",
            description = "Cream classic coat for women ",
            price = "$120"
        ),
        Item(
            id = 5,
            image = R.drawable.iv_fifth_model,
            name = "Skin button-up jacket ",
            description = "Skin cozy button-up for women ",
            price = "$90"
        )


    )
}