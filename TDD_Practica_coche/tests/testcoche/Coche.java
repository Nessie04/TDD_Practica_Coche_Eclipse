package testcoche;

public class Coche {

	public int velocidad;

	public void acelerar_ines_llopis(int aceleracion) {
		velocidad += aceleracion;
	}

	public void decelerar_ines_llopis(int deceleracion) {
		velocidad -= deceleracion;
		if (velocidad <0) velocidad=0;
		
	}

}
