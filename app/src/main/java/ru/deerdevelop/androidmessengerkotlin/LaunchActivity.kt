package ru.deerdevelop.androidmessengerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.deerdevelop.androidmessengerkotlin.ui.boot.BootFragment

class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, BootFragment.newInstance())
                .commitNow()
        }
    }
}