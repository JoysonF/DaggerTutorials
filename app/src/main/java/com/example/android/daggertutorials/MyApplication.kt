package com.example.android.daggertutorials

import android.app.Application
import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.user.UserManager

open class MyApplication : Application() {

    open val userManager by lazy {
        UserManager(SharedPreferencesStorage(this))
    }
}
