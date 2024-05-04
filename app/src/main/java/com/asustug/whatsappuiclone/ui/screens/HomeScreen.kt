package com.asustug.whatsappuiclone.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.asustug.whatsappuiclone.ui.components.AppBarComponent
import com.asustug.whatsappuiclone.ui.components.TabsComponent

@Composable
fun HomeScreen(){
    Column {
        AppBarComponent()
        TabsComponent()
    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
    TabsComponent()
}