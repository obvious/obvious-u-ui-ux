package com.example.android.library

import android.widget.FrameLayout
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class MainActivityLayoutTest {
  @get:Rule
  val paparazzi =
    Paparazzi(deviceConfig = DeviceConfig.PIXEL_4A, theme = "AppTheme", maxPercentDifference = 0.0)

  @Test
  fun layout() {
    val view = paparazzi.inflate<FrameLayout>(R.layout.activity_main)
    paparazzi.snapshot(view)
  }
}
