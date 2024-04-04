package gerar;

import model.Pessoa;
import java.util.ArrayList;
import java.util.List; 
import java.io.FileWriter;
import java.io.IOException;



class GeradorArquivo {
	
	//método que recebe uma lista de objeto "Pessoa" como parâmetro. Sua função
	//é gerar um arquivo TXT e esecrever nele as informações que estão na lista.

	//estrutura try-catch usada para operações de entrada e saída. 
	
	public static void main(List<Pessoa> pessoas) {
		
		String caminho = "C:\\Users\\maria";
		
		try(FileWriter gerador = new FileWriter("pessoas_maiores_de_18_anos.txt")){
			gerador.write("Existem" + pessoas.size() + "pessoas maiores de 18 anos");
			for (Pessoa pessoa : pessoas) {
				gerador.write(pessoa.getNome() + "tem mais" + pessoa.getIdade() + "anos");
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//Pessoas maiores de 18 anos
		List<Pessoa> maiores18 = new ArrayList<>();
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getIdade() > 18) {
				maiores18.add(pessoa);
			}
		}

	}
	
	

}
