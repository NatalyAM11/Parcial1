package model;

import java.util.Comparator;

public class TipoNetflix implements Comparator <Netflix>{

	public int compare (Netflix o1, Netflix o2) {
		return o1.getTipo().compareTo(o2.getTipo());
	}

	}