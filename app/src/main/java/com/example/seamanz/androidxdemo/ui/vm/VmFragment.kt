package com.example.seamanz.androidxdemo.ui.vm

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.seamanz.androidxdemo.R

class VmFragment : Fragment() {

    companion object {
        fun newInstance() = VmFragment()
    }

    private lateinit var viewModel: VmViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.vm_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VmViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
