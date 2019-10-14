package pt.isel.pdm.trabalho1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)


    }

    fun sendMessage(view: View) {
        val intent = Intent(this, SpiritIsland::class.java)
        startActivity(intent)


    }
}
