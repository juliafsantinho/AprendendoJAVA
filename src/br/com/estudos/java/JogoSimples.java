package br.com.estudos.java;
//Importado para não precisar ficar digitando muito
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;


public class JogoSimples {

	//primeiro método que vai ser execultado em qualquer código JAVA
	public static void main(String[] args) {
	
		//importados
	//	Pegou a classe e criou o objeto, jogando o argumento.
	// Exemplo1: Vai escrever só show ao invés de System.out;
		PrintStream show = System.out;
	// Exemplo2: para captar dados do usuário;
		Scanner scan = new Scanner(System.in);
	// Exemplo3: Para gerar um número aleatório;
		Random gerador = new Random();
		
		int opcao;
		int escolha_computador;
		int escolha_usuario;
		
		show.println("Olá! Qual o seu nome?");
		String nome = scan.nextLine();
		
		show.println("Prazer em conhece-lo " + nome + "!\n");
		show.println(nome + ", você quer jogar comigo?");
		show.println("\n Informe o número da sua opção. \n 1 -> SIM \n 2-> NÃO");
		opcao = scan.nextInt();
		
		
		//estrutura condicional if e else
		//Se o usuário escolheu o número 2, se essa foi sua opção a frase abaixo será execultada.
		if (opcao == 2) {
				
			show.println("Que pena! Mas tudo bem, fica para a próxima.");
		
		}else if(opcao == 1) {
			show.println("Ok! O jogo é assim...");
			show.println("Eu vou escolher um número de 0 a 10...");
			show.println("Mas não vou falar para você qual escolhi.");
			show.println("Se você conseguir adivinhar o número.");
			show.println("Você será o vencedor!!");
			
			escolha_computador = gerador.nextInt(11);
			
			show.println("\nOk, " + nome + ". Eu já escolhi meu número!");
			show.println("Agora tente adivinhar!");
			
			//estrutura de repetição do e while
			do {
				//a escolha do usuário 
				escolha_usuario = scan.nextInt();
				// se a escolha do usuário for diferente da do computador vai dar a mensagem "Resposta errada!"
				if(escolha_usuario != escolha_computador) {
					show.println("Resposta errada!");
				// se a escolha do usuário for igual do computador vai dar a mensagem "Parabéns! Você acertou."
				}else {
					show.println("Parabéns! Você acertou.");
				}
			// Jogo só dura enquanto a escolha do computador for diferente ao do usuario.
			}while(escolha_computador != escolha_usuario);
			
		}
		
		scan.close();	
	}

}
