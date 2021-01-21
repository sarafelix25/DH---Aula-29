package com.e.listadepokemons

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_pokemon.view.*
import java.util.ArrayList

class PokemonAdapter(private val context: Context, val listPokemons: ArrayList<Pokemon>) :
    PagerAdapter() {

    //pegando quantidade de elementos da lista
    override fun getCount() = listPokemons.size

    //verifica se de fato tem algum objeto sendo passado pra ser construído
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return `object` == view
    }

    //inflando e acessando os componentes do layout
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        //inflando
        var view = LayoutInflater.from(context).inflate(R.layout.card_pokemon, container, false)

        //obtendo o pokemon
        var pokemon = listPokemons[position]
        view.tvNomePokemon.text = pokemon.nome
        view.ivImgpokemon.setImageResource(pokemon.img)

        //evento click
        view.setOnClickListener {
            Toast.makeText(context, pokemon.nome, Toast.LENGTH_SHORT).show()
        }


        //adicionando a view criada ao container
        container.addView(view)

        //retorna a view criada
        return view
    }

    //destroi views que passou somente para desocupar a memoria
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)

    }

}