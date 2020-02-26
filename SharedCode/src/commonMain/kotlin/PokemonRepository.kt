package com.jetbrains.handson.mpp.mobile

class PokemonRepository{
    fun getPokemons(): List<PokemonDto> {
        return listOf(
            PokemonDto("Pikachu", 8, 4, "https://i.pinimg.com/originals/2f/a6/fa/2fa6fa2b399f3d85d8f403d4ac5ec666.png"),
            PokemonDto("Bulbasaur", 6, 3, "https://vignette.wikia.nocookie.net/videojuego/images/4/43/Bulbasaur.png/revision/latest?cb=20110113231911"),
            PokemonDto("Charmander", 10, 6, "https://imagenesdepokemon.info/wp-content/uploads/2018/05/charmander-3-700x700.jpg")
        )
    }
}
