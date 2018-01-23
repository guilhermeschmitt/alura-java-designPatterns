package DesignPatterns2.flyweight;

import java.util.List;

import org.jfugue.player.Player;

public class Piano {

	public void toca(List<Nota> notas) {
		Player player = new Player();

        StringBuilder musicaEmNotas = new StringBuilder();
        for(Nota nota : notas) {
            musicaEmNotas.append(nota.simbolo() + " ");
        }

        player.play(musicaEmNotas.toString());
	}
	
}
