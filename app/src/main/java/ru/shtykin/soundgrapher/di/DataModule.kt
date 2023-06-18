package ru.shtykin.soundgrapher.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.shtykin.soundgrapher.data.repository.RepositoryImpl
import ru.shtykin.soundgrapher.domain.Repository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideRepository(@ApplicationContext context: Context): Repository {
        return RepositoryImpl(context = context)
    }

//    @Provides
//    @Singleton
//    fun provideAudioRecorder():


}