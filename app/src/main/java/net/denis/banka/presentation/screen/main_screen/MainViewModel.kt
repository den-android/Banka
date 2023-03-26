package net.denis.banka.presentation.screen.main_screen

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import net.denis.banka.data.interfaces.IResourceRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: IResourceRepository,
) : ViewModel() {


    init {

    }

    private fun

//    private fun onFindScrap() {
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.findScrap()
//                .collect() { result ->
//                    setState {
//                        copy(
//                            oilState = oilState.copy(count = oilState.count - 50),
//                            scrapState = scrapState.copy(count = scrapState.count + result)
//                        )
//                    }
//                }
//        }
//    }
//
//    private fun onFindOil() {
//        viewModelScope.launch(Dispatchers.IO) {
//            repository.findOil()
//                .collect() { result ->
//                    setState {
//                        copy(
//                            oilState = oilState.copy(count = oilState.count + result)
//                        )
//                    }
//                }
//        }
//    }
}