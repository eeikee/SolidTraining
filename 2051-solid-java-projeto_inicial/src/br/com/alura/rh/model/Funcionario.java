package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

	private DadosPessoais pData;
	private LocalDate dataUltimoReajuste;

	public Funcionario(DadosPessoais pData) {
		this.pData = pData;
	}

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	private void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}

	public void atualizarSalario(BigDecimal salarioReajustado) {
		this.pData.setSalario(salarioReajustado);
		setDataUltimoReajuste(LocalDate.now());
	}

	public void promover(Cargo novoCargo) {
		getpData().setCargo(novoCargo);
	}

	public DadosPessoais getpData() {
		return pData;
	}

	public void setpData(DadosPessoais pData) {
		this.pData = pData;
	}
}
