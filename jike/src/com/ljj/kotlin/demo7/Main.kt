package com.ljj.kotlin.demo7

fun main(args: Array<String>) {
    var user = User(1, "ljj", PlayerViewType.VIP("VIP播放器"))
    PlayerUI.get().showPlayer(user)
}