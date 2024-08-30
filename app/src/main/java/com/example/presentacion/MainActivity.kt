package com.example.presentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.presentacion.ui.theme.PresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                    ,
                    color = MaterialTheme.colorScheme.onBackground,

                    ) {
                    Greeting("Bryan Rodriguez","Android Developer Extraordinaire")
                    PersonalData(number = "+51 936 160 703", email =
                    "bryan.rodriguez4@unmsm.edu.pe", dev ="Android Developer" ,modifier=Modifier)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,tittle:String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.androidlogo)
    Box(modifier = Modifier
        .padding(top = 50.dp)
        .padding(horizontal = 50.dp)
        ,
        contentAlignment = Alignment.Center,
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp, 100.dp)
                    .align(Alignment.CenterHorizontally)
                    .background(
                        color = Color(0xFF7F8891)
                    ),


                )
            Text(
                text = name,
                fontSize = 25.sp,
                lineHeight = 50.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier

                    .align(alignment = Alignment.CenterHorizontally),


                )
            Text(
                text = tittle,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(2.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                color = Color(0xFF33AC2F)
            )
        }
    }
}
@Composable
fun PersonalData(number:String , email:String, dev:String,modifier: Modifier){
    val icon1 = painterResource(id = R.drawable.telefono)
    val icon2 = painterResource(id = R.drawable.compartir)
    val icon3 = painterResource(id = R.drawable.correo)
    Box(modifier = Modifier
        .padding(top = 500.dp)
        .padding(horizontal = 50.dp)
        ,
        contentAlignment = Alignment.Center,
    ) {
        Column (modifier=Modifier.padding(top = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,){
            Row {
                Image(
                    painter = icon1,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(20.dp, 20.dp)
                        .background(
                            color = Color(0xFF7F8891)
                        ),
                )
                Text(
                    text = number,
                    fontSize = 12.sp,
                    color = Color(0xFF4D65C4)
                )
            }
            Row {
                Image(
                    painter = icon2,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(20.dp, 20.dp)
                        .background(
                            color = Color(0xFF7F8891)
                        ),
                )
                Text(
                    text = dev,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(3.dp),
                    color = Color(0xFF4D65C4)
                )
            }
            Row {
                Image(
                    painter = icon3,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(30.dp, 30.dp)
                        .background(
                            color = Color(0xFF7F8891)
                        ),
                )
                Text(
                    text = email,
                    fontSize = 12.sp,
                    modifier = Modifier
                        .padding(3.dp),
                    color = Color(0xFF4D65C4)
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PresentacionTheme {
        Greeting("Bryan Rodriguez","Android Developer Extraordinaire")
        PersonalData(number = "+51 936 160 703", email =
        "bryan.rodriguez4@unmsm.edu.pe", dev ="Android Developer" ,modifier=Modifier)
    }
}