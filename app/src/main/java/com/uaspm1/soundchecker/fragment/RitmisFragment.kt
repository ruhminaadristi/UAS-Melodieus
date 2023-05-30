package com.uaspm1.soundchecker.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.databinding.FragmentRitmisBinding

class RitmisFragment : Fragment() {
    private var _binding: FragmentRitmisBinding? = null
    private val binding get() = _binding!!

    private var soundMusic: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRitmisBinding.inflate(inflater, container, false)

        binding.imgGendang.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.gendang)
            soundMusic?.start()
        }

        binding.imgDrum.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.drum)
            soundMusic?.start()
        }

        binding.imgTifa.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.tifa)
            soundMusic?.start()
        }

        binding.imgGong.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.gong)
            soundMusic?.start()
        }

        binding.btnGendang.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisgendang)
            soundMusic?.start()
        }

        binding.btnDrum.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisdrum)
            soundMusic?.start()
        }

        binding.btnTifa.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thistifa)
            soundMusic?.start()
        }

        binding.btnGong.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.thisgong)
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