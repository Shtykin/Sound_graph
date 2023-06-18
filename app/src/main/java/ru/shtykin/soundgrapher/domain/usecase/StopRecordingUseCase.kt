package ru.shtykin.soundgrapher.domain.usecase

import ru.shtykin.soundgrapher.domain.Repository

class StopRecordingUseCase(private val repository: Repository) {

    suspend fun execute() = repository.stopRecording()
}