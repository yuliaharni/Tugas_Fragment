package com.belajar.tugasfragment.ui.main

import com.belajar.tugasfragment.ui.main.PageViewModel
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import android.view.LayoutInflater
import android.view.ViewGroup
import com.belajar.tugasfragment.R
import com.google.android.material.textfield.TextInputEditText
import android.text.TextWatcher
import android.text.Editable
import android.view.View
import androidx.fragment.app.Fragment
import com.belajar.tugasfragment.ui.main.FirstFragment

class FirstFragment : Fragment() {
    private var pageViewModel: PageViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // init ViewModel
        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameEditText: TextInputEditText = view.findViewById(R.id.textInputTextName)

        // Add Text Watcher on name input text
        nameEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                pageViewModel!!.setName(charSequence.toString())
            }

            override fun afterTextChanged(editable: Editable) {}
        })
    }

    companion object {
        /**
         * Create a new instance of this fragment
         * @return A new instance of fragment FirstFragment.
         */
        @JvmStatic
        fun newInstance(): FirstFragment {
            return FirstFragment()
        }
    }
}