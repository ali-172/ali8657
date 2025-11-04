package com.example.happybirthday

import android.R.id.bold
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class PersonalCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

@Composable
fun showFull(){

    Column {

        top()

        tail()
    }
}


@Composable
fun top(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        //展示头像
        val personalImage= painterResource(R.drawable.personal)

        Image(
            painter = personalImage,
            contentDescription = "image",
            modifier = Modifier
                .padding(100.dp,20.dp)
        )

        Text(
            text= stringResource(R.string.fullname),
            fontSize = 26.sp,

        )

        Text(
            text= stringResource(R.string.introduce)
        )



    }
}


@Composable
fun tail(){

    //手机号
    val phone =painterResource(R.drawable.phone)
     val phoneNumber =stringResource(R.string.number)

    // 地址
    val address =painterResource(R.drawable.address)
    val addressInfo=stringResource(R.string.address)

    // 邮箱
    val email =painterResource(R.drawable.email)
    val emailInfo =stringResource(R.string.email)

//使用布局！
    Column {
        row(phone,phoneNumber)
        row(address,addressInfo)
        row(email,emailInfo)
    }




}

@Composable
fun row(icon: Painter, info: String){
    Row (
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(40.dp,10.dp)
    ){
        //左侧图标
        Image(
            painter = icon,
            contentDescription = null,
            Modifier.height(30.dp)
                .padding(10.dp,0.dp)
        )

        Text(
            text = info,
            fontSize = 26.sp,


        )
    }
}



@Composable
@Preview
fun show(){
    HappyBirthdayTheme{
        showFull()
    }
}