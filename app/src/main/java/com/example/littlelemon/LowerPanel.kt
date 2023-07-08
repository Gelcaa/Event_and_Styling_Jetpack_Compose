package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial(){
    Card(
        modifier = Modifier.fillMaxWidth()
    ){
        Text(text = "Weekly Special", fontSize = 26.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp))
    }
}


@Composable
fun MenuDish() {
    Card {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)

        ) {
            Column {
                Text(
                    text = "Greek Salad",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = R.string.Greek_Salad_Description),
                    color = Color.Gray,
                    modifier = Modifier.padding(top = 5.dp, bottom = 5.dp)
                    )
                Text(
                    text = "$12.99",
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold
                )
                Image(
                    painter = painterResource(id = R.drawable.greeksalad),
                    contentDescription = "Greek Salad Image"
                )
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
