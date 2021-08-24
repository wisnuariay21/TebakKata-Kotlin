package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        val intent = this.intent
        var player = intent.getStringExtra("player") // player turn
        val question = intent.getStringExtra("question")
        val answer = intent.getStringExtra("answer")
        var skorP1 = intent.getStringExtra("skorplayer1")
        var skorP2 = intent.getStringExtra("skorplayer2")
        var ResSkorP1 = ""
        var ResSkorP2 = ""
        buttonPlayerResult.isEnabled = false

        if(player == "1")
        {
            textViewSkor.text = skorP1
        }
        else if (player == "2"){
            textViewSkor.text = skorP2
        }
        textViewKataTipuanPlayer.text = question.toString()

        var result = ""
        var arrayAnswer = answer.toCharArray()
        for(i in 0 until arrayAnswer.size)
        {
            result += "_"
        }
        textViewJawabanPlayer.text = result
        var resultAnswer = result.toCharArray()
        var userAnswer = ""

        var TempSkorP1 = skorP1.toInt()
        var TempSkorP2 = skorP2.toInt()
        fun checkWord(word:String) { //a
            var status = false
            var alfabetChar = word.toCharArray()
            //for(i in 0 until  superResult.size step 2){
            for (i in 0 until arrayAnswer.size) {
                if (arrayAnswer[i] == (alfabetChar[0])) {
                    resultAnswer[i] = alfabetChar[0]
                    status = true
                }
            }
            if (status == false) {
                if (player == "1") {
                    TempSkorP1 = TempSkorP1 - 10
                    textViewSkor.text = TempSkorP1.toString()
                } else if (player == "2") {
                    TempSkorP2 = TempSkorP2 - 10
                    textViewSkor.text = TempSkorP2.toString()
                }
            }
            for (i in 0 until resultAnswer.size) {
                userAnswer += resultAnswer[i].toString()
                if (userAnswer.length > arrayAnswer.size) {
                    userAnswer = userAnswer.substring(arrayAnswer.size)
                }
            }

            textViewJawabanPlayer.text = userAnswer
            ResSkorP1 = TempSkorP1.toString()
            ResSkorP2 = TempSkorP2.toString()
            if(textViewJawabanPlayer.text == answer)
            {
                if(player == "1"){
                    var intentFinal= Intent(this,HomeActivity::class.java)
                    player = "2"
                    intentFinal.putExtra("player",player)
                    intentFinal.putExtra("skorplayer1",ResSkorP1)
                    intentFinal.putExtra("skorplayer2",ResSkorP2)
                    startActivity(intentFinal)
                    finish()
                }
                else if(player == "2"){
                    buttonPlayerResult.isEnabled = true
                }
            }
        }
        buttonPlayerResult.setOnClickListener {
            var intentRes = Intent(this,Result::class.java)
            intentRes.putExtra("skorplayer1",ResSkorP1)
            intentRes.putExtra("skorplayer2",ResSkorP2)
            startActivity(intentRes)
            finish()
        }

        buttonA.setOnClickListener {
            checkWord("a")
            buttonA.isEnabled = false
        }
        buttonB.setOnClickListener {
            checkWord("b")
            buttonB.isEnabled = false
        }
        buttonC.setOnClickListener {
            checkWord("c")
            buttonC.isEnabled = false
        }
        buttonD.setOnClickListener {
            checkWord("d")
            buttonD.isEnabled = false
        }
        buttonE.setOnClickListener {
            checkWord("e")
            buttonE.isEnabled = false
        }
        buttonF.setOnClickListener {
            checkWord("f")
            buttonF.isEnabled = false
        }
        buttonG.setOnClickListener {
            checkWord("g")
            buttonG.isEnabled = false
        }
        buttonH.setOnClickListener {
            checkWord("h")
            buttonH.isEnabled = false
        }
        buttonI.setOnClickListener {
            checkWord("i")
            buttonI.isEnabled = false
        }
        buttonJ.setOnClickListener {
            checkWord("j")
            buttonJ.isEnabled = false
        }
        buttonK.setOnClickListener {
            checkWord("k")
            buttonK.isEnabled = false
        }
        buttonL.setOnClickListener {
            checkWord("l")
            buttonL.isEnabled = false
        }
        buttonM.setOnClickListener {
            checkWord("m")
            buttonM.isEnabled = false
        }
        buttonN.setOnClickListener {
            checkWord("n")
            buttonN.isEnabled = false
        }
        buttonO.setOnClickListener {
            checkWord("o")
            buttonO.isEnabled = false
        }
        buttonP.setOnClickListener {
            checkWord("p")
            buttonP.isEnabled = false
        }
        buttonQ.setOnClickListener {
            checkWord("q")
            buttonQ.isEnabled = false
        }



    }
}
