package com.locacoesveiculares.exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;

import com.locacoesveiculares.model.Aluguel;
import com.locacoesveiculares.model.Carro;
import com.locacoesveiculares.model.Cliente;

public class NovoAluguel {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente("joão silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),LocalTime.now().of(LocalTime.now().getHour(), 0));
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		imprimirRecibo(aluguel);

		
	}

	private static void imprimirRecibo(Aluguel aluguel) {
		System.out.println(">>>>>>>>>> RECIBO <<<<<<<<<<<<<");
		System.out.println("Carro: " + aluguel.getCarro().getModelo());
		System.out.println("Cliente: " + aluguel.getCliente().getNome());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		System.out.println("Data e hora da retirada: " + aluguel.getDataEHoraDaRetirada().format(formatter));
		System.out.println("Data e hora prevista para devolução: " + aluguel.getDataEHoraPrevistaParaDevolucao().format(formatter));
	}

}
