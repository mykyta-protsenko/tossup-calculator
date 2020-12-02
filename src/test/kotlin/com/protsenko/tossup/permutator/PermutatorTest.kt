package com.protsenko.tossup.permutator

import com.protsenko.tossup.states.TossupStates
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.groups.Tuple.tuple
import org.junit.jupiter.api.Test
import java.util.function.Function
import kotlin.math.pow

internal class PermutatorTest {
    @Test
    fun numberOfPermutations() {
        // given
        val tossupStatesSize: Int = TossupStates().states().size
        val two: Double = 2.0

        // when
        val permutations = Permutator().permutations()
        val totalPermutationsNumber : Double = permutations.size.toDouble()

        // then
        assertThat(totalPermutationsNumber).isEqualTo(two.pow(tossupStatesSize))
        assertThat(permutations)
            .extracting(Function { p -> p.bidenStates.size + p.trumpStates.size })
            .containsOnly(tuple(tossupStatesSize))
    }
}