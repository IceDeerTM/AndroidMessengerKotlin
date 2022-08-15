package ru.deerdevelop.androidmessengerkotlin.model

open class Message(textMessage: String, senderNickName: String, receiverNickName: String) {
    protected var messageId: String
        get() = messageId
        set(value) { messageId = value }
    protected var dateSend: String
        get() = dateSend
        set(value) { dateSend = value }
    protected var textMessage: String
        get() = textMessage
        set(value) { textMessage = value }
    protected var senderNickName: String
        get() = senderNickName
        set(value) { senderNickName = value }
    protected var receiverNickName: String
        get() = receiverNickName
        set(value) { receiverNickName = value }

    init {
        this.messageId = "unknown";
        this.dateSend = "unknown";
        this.textMessage = textMessage;
        this.senderNickName = senderNickName;
        this.receiverNickName = receiverNickName;
    }

    public constructor(messageId: String, dateSend: String, textMessage: String, senderNickName: String,
                       receiverNickName: String) : this(textMessage, senderNickName, receiverNickName) {
        this.messageId = messageId;
        this.dateSend = dateSend;
        this.textMessage = textMessage;
        this.senderNickName = senderNickName;
        this.receiverNickName = receiverNickName;
    }


}