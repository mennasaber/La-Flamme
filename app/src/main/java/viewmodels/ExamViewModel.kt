package viewmodels

import androidx.lifecycle.ViewModel

class ExamViewModel : ViewModel() {
    var currentQuestionIndex = 0
    var correctCount = 0
    var answerMapBoolean = ArrayList<Boolean>()
    var answerMapIndex = ArrayList<Int>()
    var timeCount = 60000 * 40L
}