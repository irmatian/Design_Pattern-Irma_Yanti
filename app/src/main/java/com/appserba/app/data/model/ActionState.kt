package com.appserba.app.data.model

data class ActionState<T>(
    val data: T? = null,
    val message: String? = null,
    val isSeccess: Boolean = true,
    var isConsumed: Boolean = false,
    val isSuccess: Boolean
)
