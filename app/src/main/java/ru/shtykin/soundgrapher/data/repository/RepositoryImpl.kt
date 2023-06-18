package ru.shtykin.soundgrapher.data.repository

import ru.shtykin.soundgrapher.domain.Repository

class RepositoryImpl(): Repository {

    override suspend fun getVolume(): Int {
        return 2
    }
}