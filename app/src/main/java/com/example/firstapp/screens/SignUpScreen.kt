
package com.example.firstapp.screens

import android.view.Surface
import androidx.compose.foundation.layout.fillMaxSize

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstapp.ui.theme.FirstAppTheme
import androidx.compose.ui.unit.sp
import com.example.firstapp.R
import com.example.firstapp.components.HeadingText
import com.example.firstapp.components.MyTextFieldComponent
import com.example.firstapp.components.NormalText
import com.example.firstapp.components.PasswordTextField


@Composable
fun SignUpScreen() {
    val textValues: List<MutableState<String>> = List(3) { remember { mutableStateOf("") }}
    val colorWhite=colorResource(id = R.color.colorWhite)
    Surface(
        modifier= Modifier
            .fillMaxSize()
            .background(colorWhite)
            .padding(28.dp)
    )
    {
        Column(modifier= Modifier.fillMaxSize()) {
            NormalText(value = stringResource(id = R.string.hello))
            HeadingText(value= stringResource(id = R.string.create_acc))
            Spacer(modifier= Modifier.height(20.dp))
            MyTextFieldComponent(labelValue = stringResource(id = R.string.first_name), painterResource = painterResource(id = R.drawable.baseline_person_24),textValues)
            MyTextFieldComponent(labelValue = stringResource(id = R.string.last_name), painterResource = painterResource(id = R.drawable.baseline_person_24),textValues)
            MyTextFieldComponent(labelValue = stringResource(id = R.string.email), painterResource = painterResource(id = R.drawable.baseline_email_24),textValues)
            PasswordTextField(labelValue= stringResource(id = R.string.password), painterResource = painterResource(id = R.drawable.baseline_lock_24))
        }

    }
}
@Preview
@Composable
fun pre(){
    SignUpScreen()
}
