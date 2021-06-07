package com.belajar.tugasfragment.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.LiveData

class PageViewModel : ViewModel() {
    private val mName = MutableLiveData<String>()
    fun setName(name: String) {
        mName.value = name
    }

    val name: LiveData<String>
        get() = mName
}