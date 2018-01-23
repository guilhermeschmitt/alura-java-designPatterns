package DesignPatterns2.bridgesAndAdapters;

public class GoogleMaps implements Mapa{

	@Override
	public String devolveMapa(String rua) {

		// codigo aqui que consome o google
		return "mapa";
		
	}

}
