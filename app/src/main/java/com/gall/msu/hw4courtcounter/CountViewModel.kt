package com.gall.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"
const val CURRENT_SCORE_A = "CURRENT_SCORE_A"
const val CURRENT_SCORE_B = "CURRENT_SCORE_B"

class CountViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {
    var scoreTeamA: Int
        get() = savedStateHandle.get(CURRENT_SCORE_A) ?: 0
        set(value) = savedStateHandle.set(CURRENT_SCORE_A, value)
    var scoreTeamB: Int
        get() = savedStateHandle.get(CURRENT_SCORE_B) ?: 0
        set(value) = savedStateHandle.set(CURRENT_SCORE_B, value)
}