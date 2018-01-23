package DesignPatterns2.flyweight;

import java.util.HashMap;
import java.util.Map;

import DesignPatterns2.flyweight.Notas.Do;
import DesignPatterns2.flyweight.Notas.Fa;
import DesignPatterns2.flyweight.Notas.La;
import DesignPatterns2.flyweight.Notas.Mi;
import DesignPatterns2.flyweight.Notas.Re;
import DesignPatterns2.flyweight.Notas.Si;
import DesignPatterns2.flyweight.Notas.Sol;

public class NotasMusicais {

	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	
	static {

        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());

    }
    public Nota pega(String nome) {
        return notas.get(nome);
    }
	
}
