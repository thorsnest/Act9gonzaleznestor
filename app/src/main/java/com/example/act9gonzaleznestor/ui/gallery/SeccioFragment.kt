package com.example.act9gonzaleznestor.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.act9gonzaleznestor.R
import com.example.act9gonzaleznestor.databinding.FragmentSeccioBinding

class SeccioFragment : Fragment() {

    private var _binding: FragmentSeccioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeccioBinding.inflate(inflater, container, false)
        val root: View = binding.root
        when(arguments?.getInt("key")){
            1 -> omplirSmartphones()
            2 -> omplirOrdinadors()
            3 -> omplirTelevisors()
            4 -> omplirMovilitat()
        }
        return root
    }

    private fun omplirSmartphones() {
        binding.textGallery.text = getString(R.string.smartphones)
    }

    private fun omplirOrdinadors() {
        binding.textGallery.text = getString(R.string.ordinadors)
    }

    private fun omplirTelevisors() {
        binding.textGallery.text = getString(R.string.televisors)
    }

    private fun omplirMovilitat() {
        binding.textGallery.text = getString(R.string.movilitat)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}