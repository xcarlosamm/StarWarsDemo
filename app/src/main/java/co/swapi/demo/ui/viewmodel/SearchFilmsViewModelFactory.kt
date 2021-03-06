package co.swapi.demo.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import co.swapi.demo.data.FilmsRepository

/**
 * Factory for ViewModels
 */
class SearchFilmsViewModelFactory(private val repository: FilmsRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SearchFilmsViewModel(repository) as T
    }
}