package ru.otus.otuskotlin.m2l1

import java.time.LocalDateTime

data class User(
    val id: String,

    val firstName: String,
    val secondName: String,
    val lastName: String,

    val phone: String,
    val email: String,

    val actions: Set<Action>,

    val available: List<LocalDateTime>,
)