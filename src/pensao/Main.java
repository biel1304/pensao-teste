package pensao;

import java.util.Scanner;

import entities.Estudantes;
import entities.Quartos;

public class Main {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int numEstudantes;
		int numQuarOc = 0;
		Quartos[] quartos = new Quartos[10];
		System.out.print("Escreva o número de estudantes: ");
		int teste = tec.nextInt();
		
		numEstudantes = 0;
		
		if(teste<=10 && teste>=1) {
			numEstudantes = teste;
		} else {
			// control + espaço pra auto completar
			System.out.println("Seu número deve ser entre 1 e 10! Recomeçe o programa.");
		}
			
		Estudantes[] estudantes = new Estudantes[numEstudantes];
		quartos[0] = new Quartos();
		quartos[0].setOcupado(false);
		quartos[1] = new Quartos();
		quartos[1].setOcupado(false);
		quartos[2] = new Quartos();
		quartos[2].setOcupado(false);
		quartos[3] = new Quartos();
		quartos[3].setOcupado(false);
		quartos[4] = new Quartos();
		quartos[4].setOcupado(false);
		quartos[5] = new Quartos();
		quartos[5].setOcupado(false);
		quartos[6] = new Quartos();
		quartos[6].setOcupado(false);
		quartos[7] = new Quartos();
		quartos[7].setOcupado(false);
		quartos[8] = new Quartos();
		quartos[8].setOcupado(false);
		quartos[9] = new Quartos();
		quartos[9].setOcupado(false);
		
		for (int t=0; t<estudantes.length; t++) {
				estudantes[t] = new Estudantes();
				
				System.out.print("Digite o nome do estudante: ");
				estudantes[t].setNome(tec.next());
				
				System.out.print("Digite o email do estudante: ");
				estudantes[t].setEmail(tec.next());
				
				System.out.print("Digite o aluguel do estudante: ");
				estudantes[t].setAluguel(tec.nextDouble());
				
				System.out.print("Digite o quarto do estudante: ");
				int q = tec.nextInt() + 1;
				
				if (q<=11 && q>=2){
					System.out.println("---------------");
				} else {
					System.out.println("Escolha um quarto válido! Reinicie o programa.");
				}
				
				if (quartos[q].isOcupado()) {
					System.out.println("Erro: esse quarto já está ocupado!");
					System.out.println("---------------");
					estudantes[t].setNumQuarto(-1);
					estudantes[t].setAluguel(-1);
					estudantes[t].setEmail("Erro");
					estudantes[t].setNome("Erro");
				} else{
					estudantes[t].setNumQuarto(q);
					numQuarOc++;
					quartos[q].setOcupado(true);					
				}	
			}
		
		
		System.out.println("Número de quartos ocupados: "+ numQuarOc);
					
			for (int ti=0; ti<estudantes.length; ti++) {
				System.out.println("Rent #"+ti);
				System.out.println("Nome: "+estudantes[ti].getNome());
				System.out.println("Email: "+estudantes[ti].getEmail());
				System.out.println("Room: "+estudantes[ti].getNumQuarto());
				System.out.println("-----------------");
			}
			
			System.out.println("Quartos ocupados: ");
			
			for (int tim=0; tim<estudantes.length; tim++) {
				System.out.print(" "+ estudantes[tim].getNumQuarto());
				System.out.print(": "+ estudantes[tim].getNome());
				System.out.println(", "+ estudantes[tim].getEmail());
			}
			
		tec.close();
	}

}
