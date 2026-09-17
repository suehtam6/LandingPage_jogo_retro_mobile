package com.example.jogo_retro

import android.R.attr.contentDescription
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jogo_retro.ui.theme.Jogo_retroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jogo_retroTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                   StartGame(modifier = Modifier.padding(innerPadding))
                   // EndGame(modifier = Modifier.padding(innerPadding))


                }
            }
        }
    }
}

@Composable
fun StartGame(modifier: Modifier = Modifier) {

        Column(modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
        ) {
            Row(Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween


            ) {
                Text(
                    text = "SCORE: 0050",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Color.White


                )

                Row(modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "LIVES:",
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Serif,
                        color = Color.White,
                    )
                    AndroidEnemyHeart()
                    AndroidEnemyHeart()
                    AndroidEnemyHeart()

                }

            }



            Row() {
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()

            }

            Row() {
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()

            }

            Row() {
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()
                AndroidEnemyMeteoro()

            }


            Box(
                Modifier.fillMaxSize(),
                contentAlignment = Alignment.BottomCenter
            ){
                AndroidEnemyNave(modifier.padding(10.dp))

                Text(
                    text = "PRESS START",
                    Modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .padding(10.dp),
                    textAlign = TextAlign.Center

                )
            }



        }


}


@Composable
fun EndGame(modifier: Modifier = Modifier) {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        contentAlignment = Alignment.Center

    ){

        Row() {
            AndroidEnemyMeteoro()
            AndroidEnemyMeteoro()
            AndroidEnemyMeteoro()
            AndroidEnemyMeteoro()
            AndroidEnemyMeteoro()
            AndroidEnemyMeteoro()
        }



            Text(
                text = "GAME OVER",
                textAlign = TextAlign.Center,
                fontSize = 60.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )




    }


}


@Composable
fun AndroidEnemyHeart(modifier: Modifier = Modifier) {
        Image(
            modifier = modifier
                .size(20.dp),
            painter = painterResource(R.drawable.coracao),
            contentDescription = "Android enemy"
        )

}


@Composable
fun AndroidEnemyMeteoro(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(70.dp),
        painter = painterResource(R.drawable.meteoro),
        contentDescription = "Android enemy"
    )

}


@Composable
fun AndroidEnemyNave(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(70.dp),
        painter = painterResource(R.drawable.nave),
        contentDescription = "Android enemy"
    )

}