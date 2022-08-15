package ru.deerdevelop.androidmessengerkotlin.model

import android.graphics.Bitmap
import com.google.firebase.auth.FirebaseUser

class User {
    public var email: String
        get() = email
        set(value) {
        email = value
    }
    public  var displayName: String
        get() = displayName
        set(value) {
            displayName = value
        }
    public var nickName: String
            get() = nickName
            set(value) {
                nickName = value
            }
    public var password: String
        get() = password
        set(value) {
            password = value
        }
    public var photo: Bitmap
        get() = photo
        set(value) {
            photo = value
        }
    public var firebaseUser: FirebaseUser
        get() = firebaseUser
        set(value) {
            firebaseUser = value
        }
    public var uid: String
        get() = uid
        set(value) {
            uid = value
        }

}