package com.hashin.android.seng31323.ui.main

import android.annotation.SuppressLint
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Observer
import com.hashin.android.seng31323.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var view =inflater.inflate(R.layout.fragment_main, container, false)
        var message = view?.findViewById<TextView>(R.id.message)

           // message.text = viewModel.result.value.toString()
//

        viewModel.result.observe(viewLifecycleOwner, Observer{
            message?.text = it.toString()
        })


        var addButton = view.findViewById<Button>(R.id.addButton)
        addButton.setOnClickListener {
            val txtname: EditText = view.findViewById(R.id.Number1)
            val name: String = txtname.getText().toString()
            var n: Double = name.toDouble()

            val txtname1: EditText = view.findViewById(R.id.Number2)
            val name1:String = txtname1.getText().toString()
            var m: Double= name1.toDouble()
            viewModel.add(n,m)

        }
        var minusButton = view.findViewById<Button>(R.id.minusButton)
        minusButton.setOnClickListener {
            val txtname: EditText = view.findViewById(R.id.Number1)
            val name: String = txtname.getText().toString()
            var n: Double = name.toDouble()

            val txtname1: EditText = view.findViewById(R.id.Number2)
            val name1:String = txtname1.getText().toString()
            var m: Double= name1.toDouble()
            viewModel.minus(n,m)
        }

        var divideButton = view.findViewById<Button>(R.id.divideButton)
        divideButton.setOnClickListener {
            val txtname: EditText = view.findViewById(R.id.Number1)
            val name: String = txtname.getText().toString()
            var n: Double = name.toDouble()

            val txtname1: EditText = view.findViewById(R.id.Number2)
            val name1:String = txtname1.getText().toString()
            var m: Double= name1.toDouble()
            viewModel.divide(n,m)
        }
        var multiButton = view.findViewById<Button>(R.id.multiplyButton)
        multiButton.setOnClickListener {
            val txtname: EditText = view.findViewById(R.id.Number1)
            val name: String = txtname.getText().toString()
            var n: Double = name.toDouble()

            val txtname1: EditText = view.findViewById(R.id.Number2)
            val name1:String = txtname1.getText().toString()
            var m: Double= name1.toDouble()
            viewModel.multi(n,m)
        }
        return view
    }

}