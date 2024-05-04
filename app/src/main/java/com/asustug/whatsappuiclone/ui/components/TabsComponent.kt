package com.asustug.whatsappuiclone.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asustug.whatsappuiclone.ui.data.TabsData
import com.asustug.whatsappuiclone.ui.data.tabs

@Composable
fun TabsComponent(){
    var selectedIndex by remember { mutableStateOf(0) }

    TabRow(selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = {
            tabsPositions -> TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabsPositions[selectedIndex]),
                    color = MaterialTheme.colorScheme.tertiary)
        }
    ) {

        tabs.forEachIndexed { index, tab ->
            Tab(selected = index == selectedIndex,
                onClick = { selectedIndex = index },
                text = {
                    if(tab.unReadCount == null){
                        TabTitle(title = tab.title)
                    }
                    else {
                        TabwithUnreadCount(tab)
                    }
                }
            )
        }
    }
}

@Composable
fun TabTitle(title: String){
    Text(text = title, style = TextStyle(fontSize = 16.sp))
}

@Composable
fun TabwithUnreadCount(tabsData: TabsData){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        TabTitle(title = tabsData.title)
        tabsData.unReadCount?.also { unreadCount ->
            Text(text = unreadCount.toString(),
                modifier = Modifier.padding(4.dp)
                    .size(16.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.background),
                style = TextStyle(fontSize = 12.sp, color = MaterialTheme.colorScheme.primary,
                    textAlign = TextAlign.Center))
        }
    }
}

@Preview
@Composable
fun TabsComponentPreview(){
    TabsComponent()
}