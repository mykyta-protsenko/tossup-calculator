package com.protsenko.tossup.calculator

import com.protsenko.tossup.states.State

class SingleOutcomeCalculator {
    fun bidenWins(bidenStates: List<State>, trumpStates: List<State>): Boolean {
        val bidenVotes = bidenStates.fold(0, {acc, s -> acc + s.votes})
        val trumpVotes = trumpStates.fold(0, {acc, s -> acc + s.votes})
        return bidenVotes > trumpVotes
    }
}