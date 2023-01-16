package com.example.android.course

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android.library.R

class FragmentViolet : Fragment() {
  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    return layoutInflater.inflate(R.layout.fragment_violet, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    view.findViewById<Button>(R.id.btn_back).setOnClickListener {
      parentFragmentManager.popBackStack()
    }
    view.findViewById<TextView>(R.id.tv_title)
      .setTextColor(ColorStateList.valueOf(requireContext().resolveColor(R.attr.colorPrimary)))
  }
}
