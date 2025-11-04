package com.example.happybirthday

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeArticle : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


@Composable
fun  showArticle(modifier:Modifier= Modifier){
    val configuration = LocalConfiguration.current
    val screenWidth =configuration.screenWidthDp.dp  //获取整个屏幕宽度

    Column {


        //展示图片
        val image = painterResource(R.drawable.androidparty)
        Image(
            painter = image,
            contentDescription = "这是一个主题",
            modifier= Modifier
                .height(100.dp)
                .fillMaxWidth(), // 占满屏幕宽度
            contentScale = ContentScale.FillWidth

        )

        //展示文字
        Text(
            text = stringResource(R.string.artTitle),
            fontSize = 24.sp,
            modifier= Modifier
                .padding(16.dp)

        )
        Text(
            text = stringResource(R.string.articleP1),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier= Modifier
                .padding(16.dp,0.dp)


        )
        Text(
            text = stringResource(R.string.articleP2),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier= Modifier
                .padding(16.dp)
        )

    }

}


@Preview
@Composable
fun showArticlePreview(){
    HappyBirthdayTheme{
        showArticle()
    }
}
