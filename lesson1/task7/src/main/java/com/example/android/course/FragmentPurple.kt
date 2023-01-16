package com.example.android.course

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment

class FragmentPurple : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    TODO("Inflate layout with Purple theme")
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    view.findViewById<AppCompatButton>(R.id.btn_next).setOnClickListener {
      parentFragmentManager.beginTransaction()
        .replace(R.id.fragment_container, FragmentViolet())
        .addToBackStack(null)
        .commit()
    }
    view.findViewById<TextView>(R.id.tv_title)
      .setTextColor(ColorStateList.valueOf(requireContext().resolveColor(R.attr.colorPrimary)))
  }
}
