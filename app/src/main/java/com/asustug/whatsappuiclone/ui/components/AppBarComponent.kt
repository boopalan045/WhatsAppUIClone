package com.asustug.whatsappuiclone.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.asustug.whatsappuiclone.R
import com.asustug.whatsappuiclone.ui.theme.gray

@Composable
fun AppBarComponent() {
    Row(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp)
        .background(MaterialTheme.colorScheme.primary)
        .padding(top = 16.dp, start = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = stringResource(id = R.string.whatsapp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = if(isSystemInDarkTheme()) gray else Color.White
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        Icon(painter = painterResource(id = R.drawable.baseline_search_24), contentDescription = "", tint = MaterialTheme.colorScheme.tertiary)
        Spacer(modifier = Modifier.size(20.dp))
        Icon(painter = painterResource(id = R.drawable.baseline_camera_alt_24), contentDescription = "", tint = MaterialTheme.colorScheme.tertiary)
        Spacer(modifier = Modifier.size(20.dp))
        Icon(painter = painterResource(id = R.drawable.baseline_more_vert_24), contentDescription = "", tint = MaterialTheme.colorScheme.tertiary)
    }
}

@Preview
@Composable
fun AppBarComponentPreview() {
    AppBarComponent()
}