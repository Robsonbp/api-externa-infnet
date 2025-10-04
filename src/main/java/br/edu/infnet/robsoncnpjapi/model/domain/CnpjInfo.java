package br.edu.infnet.robsoncnpjapi.model.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CnpjInfo {

	private String uf;
	private String cep;
	private String cnpj;
	private String municipio;
	private String bairro;
	private String logradouro;
	private String numero;
	
	@JsonProperty("razao_social")
	private String razaoSocial;
	
	@JsonProperty("nome_fantasia")
	private String nomeFantasia;
	
	@JsonProperty("ddd_telefone_1")
	private String telefone1;
	
	@JsonProperty("situacao_cadastral")
	private String situacaoCadastral;
	
	@JsonProperty("descricao_situacao_cadastral")
	private String descricaoSituacaoCadastral;
	
	
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getSituacaoCadastral() {
		return situacaoCadastral;
	}
	public void setSituacaoCadastral(String situacaoCadastral) {
		this.situacaoCadastral = situacaoCadastral;
	}
	public String getDescricaoSituacaoCadastral() {
		return descricaoSituacaoCadastral;
	}
	public void setDescricaoSituacaoCadastral(String descricaoSituacaoCadastral) {
		this.descricaoSituacaoCadastral = descricaoSituacaoCadastral;
	}
	
	
	
}
