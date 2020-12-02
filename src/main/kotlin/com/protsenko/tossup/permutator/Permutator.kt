package com.protsenko.tossup.permutator

import com.protsenko.tossup.states.State
import com.protsenko.tossup.states.TossupStates

class Permutator {
    fun permutations(): List<StatesPermutation> {
        return doPermutation(TossupStates().states(), StatesPermutation(emptyList(), emptyList()))
    }

    fun doPermutation(availableTossupStates: List<State>, currentPermutation: StatesPermutation): List<StatesPermutation> {
        if (availableTossupStates.isEmpty()) {
            return listOf(currentPermutation)
        }
        val currentState = availableTossupStates.first()
        val remainingStates = availableTossupStates.drop(1)
        val bidenPermutation = StatesPermutation(currentPermutation.bidenStates + currentState, currentPermutation.trumpStates)
        val trumpPermutation = StatesPermutation(currentPermutation.bidenStates, currentPermutation.trumpStates  + currentState)
        return doPermutation(remainingStates, bidenPermutation) + doPermutation(remainingStates, trumpPermutation)
    }
}