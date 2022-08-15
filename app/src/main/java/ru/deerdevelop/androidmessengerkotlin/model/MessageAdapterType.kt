package ru.deerdevelop.androidmessengerkotlin.model

abstract class MessageAdapterType(textMessage: String, senderNickName: String, receiverNickName: String):
    Message(textMessage, senderNickName, receiverNickName) {

    abstract var type: Int

    public fun getItemType(): Int {
        return type
    }
}