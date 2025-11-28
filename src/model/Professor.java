package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Professor {
	//atributos da tabela
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	private String naturalidade;
	private String endereco;
	
	public Professor() {}
	
	public Professor(String nome, String email, String cpf, String data, String natu, String end) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = data;
		this.naturalidade = natu;
		this.endereco = end;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
