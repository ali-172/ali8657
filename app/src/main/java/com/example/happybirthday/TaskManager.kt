package com.example.happybirthday

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class TaskManager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}


@Composable
fun showTask(){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //展示图片
        val image = painterResource(R.drawable.ic_task_completed)

        Image(
            painter = image,
            contentDescription = stringResource(R.string.imageDes),

        )

        Text(
            text = stringResource(R.string.taskTitle),
            fontWeight = Bold,
            modifier = Modifier
                .padding(0.dp,24.dp,0.dp,8.dp)
        )
        Text(
            text = stringResource(R.string.taskContent),
            fontSize = 16.sp
        )
    }

}

@Composable
@Preview
fun showPreview(){
    HappyBirthdayTheme{
        showTask()
    }
}