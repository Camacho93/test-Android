package com.example.testandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.testandroid.databinding.FragmentSegundoBinding


class SegundoFragment : Fragment() {


    private var _binding: FragmentSegundoBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var name: String ? = ""
    private var lastName: String ? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name = requireArguments().getString(NAME)
        lastName = requireArguments().getString(LASTNAME)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSegundoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fullName.text = "$name $lastName"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val NAME = "NAME"
        private const val LASTNAME = "LASTNAME"

        @JvmStatic
        fun newInstance(name: String, lastName: String) =
            SegundoFragment().apply {
                arguments = bundleOf(NAME to name, LASTNAME to lastName)
            }
    }
}