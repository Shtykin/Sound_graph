package ru.shtykin.soundgrapher.domain

interface Repository {
    suspend fun getVolume(): Int
}