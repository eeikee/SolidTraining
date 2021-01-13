package br.com.alura.rh.model;

public class Tercerizado{

	private String empresa;
	private DadosPessoais pData;
	
	public Tercerizado(String empresa, DadosPessoais pData) {
		this.empresa = empresa;
		this.pData = pData;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	public DadosPessoais getpData() {
		return pData;
	}

	public void setpData(DadosPessoais pData) {
		this.pData = pData;
	}
}
