package rey.jose.popcornfactory

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import kotlinx.android.synthetic.main.cell_movie.view.*
import java.io.BufferedReader

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intento: Intent = Intent(this, CatalogoActivity::class.java)

        val boton: Button = findViewById(R.id.buttonp) as Button

        boton.setOnClickListener {
            startActivity(intento)
        }
    }
}
