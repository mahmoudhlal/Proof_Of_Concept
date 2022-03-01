package com.example.data.file

import android.content.Context
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.reflect.Type

class FileReader (private val context: Context) {


    fun <T> getAs(filename: String, type: Type): T {
        val fileString = get(filename)
        val gson = Gson()

        return gson.fromJson(fileString, type)
    }


    fun get(filename: String): String {
        val buf = StringBuilder()
        val json = context.assets.open(filename)
        val inputStream = BufferedReader(InputStreamReader(json, "UTF-8"))

        inputStream.forEachLine {
            buf.append(it)
        }

        inputStream.close()

        return buf.toString()
    }

}