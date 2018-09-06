package com.ljj.kotlin.demo7

import javax.swing.JOptionPane

class BluePlayerView: PlayerView {
    override fun getPlayerButton() {
        println("显示蓝色button")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null,"显示蓝色播放器","蓝色播放器",JOptionPane.DEFAULT_OPTION)
    }
}