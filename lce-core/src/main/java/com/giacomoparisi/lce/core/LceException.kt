package com.giacomoparisi.lce.core

open class LceException : Throwable {

    constructor() : super()
    constructor(message: String?) : super(message)
    constructor(message: String?, cause: Throwable?) : super(message, cause)
    constructor(cause: Throwable?) : super(cause)
    constructor(message: String?, cause: Throwable?, enableSuppression: Boolean, writableStackTrace: Boolean) : super(message, cause, enableSuppression, writableStackTrace)
}

fun isInWitheList(throwable: Throwable, whiteList: List<String>) =
        whiteList.fold(false) { acc, clazz -> acc.or(throwable.javaClass.name == clazz) }
