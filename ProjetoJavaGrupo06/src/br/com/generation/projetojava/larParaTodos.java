package br.com.generation.projetojava;
import java.util.Scanner;

public class larParaTodos {

	public static void main(String[] args) {
		
		int contribuicao = 0, animal = 0 ;
		Scanner input = new Scanner(System.in);
		
		//
		
		System.out.println("Como vc gostartia de contribuir? Digite 1 - Adoção; 2 - Doação; 3 - Denúncia.");
		contribuicao = input.nextInt(); 
		if ( contribuicao == 1) {
			//adocao gato e cachorro
			//classe ADOÇAO ---> 
			//CLASSE CADASTRO ---> Cadastro(); --- > roda a classe cadastro
			
			System.out.println("Você gostaria de adotar um cat ou dog? Digite 1 - dog; 2 - cat.");
			 animal = input.nextInt(); 
			 if (animal == 1) {
				 //Classe dogs ---> Cachorro();
				 
			 } else {
				 //CLASSE GATO --> Gato();			 }
			 }
			
		} else if (contribuicao == 2) {
			//doacao
			// CALSSE DOAÇAO ---> METODOS
			
		}
		
		else {
			//denuncia
			
			//CLASSE DENUNCIA
		}
		
				
	}

}
