package ConversorTemp;

public class convertertemp {
	private double celsius;
	private double kelvin;
	private double fahrenheit;
	
	//METODO CONSTRUTOR
	public convertertemp(double temperatura) {
		this.celsius = KelvinCelsius(temperatura);
	    this.kelvin = celsiusKelvin(temperatura);
	    this.fahrenheit = celsiusfahrenheit(temperatura);
	}
	//EXIBIR SAIDA
	public void exibir() {
		System.out.println("A temperatura em celsius " + celsius);
		System.out.println("A temperatura em kelvin " + kelvin);
		System.out.println("A temperatura em fahrenheit " + fahrenheit);
	}
	//CALCULAR CONVERSAO DE TEMPERATURA
	//celsius -> kelvin
	public static double celsiusKelvin(double temperatura){
		return (temperatura + 273.15);
	}
	//celsius -> fahrenheit
	public static double celsiusfahrenheit(double temperatura) {
		return ((temperatura * 9/ 5) + 32);
	}
	//fahrenheit -> kelvin
	public static double fahrenheitKelvin(double temperatura) {
		return (((temperatura - 32) * 5 / 9) + 273.15);
	}
	//fahrenheit -> celsius 
	public static double fahrenheitCelsius(double temperatura) {
		return ((temperatura - 32) * 5 / 9);
	}
	
	//kelvin -> fahrenheit
	public static double kelvinFahrenheit(double temperatura) {
		return (((temperatura - 273.15) * 9 / 5) + 32);
	}
	//kelvin -> celsius
	public static double KelvinCelsius(double temperatura) {
		return (temperatura - 273.15);
	}
}