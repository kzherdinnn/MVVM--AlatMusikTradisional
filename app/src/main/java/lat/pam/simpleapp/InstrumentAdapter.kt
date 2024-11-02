package lat.pam.simpleapp

// InstrumentAdapter.ktimport android.content.Context
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import lat.pam.simpleapp.DetailActivity
import lat.pam.simpleapp.R

class InstrumentAdapter(private val context: Context, private val instruments: List<Instrument>) :
    RecyclerView.Adapter<InstrumentAdapter.InstrumentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstrumentViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return InstrumentViewHolder(view)
    }

    override fun onBindViewHolder(holder: InstrumentViewHolder, position: Int) {
        val instrument = instruments[position]
        holder.bind(instrument)
    }

    override fun getItemCount(): Int = instruments.size

    inner class InstrumentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val itemImage: ImageView = itemView.findViewById(R.id.item_image)
        private val itemTitle: TextView = itemView.findViewById(R.id.item_title)
        private val itemDescription: TextView = itemView.findViewById(R.id.item_description)

        fun bind(instrument: Instrument) {
            itemImage.setImageResource(instrument.imageUrl)
            itemTitle.text = instrument.title
            // Menampilkan deskripsi yang dipotong
            itemDescription.text = instrument.description

            itemView.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra("title", instrument.title)
                intent.putExtra("overview", instrument.overview)
                intent.putExtra("description", instrument.description)
                intent.putExtra("imageUrl", instrument.imageUrl)
                context.startActivity(intent)
            }
        }
    }
}