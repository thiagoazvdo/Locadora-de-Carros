package com.locacoesveiculares.exemplo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

import com.locacoesveiculares.model.Aluguel;
import com.locacoesveiculares.model.Carro;
import com.locacoesveiculares.model.Cliente;

public class DevolucaoCarro {

	public static void main(String[] args) {
		
		Aluguel aluguel = recuperarAluguel();
		
		//para cada hora de atraso o cliente paga 10% do valor do carro de multa
		
		LocalDateTime dataEHoraDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
		aluguel.setDataEHoraRealDaDevolucao(dataEHoraDevolucao);
		aluguel.imprimeFature();
		
	}

	private static Aluguel recuperarAluguel() {
		Cliente cliente = new Cliente("joão silva", LocalDate.of(1985, Month.FEBRUARY, 8));
		Carro carro = new Carro("Gol", 90.0, Year.of(2012));
		
		LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(LocalDate.now(),LocalTime.now().of(LocalTime.now().getHour(), 0));
		
		LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);
		Aluguel aluguel = new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
		
		return aluguel;
	}

	
}
