package net.denis.banka.presentation.screen.main_screen

import net.denis.banka.presentation.redux.Action
import net.denis.banka.presentation.redux.Effect
import net.denis.banka.presentation.redux.State
import net.denis.banka.presentation.screen.main_screen.state.OilState
import net.denis.banka.presentation.screen.main_screen.state.ScrapState

class MainContract {

    sealed class MainAction : Action {
        //object find : MainEvent()
        data class findScrap(val duration: Long): MainAction()
        object findOil : MainAction()
    }

    data class MainState(
        val scrapState: ScrapState,
        val oilState: OilState,
    ) : State

//    sealed class MainState : ViewState {
//        data class ScrapState(val duration: Long, val count: Int) : MainState()
//        data class OilState(val duration: Long, val count: Int) : MainState()
//    }

    sealed class MainEffect : Effect {
        data class ShowError(val message: String?) : MainEffect()
    }

}