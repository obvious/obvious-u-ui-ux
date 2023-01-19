package com.example.android.library

import android.view.ViewGroup
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.google.testing.junit.testparameterinjector.TestParameter
import com.google.testing.junit.testparameterinjector.TestParameterInjector
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(TestParameterInjector::class)
class MainActivityTest(
  @TestParameter config: Config
) {
  enum class Config(val deviceConfig: DeviceConfig) {
    PIXEL_4A(DeviceConfig.PIXEL_4A)
  }

  @get:Rule
  val paparazzi =
    Paparazzi(deviceConfig = config.deviceConfig, theme = "AppTheme", maxPercentDifference = 0.0)

  @Test
  fun layout() {
    val view = paparazzi.inflate<ViewGroup>(R.layout.activity_main)
    paparazzi.snapshot(view)
  }
}
