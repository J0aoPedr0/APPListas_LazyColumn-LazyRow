package com.example.applistas

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ListDemo() {
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo() {
    var myList = getAllMarvelChars()
    LazyColumn(content = {
        itemsIndexed(myList, itemContent = { index, item ->
            MarvelItem(item = item)
        })
    })
}

@Composable
fun MarvelItem(item: MarvelChar) {
    var context = LocalContext.current
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clickable {
            Toast.makeText(context, "${item.name}", Toast.LENGTH_SHORT).show()
        }
    ){
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(108.dp)
                .scale(1.0f)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start){
            Text(
                text = item.charName,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = item.name,
                fontSize = 18.sp
            )
        }
    }
}

@Composable
fun TextItem(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp
    )
}
