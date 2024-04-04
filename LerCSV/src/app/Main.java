package app;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import model.Pessoa;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;



public class Main {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<>();
		String CSV = "C:\\Users\\maria";
		
		try(BufferedReader leitor = new BufferedReader(new FileReader(CSV))){
			
			String linha;
			
			while((linha = leitor.readLine()) != null) {
				
				String[] conteudo = linha.split(",");
				if(conteudo[0].equals("name")) continue;
				
				String nome = conteudo[0];
				LocalDate dataNascimento = LocalDate.parse(conteudo[2]);
				
				 pessoas.add(new Pessoa(nome, dataNascimento));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	

}

