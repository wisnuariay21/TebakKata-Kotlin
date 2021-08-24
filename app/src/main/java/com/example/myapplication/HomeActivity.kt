package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.home.*
import org.jetbrains.anko.startActivity

class HomeActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        var skorP1 = "100"
        var skorP2 = "100"
        val intentPlayers = this.intent
        var player = ""
        if(intentPlayers.getStringExtra("player") == "2")
        {
            player = "2"
            textViewUrutanPlayer.text = "MULAI PEMAIN 2"
            buttonStartPlayer.text = "MULAI PEMAIN 2"
            textViewBerikan.text = "Berikan HP ini ke Player 2"
        }
        else
        {
            player = "1"
        }

        buttonStartPlayer.setOnClickListener {
            if(player == "1")
            {
                skorP1 = intentPlayers.getStringExtra("skorplayer1");
                var intent = Intent(this,PlayerActivity::class.java)
                intent.putExtra("player",player)
                intent.putExtra("question",editTextKataPertama.text.toString())
                intent.putExtra("answer",editTextKataKedua.text.toString())
                intent.putExtra("skorplayer1",skorP1)
                intent.putExtra("skorplayer2",skorP2)
                startActivity(intent)
                finish()
            }
            else if(player == "2")
            {
                skorP2 = intentPlayers.getStringExtra("skorplayer2");
                var intent = Intent(this,PlayerActivity::class.java)
                intent.putExtra("player",player)
                intent.putExtra("pertanyaan",editTextKataPertama.text.toString())
                intent.putExtra("jawaban",editTextKataKedua.text.toString())
                intent.putExtra("skorplayer1",skorP1)
                intent.putExtra("skorplayer2",skorP2)
                startActivity(intent)
                finish()
            }
        }

    }
}