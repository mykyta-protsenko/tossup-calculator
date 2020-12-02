package com.protsenko.tossup.calculator

import com.protsenko.tossup.permutator.Permutator
import com.protsenko.tossup.states.BidenStates
import com.protsenko.tossup.states.TrumpStates

class OutcomeCalculator {
    fun chanceOfBidenVictory(): Double {
        val singleOutcomeCalculator = SingleOutcomeCalculator()
        val permutations = Permutator().permutations()
        val bidenStates = BidenStates().states()
        val trumpStates = TrumpStates().states()

        val totalBidenWins = permutations.fold(
            0,
            { acc, p ->
                acc + if (singleOutcomeCalculator.bidenWins(
                        bidenStates + p.bidenStates,
                        trumpStates + p.trumpStates
                    )
                ) 1 else 0
            })

        return totalBidenWins.toDouble() / permutations.size.toDouble()
    }
}