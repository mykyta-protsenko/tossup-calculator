package com.protsenko.tossup.states

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.groups.Tuple.tuple
import org.junit.jupiter.api.Test
import java.util.function.Function

internal class TrumpStatesTest {
    @Test
    fun testStates(){
        assertThat(TrumpStates().states())
            .extracting(Function { s -> s.name})
            .contains(tuple("Utah"))
    }
}