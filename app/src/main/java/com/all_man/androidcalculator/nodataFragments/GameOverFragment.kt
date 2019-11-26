package com.all_man.androidcalculator.nodataFragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.all_man.androidcalculator.R
import com.all_man.androidcalculator.databinding.FragmentBananaGameBinding

class GameOverFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding : FragmentBananaGameBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_game_over, container, false)

        return binding.root
    }

}