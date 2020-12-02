package com.protsenko.tossup.states

public class TossupStates : States {
    override fun states(): List<State> {
        return listOf(
            State("Wisconsin", 10),
            State("Michigan", 16),
            State("Minnesota", 10),
            State("Iowa", 6),
            State("North Carolina", 15),
            State("Arizona", 11),
            State("Florida", 29),
            State("Nevada", 6),
            State("Georgia", 16),
            State("Texas", 38),
            State("Pennsylvania", 20),
            State("Maine CD2", 1),
            State("Ohio", 18),
            State("Nebraska CD2", 1),
        )
    }

}
