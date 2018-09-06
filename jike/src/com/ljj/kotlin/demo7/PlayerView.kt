package com.ljj.kotlin.demo7

interface PlayerView {
    fun getPlayerButton()

    fun showView()
}

class MediaPlyerView(playerView: PlayerView) : PlayerView by playerView