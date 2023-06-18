package ru.shtykin.soundgrapher.domain.usecase

import ru.shtykin.soundgrapher.domain.Repository

class StartRecordingUseCase(private val repository: Repository) {

    suspend fun execute() = repository.startRecording()
}