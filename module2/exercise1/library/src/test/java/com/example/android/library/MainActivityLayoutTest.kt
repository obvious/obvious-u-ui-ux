package com.example.android.library

import android.widget.FrameLayout
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.google.android.material.button.MaterialButton
import org.junit.Rule
import org.junit.Test

class MainActivityLayoutTest {
  @get:Rule
  val paparazzi =
    Paparazzi(deviceConfig = DeviceConfig.PIXEL_4A, theme = "AppTheme", maxPercentDifference = 0.0)

  @Test
  fun button() {
    val view = paparazzi.inflate<FrameLayout>(R.layout.activity_main)
    paparazzi.snapshot(view)
  }

  @Test
  fun button_pressed() {
    val view = paparazzi.inflate<FrameLayout>(R.layout.activity_main)
    view.findViewById<MaterialButton>(R.id.button_save).isPressed = true
    view.findViewById<MaterialButton>(R.id.button_reset).isPressed = true
    view.findViewById<MaterialButton>(R.id.button_download).isPressed = true
    paparazzi.snapshot(view)
  }

  @Test
  fun button_disabled() {
    val view = paparazzi.inflate<FrameLayout>(R.layout.activity_main)
    view.findViewById<MaterialButton>(R.id.button_save).isEnabled = false
    view.findViewById<MaterialButton>(R.id.button_reset).isEnabled = false
    view.findViewById<MaterialButton>(R.id.button_download).isEnabled = false
    paparazzi.snapshot(view)
  }
}
