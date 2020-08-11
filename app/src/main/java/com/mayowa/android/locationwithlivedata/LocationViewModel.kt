package com.mayowa.android.locationwithlivedata

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class LocationViewModel(application: Application) : AndroidViewModel(application) {

    val locationData = LocationLiveData(application)
}
