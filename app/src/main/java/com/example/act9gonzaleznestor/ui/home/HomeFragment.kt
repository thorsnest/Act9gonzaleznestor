package com.example.act9gonzaleznestor.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.act9gonzaleznestor.Adaptador
import com.example.act9gonzaleznestor.TipusCategories
import com.example.act9gonzaleznestor.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var llistaTipusCategories: ArrayList<TipusCategories>
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val root: View = binding.root

        omplirTipus()
        initRecycler()

        return root
    }

    private fun initRecycler() {
        binding.rvTipus.layoutManager = LinearLayoutManager(this.context)
        val adaptador = Adaptador(llistaTipusCategories)
        binding.rvTipus.adapter = adaptador
    }

    private fun omplirTipus() {
        llistaTipusCategories = arrayListOf()
        val urlTitol = "https://logos-download.com/wp-content/uploads/2016/03/Media_Markt_red_textmark.png"
        val urlSmartphones = "https://cms-images.mmst.eu/osyynfyvlyjc/2bVLOFX3OyfEXHuSd7PFF4/f7eb33ed4108608df2c1e71084febc3a/tele1.png?q=80&w=264"
        val urlOrdinadors = "https://cms-images.mmst.eu/osyynfyvlyjc/hRsXNZM0LKfKKdTssQBVq/3ff9fe69641bfff508a47cf58706f754/portatil1.png?q=80&w=264"
        val urlTelevisors = "https://cms-images.mmst.eu/osyynfyvlyjc/7eiGGhEkYZBBjuZtnx1wkj/437e943b38c502667feffd4c210da7ca/tele1.png?q=80&w=264"
        val urlMovilitat = "https://cms-images.mmst.eu/osyynfyvlyjc/6RI4ZRlFJsAeg3uaiMjFM9/4879d28922b1e795e1c8357fc4bb99d9/patiente1.png?q=80&w=264"
        llistaTipusCategories.addAll(
            listOf(
                TipusCategories(0, "", urlTitol),
                TipusCategories(1, "Smartphones", urlSmartphones),
                TipusCategories(1, "Ordinadors", urlOrdinadors),
                TipusCategories(1, "Televisors", urlTelevisors),
                TipusCategories(1, "Movilitat", urlMovilitat)
            ))

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}