package ru.deerdevelop.androidmessengerkotlin.model

class MessageInterlocutor(textMessage: String, senderNickName: String, receiverNickName: String, override var type: Int):
    MessageAdapterType(textMessage, senderNickName, receiverNickName)  {

    init {
        type = 1
    }

}