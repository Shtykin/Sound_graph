package ru.shtykin.soundgrapher.data.repository

import android.content.Context
import android.media.MediaRecorder
import android.util.Log
import ru.shtykin.soundgrapher.domain.Repository
import java.io.File
import java.io.IOException
import kotlin.coroutines.coroutineContext

class RepositoryImpl(
    private val context: Context
): Repository {

    private var recorder: MediaRecorder? = null

    override suspend fun getVolume(): Int {
        return 2
    }

    override fun startRecording() {
        recorder = MediaRecorder().apply {
            setAudioSource(MediaRecorder.AudioSource.MIC)
            setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP)
            setOutputFile("${context.cacheDir.absolutePath}${File.pathSeparator}${System.currentTimeMillis()}.wav")
            setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB)
            try {
                prepare()
            } catch (e: IOException) {
                Log.e("DEBUG", "Start recording exception -> ${e.message}")
            }
            start()
        }
    }

    override fun stopRecording() {
        recorder?.apply {
            stop()
            release()
        }
        recorder = null
    }


}