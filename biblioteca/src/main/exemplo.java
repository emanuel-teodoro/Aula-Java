package main;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class exemplo {
	public static void main(String[] args) {
		
		Random gerador = new Random();		
		int numero = gerador.nextInt(100);//gera valores aleatorios entre 0 - 99
		System.out.println(numero);
		System.out.println("======");
		
		LocalDate hoje = LocalDate.now();
		LocalTime agora = LocalTime.now();
		LocalDateTime momento = LocalDateTime.now();
		
		System.out.println(hoje);
		System.out.println("============");
		System.out.println(agora);
		System.out.println("============");
		System.out.println(momento);
		
		//usando biblioteca de formatação
		System.out.println("======FORMATACAO======");
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		System.out.println(momento.format(formatado));
		System.out.println("============");
		
		DateTimeFormatter agoraFormatado = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(agora.format(agoraFormatado));
		System.out.println("============");
		
		DateTimeFormatter hojeFormatado = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(hojeFormatado.format(hoje));

	}

}