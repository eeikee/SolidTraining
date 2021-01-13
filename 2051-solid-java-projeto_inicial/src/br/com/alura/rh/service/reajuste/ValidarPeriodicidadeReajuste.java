package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.exceptions.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidarPeriodicidadeReajuste implements ValidacaoReajuste{
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste(); 
		long mesesDeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, LocalDate.now());
		if (mesesDeUltimoReajuste < 6) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}
}
