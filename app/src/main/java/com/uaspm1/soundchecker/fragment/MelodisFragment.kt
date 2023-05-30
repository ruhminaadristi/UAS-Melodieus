package com.uaspm1.soundchecker.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.databinding.FragmentMelodisBinding

class MelodisFragment : Fragment() {
    private var _binding: FragmentMelodisBinding? = null
    private val binding get() = _binding!!

    private var soundMusic: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMelodisBinding.inflate(inflater, container, false)

        binding.imgFlute.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.seruling)
            soundMusic?.start()
        }

        binding.imgTrumpet.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.terompet)
            soundMusic?.start()
        }

        binding.imgHarmonica.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.harmonika)
            soundMusic?.start()
        }

        binding.imgSasando.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.sasando)
            soundMusic?.start()
        }

        binding.btnFlute.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisflute)
            soundMusic?.start()
        }

        binding.btnTrumpet.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thistrumpet)
            soundMusic?.start()
        }

        binding.btnHarmonica.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisharmonica)
            soundMusic?.start()
        }

        binding.btnSasando.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thissasando)
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