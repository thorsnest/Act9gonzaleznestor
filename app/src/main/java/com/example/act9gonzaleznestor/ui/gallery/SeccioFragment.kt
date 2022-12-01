package com.example.act9gonzaleznestor.ui.gallery

import android.icu.lang.UCharacter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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
        when(arguments?.getInt("key")){
            1 -> omplirSmartphones()
            2 -> omplirOrdinadors()
            3 -> omplirTelevisors()
            4 -> omplirMovilitat()
        }
        _binding = FragmentSeccioBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    private fun omplirSmartphones() {

    }

    private fun omplirOrdinadors() {

    }

    private fun omplirTelevisors() {

    }

    private fun omplirMovilitat() {

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}