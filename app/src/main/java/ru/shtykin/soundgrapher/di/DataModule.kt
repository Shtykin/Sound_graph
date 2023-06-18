package ru.shtykin.soundgrapher.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.shtykin.soundgrapher.data.repository.RepositoryImpl
import ru.shtykin.soundgrapher.domain.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideRepository(): Repository {
        return RepositoryImpl()
    }
}