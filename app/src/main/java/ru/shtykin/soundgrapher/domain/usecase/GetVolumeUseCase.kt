package ru.shtykin.soundgrapher.domain.usecase

import ru.shtykin.soundgrapher.domain.Repository

class GetVolumeUseCase(private val repository: Repository) {

    suspend fun execute() = repository.getVolume()
}