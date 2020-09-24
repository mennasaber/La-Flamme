package adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.midriss.R
import com.example.midriss.ui.activties.QuestionActivity
import models.ChooseQuestion

class ResultAdapter(
    private val questionsList: ArrayList<ChooseQuestion>,
    private val answerMapBoolean: ArrayList<Boolean>,
    private val answerMapIndex: ArrayList<Int>
) : RecyclerView.Adapter<ResultAdapter.ResultViewHolder>() {
    class ResultViewHolder(var item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        return ResultViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.question_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return questionsList.count()
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        holder.item.apply {
            val questionTextView = findViewById<TextView>(R.id.questionTextView)
            val imageView = findViewById<ImageView>(R.id.imageView)
            if (!answerMapBoolean[position])
                imageView.setImageDrawable(resources.getDrawable(R.drawable.ic_wrong))
            questionTextView.text = questionsList[position].question
            questionTextView.setOnClickListener {
                val intent = Intent(context, QuestionActivity::class.java)
                intent.putExtra("question", questionsList[position])
                intent.putExtra("answerIndex", answerMapIndex[position])
                context.startActivity(intent)
            }
        }
    }
}