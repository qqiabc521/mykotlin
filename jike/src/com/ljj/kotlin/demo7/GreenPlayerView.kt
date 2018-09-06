package com.ljj.kotlin.demo7

import javax.swing.JOptionPane

class GreenPlayerView: PlayerView {
    override fun getPlayerButton() {
        println("显示绿色button")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null,"显示绿色播放器","绿色播放器",JOptionPane.DEFAULT_OPTION)
    }
}