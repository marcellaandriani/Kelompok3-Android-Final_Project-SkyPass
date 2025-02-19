package com.project.skypass.utils

import java.text.NumberFormat
import java.util.Locale

fun Double?.doubleToCurrency(
    language: String,
    country: String,
): String? {
    return try {
        val localeID = Locale(language, country)
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)
        numberFormat.format(this).toString().replace("Rp", "")
    } catch (e: Exception) {
        null
    }
}

fun Double?.toIndonesianFormat() = this.doubleToCurrency("in", "ID")
