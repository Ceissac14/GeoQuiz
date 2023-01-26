package isaac.dedios.geoquiz
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import isaac.dedios.geoquiz.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                R.string.correct_toast, Toast.LENGTH_SHORT).show()
        }
        binding.falseButton.setOnClickListener { view: View ->
            Toast.makeText(
                this,
                R.string.incorrect_toast, Toast.LENGTH_SHORT).show()

        }
        val questionTextResId = questionBank[currentIndex].textResId
        binding.questionTextView.setText(questionTextResId)
    }

        private val questionBank = listOf(
            Question(R.string.question_mexico, false),
            Question(R.string.question_oceans, true),
            Question(R.string.question_mbappe, true),
            Question(R.string.question_africa, false),
            Question(R.string.question_americas, true),
            Question(R.string.question_asia, true)
        )
        private var currentIndex = 0
}

private fun TextView.setText(questionTextResId: Any) {
    TODO("Not yet implemented")
}





