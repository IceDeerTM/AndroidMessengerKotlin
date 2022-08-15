package ru.deerdevelop.androidmessengerkotlin.repositories

import android.app.Application
import android.content.Context.MODE_PRIVATE
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import ru.deerdevelop.androidmessengerkotlin.model.User

class UserRepo(application: Application) {

    val application: Application

    init {
        this.application = application
    }

    public fun getFirebaseUser(): FirebaseUser? {
        while (user.firebaseUser == null) {
            val firebaseAuth = FirebaseAuth.getInstance()
            return try {
                val authResult = firebaseAuth.signInWithEmailAndPassword(user.email, user.password)
                while (!authResult.isComplete) {
                }
                authResult.result.user!!
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
        return null
    }

    fun readUserDataFromDB(): User {
        var user = User()

        try {
            val db = application.openOrCreateDatabase("messenger.db", MODE_PRIVATE, null)
            val sqlQuery = "CREATE TABLE IF NOT EXISTS users (uid TEXT, email Text, password Text, displayName Text," +
                    "nickName Text)"
            db.execSQL(sqlQuery);
            val query = db.rawQuery("SELECT * FROM users;", null);

            if (query.moveToFirst()) {
                user.uid = query.getString(0)
                user.email = query.getString(1)
                user.password = query.getString(2)
                user.displayName = query.getString(3)
                user.nickName = query.getString(4)

            }
        }
        catch (e : Exception) {

        }


        return user
    }
}