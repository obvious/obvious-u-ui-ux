package com.example.android.library

import android.widget.FrameLayout
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.android.resources.NightMode
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
}
