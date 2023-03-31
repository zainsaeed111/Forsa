import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Models.AddImagesExampleModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentAddItemsImagesBinding

class AddItemsImages : Fragment() {
    private lateinit var binding: FragmentAddItemsImagesBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddItemsImagesBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Create sample image data for each RecyclerView
        val frontViewImagesList = listOf(
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            //AddImagesExampleModel(R.drawable.add_items_img_icon)
        )

        val sideViewImagesList = listOf(
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon)
        )

        val modelViewImagesList = listOf(
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon)
        )

        val backViewImagesList = listOf(
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon),
            AddImagesExampleModel(R.drawable.add_items_img_icon)
        )

        // Set up horizontal RecyclerViews
        binding.frontviewRecycler.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = AddImagesExampleAdapter(frontViewImagesList)
        }
        binding.sideviewRecycler.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = AddImagesExampleAdapter(sideViewImagesList)
        }
        binding.modelviewRecycler.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = AddImagesExampleAdapter(modelViewImagesList)
        }
        binding.backviewRecycler.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = AddImagesExampleAdapter(backViewImagesList)
        }
        binding.textCard.setOnClickListener {
            findNavController().navigate(R.id.productView)
        }

    }
}
