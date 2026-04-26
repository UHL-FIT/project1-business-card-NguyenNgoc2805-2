package com.example.myapplication1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication1.ui.theme.MyApplication1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplication1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Android Logo",
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(0xFF073042))
                    .padding(8.dp)
            )

            // Tên
            Text(
                text = "Nguyễn Bích Ngọc",
                fontSize = 30.sp,
                modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
            )


            Text(
                text = "Sinh Viên Lớp CT1C",
                color = Color(0xFF3DDC84),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
        }


        Column(
            modifier = Modifier.padding(bottom = 48.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ContactRow(iconId = R.drawable.phone_24dp_1f1f1f, text = "+84 33 173 745")
            ContactRow(iconId = R.drawable.share_24dp_1f1f1f, text = "@ngocnguyn")
            ContactRow(iconId = R.drawable.mail_24dp_1f1f1f, text = "Nbn282005@gmail.com")
        }
    }
}


@Composable
fun ContactRow(iconId: Int, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            painter = painterResource(id = iconId),
            contentDescription = null,
            tint = Color(0xFF3DDC84),
            modifier = Modifier
                .padding(end = 36.dp)
                .size(34.dp)
        )
        Text(
            text = text,
            fontSize = 24.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    MyApplication1Theme {
        BusinessCard()
    }
}