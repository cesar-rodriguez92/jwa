package com.tecsup.javawebavanzado.sesion03.negocio;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import com.tecsup.javawebavanzado.sesion03.exception.DAOExcepcion;
import com.tecsup.javawebavanzado.sesion03.modelo.Producto;

public class GestionProductos {

	static HashMap<Integer, Collection<Producto>> productosXcategorias = new HashMap<Integer, Collection<Producto>>();

	static {
		productosXcategorias.put(new Integer(1), Arrays.asList(new Producto(10, "phone", "phone", "phone", 150),
				new Producto(11, "tablet", "tablet", "tablet", 200)));
		// productosXcategorias.put(new Integer(2),
		// Arrays.asList(new Producto(20, "La Casa Verde", "La Casa Verde", "verde"),
		// new Producto(21, "El Capitan Grant", "El Capitan Grant", "capitan")));
		// productosXcategorias.put(new Integer(3), Arrays.asList(new Producto(30,
		// "Futbol", "Futbol", "futbol"),
		// new Producto(31, "Voley", "Voley", "voley")));

	}

	public Collection<Producto> listarPorCategoria(int idCategoria) throws DAOExcepcion {
		// TODO Auto-generated method stub
		return productosXcategorias.get(idCategoria);
	}

}
