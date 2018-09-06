package com.ljj.kotlin.demo7

data class User(var id: Int,
                var name: String,
                var playerType: PlayerViewType = PlayerViewType.BLUE)