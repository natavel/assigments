package ru.cosiness.myapplication
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Natasha on 27.11.2020.
 * tg: natavel
 */
class FragmentMoviesList:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_movies_list)
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d(TAG, "$LOG_PREFIX::onSaveInstanceState")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "$LOG_PREFIX::onRestoreInstanceState")
    }

    companion object {
        private const val TAG = "rere"
        private const val LOG_PREFIX = "fdfd"
    }
}