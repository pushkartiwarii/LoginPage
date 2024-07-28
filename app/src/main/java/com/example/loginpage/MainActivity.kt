package com.example.loginpage

import android.os.Bundle
import android.provider.CalendarContract.Colors
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.FontScaling
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginpage.ui.theme.LoginPageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginPageTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    LoginScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                    Bg()


                }
            }
        }
    }
}
@Composable
fun LoginScreen(modifier: Modifier=Modifier){

    var Enteryourname by remember { mutableStateOf("") }
    var Enteryourpassword by remember { mutableStateOf("") }
    var isformvisible  by remember { mutableStateOf(false) }

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        AnimatedVisibility(visible = !isformvisible) {
            Card(
                modifier=Modifier.padding(32.dp),
                onClick = {
                    isformvisible = true
                },
            ) {

                Column(
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
                    .height(40.dp), horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                    Icon(painter = painterResource(id = R.drawable.welcome ), contentDescription = null)


            }


                    }
                }
        AnimatedVisibility(visible = isformvisible) {
            Card(
                modifier = Modifier
                    .padding(20.dp)
            ) {
                Column(
                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                        .height(90.dp), horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(20.dp)
                ) {
                    Image(painter = painterResource(id = R.drawable.welcome), contentDescription =null )

                }
                Column(

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(32.dp)
                        , horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(30.dp)
                ) {
                    TextField(
                        value = Enteryourname,
                        onValueChange = { Enteryourname = it },
                        label = { Text(text = "Email")},
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Person, contentDescription =null)
                        }
                    )
                    TextField(
                        value = Enteryourpassword,
                        onValueChange = { Enteryourpassword = it },
                        label = { Text(text = "Password") },
                        leadingIcon = {
                            Icon(imageVector = Icons.Default.Lock, contentDescription =null)
                        }, visualTransformation =PasswordVisualTransformation()
                    )
                    ElevatedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Login",Modifier.fillMaxWidth())
                        
                    }
                    ElevatedButton(onClick = { /*TODO*/ }) {
                        Text(text = "Forgot Password",Modifier.fillMaxWidth())
                        
                    }



                }




            }

        }








            }


        }
@Composable
fun Bg(modifier: Modifier=Modifier) {

    Image(
        painter = painterResource(id = R.drawable.wall1),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )
}







@Preview
@Composable
private fun LoginScreenPreview(){
    Bg()
    LoginScreen()

}
