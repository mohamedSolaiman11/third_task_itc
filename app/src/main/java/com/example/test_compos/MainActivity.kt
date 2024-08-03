package com.example.test_compos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_compos.ui.theme.TestcomposTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Home()
        }
    }
}

@Composable
fun Home() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .paddingFromBaseline(top = 10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.White),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Spacer(modifier = Modifier.width(15.dp))
                Icon(
                    Icons.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.Black,
                    modifier = Modifier.size(27.dp)
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                ) {
                    Text(
                        text = "Details",
                        style = TextStyle(fontSize = 25.sp),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            }
            Spacer(modifier = Modifier.height(30.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Image(
                        painter = painterResource(R.drawable.gog),
                        contentDescription = "google image",
                        modifier = Modifier.size(140.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "language",
                        style = TextStyle(fontSize = 24.sp),
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(18.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "1525", style = TextStyle(fontSize = 18.sp))
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            Icons.Filled.Star,
                            contentDescription = null,
                            tint = Color.Yellow,
                            modifier = Modifier.size(30.dp)
                        )

                        Spacer(modifier = Modifier.width(16.dp))

                        Text(text = "Python", style = TextStyle(fontSize = 19.sp))
                        Spacer(modifier = Modifier.width(7.dp))
                        Box(
                            modifier = Modifier
                                .width(23.dp)
                                .height(23.dp)
                                .background(Color.Blue, shape = CircleShape),
                        )

                        Spacer(modifier = Modifier.width(16.dp))

                        Text(text = "347", style = TextStyle(fontSize = 21.sp))
                        Spacer(modifier = Modifier.width(4.dp))

                        Image(
                            painter = painterResource(R.drawable.imgar),
                            contentDescription = "fork image",
                            modifier = Modifier
                                .size(35.dp)
                                .background(Color.Transparent) // استخدام نفس اللون مثل الـ Box المحيط
                        )

                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Shared repository for open-sourced projects from the Google AI Language team.",
                        textAlign = TextAlign.Start,
                        style = TextStyle(fontSize = 21.sp, textAlign = TextAlign.Center),
                        maxLines = 3,
                        modifier = Modifier.padding(horizontal = 30.dp)
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    Button(
                        modifier = Modifier
                            .width(300.dp)
                            .padding(bottom = 20.dp),
                        onClick = {},
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Text(
                            text = "Show Issues",
                            style = TextStyle(
                                fontSize = 22.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold
                            ),
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyApp() {
    Home()
}
