package isaac.dedios.geoquiz

import androidx.annotation.StringRes

class Question(questionMexico: Int, b: Boolean) {
    val textResId: Any
        get() {
            TODO()
        }


    data class Question(@StringRes val textResId: Int, val answer: Boolean)
}