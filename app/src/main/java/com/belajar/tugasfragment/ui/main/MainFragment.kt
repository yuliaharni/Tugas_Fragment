package com.belajar.tugasfragment.ui.main

import com.belajar.tugasfragment.ui.main.MainViewModel
import android.view.LayoutInflater
import android.view.ViewGroup
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.belajar.tugasfragment.R
import androidx.lifecycle.ViewModelProvider
import com.belajar.tugasfragment.ui.main.MainFragment

class MainFragment : Fragment() {
    private var mViewModel: MainViewModel? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance(): MainFragment {
            return MainFragment()
        }
    }
}