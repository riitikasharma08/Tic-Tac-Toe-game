package com.neatroots.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neatroots.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
         lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.playOfflineBtn.setOnClickListener{
            createOfflineGame()

        }
    }
    fun createOfflineGame(){
        GameData.saveGameModel(
            GameModel(
                gameStatus = GameStatus.JOINED
            )
        )
         startGame()
    }
    fun startGame(){
     startActivity(Intent(this,GameActivity::class.java))
    }
}