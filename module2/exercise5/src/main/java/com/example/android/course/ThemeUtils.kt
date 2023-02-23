package com.example.android.course

import android.content.Context
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt

@ColorInt
fun Context.resolveColor(@AttrRes attrRes: Int): Int {
  val color: Int
  val ta = theme.obtainStyledAttributes(intArrayOf(attrRes))
  color = ta.getColor(0, 0)
  ta.recycle()
  return color
}
