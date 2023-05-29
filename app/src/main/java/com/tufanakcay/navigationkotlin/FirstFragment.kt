package com.tufanakcay.navigationkotlin
import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation



class FirstFragment : Fragment() {

    lateinit var first_fragment_button : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_first, container, false)
        first_fragment_button= view.findViewById(R.id.first_fragment_button)

            return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         first_fragment_button.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(40)
            //action.age = 5
            Navigation.findNavController(it).navigate(action)

    }



    }



}