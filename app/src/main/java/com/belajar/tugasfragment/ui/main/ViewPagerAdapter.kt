package com.belajar.tugasfragment.ui.main

import android.content.Context
import com.belajar.tugasfragment.ui.main.FirstFragment.Companion.newInstance
import com.belajar.tugasfragment.ui.main.SecondFragment.Companion.newInstance
import androidx.fragment.app.FragmentPagerAdapter
import com.belajar.tugasfragment.ui.main.FirstFragment
import com.belajar.tugasfragment.ui.main.SecondFragment
import com.belajar.tugasfragment.ui.main.ViewPagerAdapter
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.belajar.tugasfragment.R

class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        return if (position == 0) {
            FirstFragment.newInstance()
        } else {
            SecondFragment.newInstance()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }

    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2)
    }

}