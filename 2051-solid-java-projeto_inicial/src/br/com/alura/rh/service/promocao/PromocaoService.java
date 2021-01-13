package br.com.alura.rh.service.promocao;

import br.com.alura.rh.exceptions.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getpData().getCargo();
		if(cargoAtual.equals(Cargo.GERENTE)) {
			throw new ValidacaoException("Gerentes não podem ser promovidos.");
		}
		if (metaBatida) {
			funcionario.promover(cargoAtual.getProximoCargo());
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta.");
		}
	}
}
//