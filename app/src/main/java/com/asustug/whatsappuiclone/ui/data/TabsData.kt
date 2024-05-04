package com.asustug.whatsappuiclone.ui.data

data class TabsData(val title : String, val unReadCount : Int?)

val tabs = listOf(
    TabsData(Tabs.CHATS.value, unReadCount = null),
    TabsData(Tabs.STATUS.value, unReadCount = null),
    TabsData(Tabs.CALLS.value, unReadCount = 4),
)

enum class Tabs(val value : String) {
    CHATS("Chats"),
    STATUS("Status"),
    CALLS("Calls")
}