package com.protsenko.tossup.calculator

import com.protsenko.tossup.states.State
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SingleOutcomeCalculatorTest {
    @Test
    fun bidenWins() {
        // given
        val bidenStates = listOf(State("foo", 3))
        val trumpStates = listOf(State("bar", 2))

        // when
        val bidenWins = SingleOutcomeCalculator().bidenWins(bidenStates, trumpStates)

        // then
        assertThat(bidenWins).isTrue
    }

    @Test
    fun bidenLoses() {
        // given
        val bidenStates = listOf(State("foo", 3))
        val trumpStates = listOf(State("bar", 5))

        // when
        val bidenWins = SingleOutcomeCalculator().bidenWins(bidenStates, trumpStates)

        // then
        assertThat(bidenWins).isFalse
    }

}