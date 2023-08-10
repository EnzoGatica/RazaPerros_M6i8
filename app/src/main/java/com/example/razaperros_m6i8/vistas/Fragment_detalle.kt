package com.example.razaperros_m6i8.vistas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.razaperros_m6i8.R
import com.example.razaperros_m6i8.databinding.FragmentDetalleBinding
import com.example.razaperros_m6i8.databinding.FragmentListadoRazasBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "id"

class Fragment_detalle : Fragment() {

    lateinit var binding: FragmentDetalleBinding
    private val razaViewModel: RazaViewModel by activityViewModels()


    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalleBinding.inflate(layoutInflater, container, false)
        //initAdapter()
        razaViewModel.getDetallePerroVM(param1.toString())
        return binding.root
    }

    private fun initAdapter() {

    }


}