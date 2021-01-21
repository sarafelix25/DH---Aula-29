package com.e.listadepokemons

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var listPokemons: ArrayList<Pokemon>
    lateinit var adapter: PokemonAdapter

    //referencia da actionBar
    lateinit var actionBar: ActionBar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        actionBar = this.supportActionBar!!


        //pegando a lista
        listPokemons = getLisPokemons()

        //inicializando adapter
        adapter = PokemonAdapter(this, listPokemons)

        //passando o adapter e a lista para o viewPager
        vpPokemon.adapter = adapter
        vpPokemon.setPadding(100, 0, 100, 0)

        //listener para poder mudar o titulo da appbar conforme vai mudando o cardview
        vpPokemon.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            //só vamos usar esse metodo
            @SuppressLint
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                val titulo = listPokemons.get(position).nome
                actionBar.title = titulo
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })


    }


    //retorna lista de pokemons
    fun getLisPokemons(): ArrayList<Pokemon> {
        return arrayListOf(
            Pokemon(
                1,
                "Charmander",
                R.drawable.charmander,
                R.color.fogo,
                arrayListOf("Fogo"),
                arrayListOf("Agua", "Terra", "Rocha")
            ),
            Pokemon(
                1,
                "Charmander22",
                R.drawable.charmander,
                R.color.fogo,
                arrayListOf("Fogo"),
                arrayListOf("Agua", "Terra", "Rocha")
            ),
            Pokemon(
                1,
                "Charmander33",
                R.drawable.charmander,
                R.color.fogo,
                arrayListOf("Fogo"),
                arrayListOf("Agua", "Terra", "Rocha")
            ),
            Pokemon(
                1,
                "Charmander44",
                R.drawable.charmander,
                R.color.fogo,
                arrayListOf("Fogo"),
                arrayListOf("Agua", "Terra", "Rocha")
            ),
            Pokemon(
                1,
                "Charmander55",
                R.drawable.charmander,
                R.color.fogo,
                arrayListOf("Fogo"),
                arrayListOf("Agua", "Terra", "Rocha")
            ),
            Pokemon(
                1,
                "Charmander66",
                R.drawable.charmander,
                R.color.fogo,
                arrayListOf("Fogo"),
                arrayListOf("Agua", "Terra", "Rocha")
            )


        )

    }


}