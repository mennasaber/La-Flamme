package adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.midriss.R
import com.example.midriss.ui.activties.ExamsActivity

class LessonsAdapter(
    private val lessonsList: ArrayList<String>
) : RecyclerView.Adapter<LessonsAdapter.LessonsViewHolder>() {
    class LessonsViewHolder(var item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonsViewHolder {
        return LessonsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.lesson_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return lessonsList.count()
    }

    override fun onBindViewHolder(holder: LessonsViewHolder, position: Int) {
        holder.item.apply {
            val lessonButton = findViewById<Button>(R.id.lessonButton)
            lessonButton.text = lessonsList[position]
            lessonButton.setOnClickListener {
                val intent = Intent(context, ExamsActivity::class.java)
                intent.putExtra("lessonId", position + 1)
                context.startActivity(intent)
            }
        }
    }
}