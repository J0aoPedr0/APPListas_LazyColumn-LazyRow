package com.example.applistas

data class MarvelChar(
    var charName: String,
    var name: String,
    var imageRes: Int,
)

fun getAllMarvelChars(): List<MarvelChar>{
    return listOf<MarvelChar>(
        MarvelChar("Thor","Chris Hemsworth", R.drawable.thor),
        MarvelChar("Spiderman","Tom Holland", R.drawable.spider_man),
        MarvelChar("Ironman","Tony Stark",R.drawable.iron_man),
        MarvelChar("Black Widow","Natasha Romanoff",R.drawable.black_widow),
        MarvelChar("Captain America","Steve Rogers",R.drawable.captain_america),
        MarvelChar("Captain Marvel", "Marvel",R.drawable.captain_marvel),
        MarvelChar("Hulk","Bruce Banner",R.drawable.hulk),
        MarvelChar("Black Panther","T'Challa",R.drawable.panter),
        MarvelChar("Hawk Eye", "Clinton", R.drawable.hawkeye_eye),
        MarvelChar("Vision", "Vision", R.drawable.vision)
    )
}
