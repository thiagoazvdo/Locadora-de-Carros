package com.locacoesveiculares.exemplo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import com.locacoesveiculares.model.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("joão silva", LocalDate.of(2005, Month.OCTOBER, 23));

		int idade = Period.between(cliente.getDataNascimento(), LocalDate.now()).getYears();

		if (idade >= 18) {
			System.out.println("ok, pode ser cadastrado.");
		} else {
			System.out.printf("sua idade é : %d. então não pode ter carteira.", idade);
		}

	}

}
