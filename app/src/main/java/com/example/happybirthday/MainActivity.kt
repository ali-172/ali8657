package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {

                GreetingImage(
                    message = stringResource(R.string.hello_ali),
                    from = "ahao"
                )

            }
        }
    }
}

@Composable
fun GreetingText(message:String,from:String,modifier: Modifier= Modifier){

    Column(
        verticalArrangement = Arrangement.Center,
        modifier=modifier
    ) {

        Text(
            text=message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center  //垂直居中
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier= Modifier
                .padding(16.dp)
                .align (alignment = Alignment.CenterHorizontally)

        )


    }


}

//存放图片的位置
@Composable
fun GreetingImage(message:String,from:String,modifier: Modifier=Modifier){
    var image= painterResource(R.drawable.androidparty)

    Box(){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,  //缩放
            alpha = 0.5f  //透明度
        )

        //调用文本显示
        GreetingText(
            message=message,
            from=from,
            modifier= Modifier
                .fillMaxSize()
                .padding(8.dp)
//                .background(color = Color.Green )
        )



    }

}



@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(message = "Happy Birthday ali!", from = "daming")

    }
}