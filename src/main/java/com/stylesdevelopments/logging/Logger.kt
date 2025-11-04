/*
 *
 *  * Copyright (c) 2025 StylesDevelopments. Utils - Logger.
 *  *
 *  * Created by Taylor Styles on 04/11/2025, 17:52.
 *
 */

package com.stylesdevelopments.logging

import android.util.Log

object Logger {

    private const val MAX_TAG_LENGTH = 23
    private const val FALLBACK_TAG = "Logger"
    private const val STACK_TRACE_OFFSET = 4

    private fun getTag(): String {
        val stackTrace = Thread.currentThread().stackTrace

        for (i in STACK_TRACE_OFFSET until stackTrace.size) {
            val element = stackTrace[i]
            val className = element.className

            if (!className.startsWith(Logger::class.java.name)) {
                val simpleClassName = className.substringAfterLast('.')
                return simpleClassName.take(MAX_TAG_LENGTH)
            }
        }

        return FALLBACK_TAG
    }

    @JvmStatic
    fun d(message: String) {
        Log.d(getTag(), message)
    }

    @JvmStatic
    fun d(message: String, throwable: Throwable?) {
        Log.d(getTag(), message, throwable)
    }

    @JvmStatic
    fun w(message: String) {
        Log.w(getTag(), message)
    }

    @JvmStatic
    fun w(message: String, throwable: Throwable?) {
        Log.w(getTag(), message, throwable)
    }

    @JvmStatic
    fun e(message: String) {
        Log.e(getTag(), message)
    }

    @JvmStatic
    fun e(message: String, throwable: Throwable?) {
        Log.e(getTag(), message, throwable)
    }
}