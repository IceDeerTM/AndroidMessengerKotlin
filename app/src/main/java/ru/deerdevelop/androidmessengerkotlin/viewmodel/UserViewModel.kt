package ru.deerdevelop.androidmessengerkotlin.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch
import ru.deerdevelop.androidmessengerkotlin.repositories.UserRepo
import ru.deerdevelop.androidmessengerkotlin.ui.boot.BootViewModel

class UserViewModel(application: Application): AndroidViewModel(application) {

    private val userRepo: UserRepo = UserRepo(application)
    private var firebaseUser: MutableLiveData<FirebaseUser> = MutableLiveData()

    suspend fun connectToFirebaseService() = coroutineScope {
        launch {
            firebaseUser.postValue(userRepo.getFirebaseUser())

        }
    }

    fun readUserData() {

    }

}