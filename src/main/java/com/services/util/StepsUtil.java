package com.services.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepsUtil {

	public final static int INDEX_CATEGORIAS = 0;
	public final static int INDEX_ACTIVIDADES = 1;
	public final static int INDEX_TAREAS = 2;
	public final static int INDEX_OFERTANTES = 3;
	public final static int INDEX_CONFIRMACION = 4;

	private final static List<String> LIST_STEPS = Arrays.asList("Categorias", "Actividades", "Tareas", "Ofertantes",
			"Confirmacion");

	@SuppressWarnings("null")
	public static List<String> getListStepsByIndex(int index) {
		List<String> lista = new ArrayList<>();

		for (int i = 0; i < LIST_STEPS.size(); i++) {
			lista.add(index == i ? LIST_STEPS.get(i) : "");
		}

		return lista;
	}

}
