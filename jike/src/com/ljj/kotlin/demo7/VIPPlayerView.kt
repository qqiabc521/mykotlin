package com.ljj.kotlin.demo7

import javax.swing.JOptionPane

val TITLE = "播放器标题"
val MESSAGE = "播放器消息"

class VIPPlayerView(var title: String?, var message: String?) : PlayerView {

    init {
        println("主构造方法")
        title = title ?: TITLE
        message = message ?: MESSAGE
    }

    constructor(): this(TITLE, MESSAGE) {
        println("无参构造方法")
    }

    constructor(message: String): this(TITLE, message) {
        println("一个无参的构造方法")
    }

    override fun getPlayerButton() {
        println("VIP button")
    }

    override fun showView() {
        JOptionPane.showConfirmDialog(null, message, title, JOptionPane.DEFAULT_OPTION)
    }
}