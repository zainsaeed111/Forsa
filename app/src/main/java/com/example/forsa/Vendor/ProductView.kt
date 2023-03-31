import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.forsa.Adapters.ProductViewExampleAdapter
import com.example.forsa.Models.AddImagesExampleModel
import com.example.forsa.R
import com.example.forsa.databinding.FragmentProductViewBinding

class ProductView : Fragment() {

    private lateinit var binding: FragmentProductViewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentProductViewBinding.inflate(layoutInflater, container, false)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val productviewImgList = listOf(
            AddImagesExampleModel(R.drawable.bagimg_ii),
            AddImagesExampleModel(R.drawable.bagimg_ii),
            AddImagesExampleModel(R.drawable.bagimg_iii),
            AddImagesExampleModel(R.drawable.bagimg_iv),
            AddImagesExampleModel(R.drawable.bagimg_v)
        )
        // Set up horizontal RecyclerViews
        binding.productviewRecycler.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            adapter = ProductViewExampleAdapter(productviewImgList) { clickedImage: Int ->
                // When an image is clicked, show it in the image view above the RecyclerView
                binding.productviewselectedImg.setImageResource(clickedImage)
            }

            binding.btnPost.setOnClickListener {
                findNavController().navigate(R.id.allitems)
            }

            binding.btnEdit.setOnClickListener {
                findNavController().navigate(R.id.updatePersonalInfo)
            }

            binding.priceText.setOnClickListener {
                findNavController().navigate(R.id.updateBusinessInfo)
            }
        }


    }

}
