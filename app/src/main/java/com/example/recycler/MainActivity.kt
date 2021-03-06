package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.adapter.NotasAdapter
import com.example.recycler.modelo.Nota

class MainActivity : AppCompatActivity() {
    lateinit var recyclerNotas:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerNotas = findViewById(R.id.listaNotas)

        val notas = ArrayList<Nota>()

        notas.add(Nota(titulo = "Primera nota -1", descripcion = "Una descripcion"))
        notas.add(Nota(titulo = "Primera nota 0", descripcion = "Una descripcion"))
        notas.add(Nota(titulo = "Primera nota 1", descripcion = "Una descripcion"))
        notas.add(Nota(titulo = "Primera nota 2", descripcion = "Una descripcion"))
        notas.add(Nota(titulo  = "Primera nota 3", descripcion = "Una descripcion"))
        notas.add(Nota(titulo =  "Primera nota 4", descripcion = "Una descripcion"))
        notas.add(Nota(titulo = "Primera nota 5", descripcion = "Una descripcion"))

        recyclerNotas.layoutManager = GridLayoutManager(this, 1 )
        recyclerNotas.setHasFixedSize(true)
        recyclerNotas.adapter = NotasAdapter(notas, this )

    }
}