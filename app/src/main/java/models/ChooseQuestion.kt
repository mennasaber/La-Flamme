package models

import java.io.Serializable

class ChooseQuestion(
    val question: String,
    val r1: String,
    val r2: String,
    val r3: String,
    val r4: String,
    val correct: Int
) : Serializable