package com.ljj.kotlin.demo7

class PlayerUI private constructor(){
    companion object {
        fun get(): PlayerUI{
            return Holder.instance;
        }
    }

    private object Holder{
        var instance = PlayerUI()
    }

    fun showPlayer(user: User){
        MediaPlyerView(getPlayerView(user.playerType)).showView()
    }
}