package com.jetbrains.handson.mpp.mobile

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val pokemonService by lazy {
        PokemonService()
    }

    private lateinit var pokemons: List<PokemonDto>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.pokemons = pokemonService.obtainPokemons()

        pokemons_spinner.adapter = ArrayAdapter<PokemonDto>(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            pokemons
        )

        pokemons_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?){}

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Picasso.with(this@MainActivity)
                    .load(pokemons[position].image).into(pokemon_image)
            }
        }
    }
}
