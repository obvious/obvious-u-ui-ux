package com.example.android.library

import android.widget.FrameLayout
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.resources.NightMode
import com.google.android.material.button.MaterialButton
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class MainActivityLayoutTest(
  @TestParameter config: Config
) {
  enum class Config(val deviceConfig: DeviceConfig) {
    PIXEL_4A(DeviceConfig.PIXEL_4A),
    PIXEL_4A_NIGHT(DeviceConfig.PIXEL_4A.copy(nightMode = NightMode.NIGHT)),
  }

  @get:Rule
  val paparazzi =
    Paparazzi(deviceConfig = config.deviceConfig, theme = "AppTheme", maxPercentDifference = 0.0)

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
