package com.project.skypass

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.project.skypass.di.AppModule
import com.project.skypass.presentation.profile.SettingsAccountViewModel
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(AppModule.module) // Ensure this references the correct property
        }

        val settingsViewModel: SettingsAccountViewModel = getKoin().get()
        settingsViewModel.isUsingDarkMode.observeForever { isUsingDarkMode ->
            AppCompatDelegate.setDefaultNightMode(
                if (isUsingDarkMode) AppCompatDelegate.MODE_NIGHT_YES
                else AppCompatDelegate.MODE_NIGHT_NO
            )
        }
    }
}
