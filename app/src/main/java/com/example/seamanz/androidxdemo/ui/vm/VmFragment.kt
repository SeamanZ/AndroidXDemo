package com.example.seamanz.androidxdemo.ui.vm

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import com.example.seamanz.androidxdemo.R

class VmFragment : Fragment() {

    companion object {
        fun newInstance() = VmFragment()
    }

    private lateinit var viewModel: VmViewModel
    private lateinit var appViewModel: AppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.vm_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(VmViewModel::class.java)
        appViewModel =
            ViewModelProviders.of(activity as FragmentActivity).get(AppViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
