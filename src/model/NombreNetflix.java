package model;

import java.util.Comparator;

public class NombreNetflix implements Comparator <Netflix>{

	public int compare (Netflix o1, Netflix o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

	}