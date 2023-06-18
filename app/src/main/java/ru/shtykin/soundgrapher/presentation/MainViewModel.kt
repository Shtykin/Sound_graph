package ru.shtykin.soundgrapher.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.shtykin.soundgrapher.domain.usecase.GetVolumeUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getVolumeUseCase: GetVolumeUseCase
): ViewModel() {
}