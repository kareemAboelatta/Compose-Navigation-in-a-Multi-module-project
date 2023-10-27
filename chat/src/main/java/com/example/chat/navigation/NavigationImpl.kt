package com.example.chat.navigation

import androidx.compose.runtime.Composable
import com.example.chat.ui.ChatScreen
import com.example.chat.ui.GroupScreen
import com.example.chat.ui.ProfileScreen
import com.example.core.utils.ChatNavigationContract
import com.example.core.utils.NavigationEntry
import com.example.core.utils.Routes


// ChatNavigationImpl.kt in the chat module

class ChatNavigationImpl : ChatNavigationContract {
    override val entries: List<NavigationEntry> = listOf(
        object : NavigationEntry {
            override val route = Routes.Chat.Main.route
            override val composable = @Composable {
                ChatScreen()
            }
        },
        object : NavigationEntry {
            override val route = Routes.Chat.Profile.route
            override val composable = @Composable {
                ProfileScreen()
            }
        },
        object : NavigationEntry {
            override val route = Routes.Chat.Group.route
            override val composable = @Composable {
                GroupScreen()
            }
        }
    )
}


