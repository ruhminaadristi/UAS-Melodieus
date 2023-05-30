package com.uaspm1.soundchecker.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.databinding.FragmentHarmonisBinding

class HarmonisFragment : Fragment() {
    private var _binding: FragmentHarmonisBinding? = null
    private val binding get() = _binding!!

    private var soundMusic: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHarmonisBinding.inflate(inflater, container, false)

        binding.imgGitar.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.guitar_sfx)
            soundMusic?.start()
        }

        binding.imgAngklung.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.angklung_sfx)
            soundMusic?.start()
        }

        binding.imgHarpa.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.harp_sfx)
            soundMusic?.start()
        }

        binding.imgPiano.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.piano_sfx)
            soundMusic?.start()
        }

        binding.btnGitar.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisguitar)
            soundMusic?.start()
        }

        binding.btnAngklung.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisangklung)
            soundMusic?.start()
        }

        binding.btnHarpa.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisharp)
            soundMusic?.start()
        }

        binding.btnPiano.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thispiano)
            soundMusic?.start()
        }

        return binding.root
    }

    private fun resetSound(mp: MediaPlayer?) {
        if (mp?.isPlaying == true) {
            mp.stop()
            mp.reset()
        }
    }

}