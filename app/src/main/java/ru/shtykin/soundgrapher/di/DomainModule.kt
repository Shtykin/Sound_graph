package ru.shtykin.soundgrapher.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.shtykin.soundgrapher.domain.Repository
import ru.shtykin.soundgrapher.domain.usecase.GetVolumeUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetVolumeUseCase(repository: Repository): GetVolumeUseCase =
        GetVolumeUseCase(repository = repository)
}