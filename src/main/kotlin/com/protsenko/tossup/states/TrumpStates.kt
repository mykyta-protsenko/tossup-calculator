package com.protsenko.tossup.states

class TrumpStates: States {
    override fun states(): List<State> {
        return listOf(
            State("Missouri", 10),
            State("Indiana", 11),
            State("Montana", 3),
            State("South Carolina", 9),
            State("Alaska", 3),
            State("Kansas", 6),
            State("Louisiana", 8),
            State("Mississippi", 6),
            State("Utah", 6),
            State("Arkansas", 6),
        )
    }

}
