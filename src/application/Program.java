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
		
		
		for(String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		// ZoneId.getAvailableZoneIds(); 
		
		
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		
		
		
		
		
		sc.close();
	}

}
