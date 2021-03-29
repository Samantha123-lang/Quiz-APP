package com.example.myapplication2


object Constants{
    const val TOTAL_QUESTIONS: String="total_questions"
    const val USER_NAME:String="user_name"
    const val CORRECT_ANSWERS:String="correct_answers"
    fun getQuestions():ArrayList<Question>{
        val questionsList =ArrayList<Question>()


        val que1 = Question(1,
        "what is the name of the flower?",
        R.drawable.flower_1,
        "Daisy",
        "Rose",
        "Marigold",
        "Lily ",
        2
        )
        questionsList.add(que1)

        val que2 = Question(2,
        "what shape is on the bag? " ,
        R.drawable.shape_1,
        "circle ",
        "heart",
        "rectangle",
        "none ",
        2
        )
        questionsList.add(que2)

        val que3 = Question(3,
        "which number is shown? " ,
        R.drawable.number_4,
        "3",
        "20",
        "0",
        "4",
        4
        )
        questionsList.add(que3)

        val que4 = Question(4,
        "what is this " ,
        R.drawable.headphones_1,
        "headphones ",
        "microphone ",
        "drum ",
        "none of the above  ",
        1
        )
        questionsList.add(que4)

        val que5 = Question(5,
        "which number is shown?" ,
        R.drawable.number_3,
        "2",
        "5",
        "3",
        "100",
        3
        )
        questionsList.add(que5)

        val que6 = Question(6,
                "which number is shown?" ,
                R.drawable.number_1,
                "2",
                "1",
                "3",
                "100",
                2
        )
        questionsList.add(que6)

        val que7 = Question(7,
                "which number is shown?" ,
                R.drawable.number_2,
                "2",
                "1",
                "3",
                "100",
                1
        )
        questionsList.add(que7)

        val que8 = Question(7,
                "what is the background color?" ,
                R.drawable.violet_ryb,
                "red",
                "blue",
                "Violet",
                "purple",
                3
        )
        questionsList.add(que8)



        return questionsList

    }
}