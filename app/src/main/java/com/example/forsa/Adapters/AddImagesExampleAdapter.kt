import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.forsa.Models.AddImagesExampleModel
import com.example.forsa.R

class AddImagesExampleAdapter(private val imagesList: List<AddImagesExampleModel>, private val listener: ((Int) -> Unit)? = null) :
    RecyclerView.Adapter<AddImagesExampleAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.galleryImg)

        fun bind(imageModel: AddImagesExampleModel) {
            // Set image using the drawable resource ID
            image.setImageResource(imageModel.add_items_Images)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.add_images_list_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(imagesList[position])
        holder.itemView.setOnClickListener {
            listener?.invoke(imagesList[position].add_items_Images)
        }
    }

    override fun getItemCount(): Int {
        return imagesList.size
    }
}
