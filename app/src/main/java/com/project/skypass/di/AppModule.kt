package com.project.skypass.di

import android.content.SharedPreferences
import com.project.skypass.data.datasource.auth.AuthDataStore
import com.project.skypass.data.datasource.auth.AuthDataStoreImpl
import com.project.skypass.data.datasource.preference.PrefDataSource
import com.project.skypass.data.datasource.preference.PrefDataSourceImpl
import com.project.skypass.data.datasource.user.UserDataSource
import com.project.skypass.data.datasource.user.UserDataSourceImpl
import com.project.skypass.data.repository.auth.AuthRepository
import com.project.skypass.data.repository.auth.AuthRepositoryImpl
import com.project.skypass.data.repository.pref.PrefRepository
import com.project.skypass.data.repository.pref.PrefRepositoryImpl
import com.project.skypass.data.repository.user.UserRepository
import com.project.skypass.data.repository.user.UserRepositoryImpl
import com.project.skypass.data.source.local.pref.UserPreference
import com.project.skypass.data.source.local.pref.UserPreferenceImpl
import com.project.skypass.data.source.network.service.ApiService
import com.project.skypass.presentation.profile.SettingsAccountViewModel
import com.project.skypass.utils.SharedPreferenceUtils
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object AppModule {

    private val networkModule: Module = module {
        single<ApiService> {
            ApiService.invoke()
        }
    }

    private val localModule = module {
        single<SharedPreferences> {
            SharedPreferenceUtils.createPreference(androidContext(), UserPreferenceImpl.PREF_NANE)
        }
        single<UserPreference> {
            UserPreferenceImpl(get())
        }
    }

    private val firebaseModule = module {

    }

    private val dataSourceModule = module {
        single<PrefDataSource> {
            PrefDataSourceImpl(get())
        }
        single<AuthDataStore> {
            AuthDataStoreImpl(get())
        }
        single<UserDataSource> {
            UserDataSourceImpl(get())
        }
    }

    private val repositoryModule = module {
        single<PrefRepository>{
            PrefRepositoryImpl(get())
        }
        single<AuthRepository> {
            AuthRepositoryImpl(get())
        }
        single<UserRepository> {
            UserRepositoryImpl(get())
        }
    }

    private val viewModelModule = module {
        viewModel{
            SettingsAccountViewModel(get())
        }
    }

    val module = listOf<Module>(
        networkModule,
        localModule,
        firebaseModule,
        dataSourceModule,
        viewModelModule,
        repositoryModule
    )
}