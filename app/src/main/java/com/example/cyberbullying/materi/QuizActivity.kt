package com.example.cyberbullying.materi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.cyberbullying.R

class QuizActivity : AppCompatActivity() {

    private var correctAnswerCount:Int=0
    private var wrongAnswerCount:Int=0
    lateinit var questionsList:ArrayList<QuestionModel>
    private var index:Int = 0
    lateinit var questionModel: QuestionModel
    private var backPressedTime: Long = 0
    private var backToast: Toast? = null

    lateinit var questions: TextView
    lateinit var option1: Button
    lateinit var option2:Button
    lateinit var option3:Button
    lateinit var option4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        supportActionBar?.hide()

        questionsList= ArrayList()
        questionsList.add(QuestionModel("What is actually electricity?","A flow of water","A flow of air","A flow of electrons"," A flow of atoms","A flow of electrons"))
        questionsList.add(QuestionModel("What is the speed of sound?","120 km/h","1,200 km/h","400 km/h","700 km/h","1,200 km/h"))
        questionsList.add(QuestionModel("What is the main component of the sun?","Liquid lava","Gas","Molten iron","Rock","Gas"))
        questionsList.add(QuestionModel("Which of the following animals can run the fastest?","Cheetah","Leopard","Tiger","Lion","Cheetah"))
        questionsList.add(QuestionModel("Which company is known for publishing the Mario video game?","Xbox","Nintendo","SEGA","Electronic Arts","Nintendo"))

        //questionsList.shuffle()
        questionModel= questionsList[index]

        setAllQuestions()
    }

    private fun setAllQuestions() {
        questions.text=questionModel.question
        option1.text=questionModel.option1
        option2.text=questionModel.option2
        option3.text=questionModel.option3
        option4.text=questionModel.option4
    }

    
}