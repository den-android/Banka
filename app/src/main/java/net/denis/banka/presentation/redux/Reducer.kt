package net.denis.banka.presentation.redux

interface Reducer<S : State, A : Action> {
    fun reduce(currentState: S, action: A): S
}