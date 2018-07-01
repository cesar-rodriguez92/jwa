package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.ArrayList;
import java.util.Collection;

import com.tecsup.javawebavanzado.sesion03.exception.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Categoria;

public class GestionCategorias {

	static Collection<Categoria> categorias = new ArrayList<Categoria>();

	static {
		categorias.add(new Categoria(1, "Electrónica", null));
		categorias.add(new Categoria(2, "Libros", null));
		categorias.add(new Categoria(3, "Deportes", null));
	}

	public Collection<Categoria> listar() throws DAOExcepcion {
		// TODO Auto-generated method stub
		return categorias;
	}

}
