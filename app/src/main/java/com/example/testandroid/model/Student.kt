package com.example.testandroid.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    val name : String,
    val lastName: String,
): Parcelable
