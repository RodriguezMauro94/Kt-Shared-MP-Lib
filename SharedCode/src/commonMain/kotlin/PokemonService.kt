package com.jetbrains.handson.mpp.mobile

class PokemonService {
    private val repository: PokemonRepository = PokemonRepository()

    fun obtainPokemons(): List<PokemonDto> {
        return repository.getPokemons().sortedBy { it.name }
    }
}
