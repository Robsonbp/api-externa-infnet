package br.edu.infnet.robsoncnpjapi.model.domain;

public class CnpjOutput {
	private String uf;
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String descricaoSituacaoCadastral;
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getDescricaoSituacaoCadastral() {
		return descricaoSituacaoCadastral;
	}
	public void setDescricaoSituacaoCadastral(String descricaoSituacaoCadastral) {
		this.descricaoSituacaoCadastral = descricaoSituacaoCadastral;
	}
}
