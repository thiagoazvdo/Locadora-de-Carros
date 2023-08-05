package com.locacoesveiculares.exemplo;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import com.locacoesveiculares.model.Carro;

public class CadastroCarro {

	public static void main(String[] args) {
		
		Carro gol = new Carro("gol", 90.0, Year.of(2020));
		Carro cruze = new Carro("cruze", 200.0, Year.parse("2022"));
		Carro celta = new Carro("celta", 80.0, Year.of(2019));

		List<Carro> carros = new ArrayList<>();
		carros.stream().filter(c -> c.getAnoFabricacao().getValue() > 2012)
		.forEach(c -> System.out.println(c.getModelo()));
	}
}
