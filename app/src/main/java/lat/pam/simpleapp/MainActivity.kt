package lat.pam.simpleapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var aboutIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val instruments = listOf(
            Instrument(
                "Angklung",
                "Alat musik bambu dari Jawa Barat",
                "Angklung adalah alat musik multitonal (bernada ganda) yang secara tradisional berkembang dalam masyarakat Sunda di Jawa Barat. Alat musik ini terbuat dari bambu, dimainkan dengan cara digoyangkan.",
                R.drawable.angklung,
                R.drawable.angklung
            ),
            Instrument(
                "Gamelan",
                "Ensemble musik tradisional Jawa dan Bali",
                "Gamelan adalah ensembel musik tradisional Indonesia yang terdiri dari beberapa alat musik seperti gong, kenong, dan saron. Gamelan biasa digunakan dalam berbagai acara adat di Jawa dan Bali.",
                R.drawable.gamelan,
                R.drawable.gamelan
            ),
            Instrument(
                "Sasando",
                "Alat musik petik dari Nusa Tenggara Timur",
                "Sasando adalah alat musik petik khas dari Pulau Rote, Nusa Tenggara Timur. Alat musik ini terbuat dari bambu yang dilingkupi oleh daun lontar yang memberikan bentuk khas seperti kipas.",
                R.drawable.sasando,
                R.drawable.sasando
            ),
            Instrument(
                "Kendang",
                "Alat musik perkusi dari Jawa dan Sunda",
                "Kendang atau gendang adalah alat musik tradisional yang dimainkan dengan cara dipukul. Biasanya digunakan sebagai pengiring dalam gamelan dan berbagai tarian tradisional di Jawa dan Sunda.",
                R.drawable.kendang,
                R.drawable.kendang
            ),
            Instrument(
                "Tifa",
                "Alat musik perkusi dari Maluku dan Papua",
                "Tifa adalah alat musik tradisional Maluku dan Papua yang dimainkan dengan cara dipukul. Alat musik ini terbuat dari kayu dan kulit hewan, dan biasanya digunakan dalam upacara adat dan tarian tradisional.",
                R.drawable.tifa,
                R.drawable.tifa
            ),
            Instrument(
                "Suling",
                "Alat musik tiup dari bambu",
                "Suling adalah alat musik tiup yang terbuat dari bambu. Alat musik ini banyak ditemukan di berbagai daerah di Indonesia dan memiliki peran penting dalam musik tradisional, terutama di Jawa dan Bali.",
                R.drawable.suling,
                R.drawable.suling
            ),
            Instrument(
                "Kolintang",
                "Alat musik perkusi dari Minahasa, Sulawesi Utara",
                "Kolintang adalah alat musik tradisional dari Minahasa, Sulawesi Utara. Terbuat dari kayu, kolintang dimainkan dengan cara dipukul dan sering digunakan dalam berbagai acara adat dan hiburan.",
                R.drawable.kolintang,
                R.drawable.kolintang
            ),
            Instrument(
                "Rebab",
                "Alat musik gesek dari Jawa",
                "Rebab adalah alat musik gesek yang merupakan bagian dari ensambel gamelan Jawa. Alat musik ini memiliki dua atau tiga dawai yang dimainkan dengan cara digesek dan biasanya digunakan dalam musik pengiring wayang.",
                R.drawable.rebab,
                R.drawable.rebab
            ),
            Instrument(
                "Bonang",
                "Alat musik perkusi dari gamelan Jawa",
                "Bonang adalah salah satu instrumen dalam gamelan Jawa yang terbuat dari logam dan dimainkan dengan cara dipukul. Alat ini menghasilkan nada yang berperan penting dalam musik gamelan.",
                R.drawable.bonang,
                R.drawable.bonang
            ),
            Instrument(
                "Kecapi",
                "Alat musik petik dari Sunda",
                "Kecapi adalah alat musik petik khas Sunda yang dimainkan dengan cara memetik dawai. Alat ini biasa digunakan dalam musik tradisional Sunda, seperti dalam tembang Sunda atau kacapi suling.",
                R.drawable.kecapi,
                R.drawable.kecapi
            )
        )

        recyclerView.adapter = InstrumentAdapter(this, instruments)

        // Setup ikon About
        aboutIcon = findViewById(R.id.about_icon)
        aboutIcon.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
