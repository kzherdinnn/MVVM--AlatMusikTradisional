package lat.pam.simpleapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Get data from intent
        val title = intent.getStringExtra("title")
        val overview = intent.getStringExtra("overview")
        val description = intent.getStringExtra("description")
        val imageUrl = intent.getIntExtra("imageUrl", 0)

        // Initialize views
        val detailImage: ImageView = findViewById(R.id.detail_image)
        val detailTitle: TextView = findViewById(R.id.detail_title)
        val detailOverview: TextView = findViewById(R.id.detail_overview)
        val detailDescription: TextView = findViewById(R.id.detail_description)

        // Set data to views
        detailImage.setImageResource(imageUrl)
        detailTitle.text = title
        detailOverview.text = overview
        detailDescription.text = description

        // Implement share functionality
        val shareButton: ImageView = findViewById(R.id.action_share)
        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, "$title\n$overview\n\n$description")
            }
            startActivity(Intent.createChooser(shareIntent, getString(R.string.share_prompt)))
        }
    }
}