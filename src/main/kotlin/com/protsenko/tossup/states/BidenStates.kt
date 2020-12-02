package com.protsenko.tossup.states

class BidenStates : States {
    override fun states(): List<State> {
        return listOf(
            State("Connecticut", 7),
            State("New Jersey", 14),
            State("Illinois", 20),
            State("Maine CD1", 1),
            State("Rhode Island", 4),
            State("Washington", 12),
            State("Maine", 2),
            State("New Hampshire", 4),
            State("Colorado", 9),
            State("New Mexico", 5),
            State("Virginia", 13),
            State("Oregon", 7)
        )
    }

}