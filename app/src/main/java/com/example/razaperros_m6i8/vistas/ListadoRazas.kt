package com.example.razaperros_m6i8.vistas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.razaperros_m6i8.databinding.FragmentListadoRazasBinding


class ListadoRazas : Fragment() {

    lateinit var binding: FragmentListadoRazasBinding
    private val razaViewModel: RazaViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListadoRazasBinding.inflate(layoutInflater, container, false)
        initAdapter()
        razaViewModel.getAllRazas()
        return binding.root
    }

    private fun initAdapter() {
        val adapter = AdapterRazas()

        binding.recyclerView.adapter = adapter
        razaViewModel.razaLiveData().observe(viewLifecycleOwner){
            adapter.setData(it)
        }
    }


}