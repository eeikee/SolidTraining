package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}

	public void reajustarSalarioFuncionario(Funcionario funcionario,BigDecimal aumento) {
		this.validacoes.forEach(validacoes -> validacoes.validar(funcionario, aumento));
		BigDecimal salarioReajustado = funcionario.getpData().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
