package model;
import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate dataNascimento;
	
	 public Pessoa(String nome, LocalDate dataNascimento) {
	        this.nome = nome;
	        this.dataNascimento = dataNascimento;
	    }
	
	
	
	public String getNome() {
		return nome;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public int getIdade() {
		LocalDate atual = LocalDate.now();
		int idade = atual.getYear() - dataNascimento.getYear();
		return idade;
	}
	
	
	

}

