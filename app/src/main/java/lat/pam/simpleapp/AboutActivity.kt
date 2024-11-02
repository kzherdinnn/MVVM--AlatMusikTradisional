package lat.pam.simpleapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lat.pam.simpleapp.R

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val profileImage: ImageView = findViewById(R.id.profile_image)
        val name: TextView = findViewById(R.id.name)
        val email: TextView = findViewById(R.id.email)

        profileImage.setImageResource(R.drawable.profile) // Set image to a profile image in drawable
        name.text = "Herdin Kristianjani Zebua"
        email.text = "1227050053@student.uinsgd.ac.id"
    }
}

