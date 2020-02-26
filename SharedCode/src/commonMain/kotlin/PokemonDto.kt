package com.jetbrains.handson.mpp.mobile

data class PokemonDto(val name: String, val strength: Int, val defense: Int, val image: String) {
    override fun toString(): String {
        return name
    }
}
