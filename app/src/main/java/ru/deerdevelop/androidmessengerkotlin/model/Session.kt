package ru.deerdevelop.androidmessengerkotlin.model

class Session(deviceInfo: String, tokenOfDevice: String) {
    private var deviceInfo: String
    private  var tokenOfDevice: String

    init {
        this.deviceInfo = deviceInfo
        this.tokenOfDevice = tokenOfDevice
    }
}