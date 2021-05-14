package com.example.a04_profilecardlayout

import androidx.compose.ui.graphics.Color
import com.example.a04_profilecardlayout.ui.theme.lightGreen

data class OnlineStatus(
    var text: String,
    var color: Color,
)

fun setOnlineStatus(status: Boolean): OnlineStatus {

    return if (status) {
        OnlineStatus(
            text = "Active",
            color = lightGreen
        )
    } else {
        OnlineStatus(
            text = "Offline",
            color = Color.Red
        )
    }
}
