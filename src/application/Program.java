package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Operações importantes com data-hora
		// Converter data-hora global, timezone(sistema local) -> data-hora local
		// Obter dados de uma data-hora local -> data hora local -> dia, mes, ano, horario
		// Cálculos com data-hora -> data-hora +/- tempo -> data-hora, data hora 1, data hora 2 -> duração
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // LocalDateTime do Brasil

		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // LocalDateTime de portugal
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		

		
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);		
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);		
		
		
		System.out.println("d04 dia = " +d04.getDayOfMonth());
		System.out.println("d04 mês = " +d04.getMonthValue());
		System.out.println("d04 ano = " +d04.getYear());
		
		System.out.println("d05 hora = " +d05.getHour());
		System.out.println("d05 minutos = " +d05.getMinute());
						
		sc.close();
		
		/*
		 		
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		// ZoneId.getAvailableZoneIds();  
		 */
	}

}
