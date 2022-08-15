package ru.deerdevelop.androidmessengerkotlin.ui.boot

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.deerdevelop.androidmessengerkotlin.R

class BootFragment : Fragment() {

    companion object {
        fun newInstance() = BootFragment()
    }

    private lateinit var viewModel: BootViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.boot_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(BootViewModel::class.java)
        // TODO: Use the ViewModel
    }

}