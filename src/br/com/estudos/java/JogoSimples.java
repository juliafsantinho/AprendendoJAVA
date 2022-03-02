package br.com.estudos.java;
//Importado para n�o precisar ficar digitando muito
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;


public class JogoSimples {

	//primeiro m�todo que vai ser execultado em qualquer c�digo JAVA
	public static void main(String[] args) {
	
		//importados
	//	Pegou a classe e criou o objeto, jogando o argumento.
	// Exemplo1: Vai escrever s� show ao inv�s de System.out;
		PrintStream show = System.out;
	// Exemplo2: para captar dados do usu�rio;
		Scanner scan = new Scanner(System.in);
	// Exemplo3: Para gerar um n�mero aleat�rio;
		Random gerador = new Random();
		
		int opcao;
		int escolha_computador;
		int escolha_usuario;
		
		show.println("Ol�! Qual o seu nome?");
		String nome = scan.nextLine();
		
		show.println("Prazer em conhece-lo " + nome + "!\n");
		show.println(nome + ", voc� quer jogar comigo?");
		show.println("\n Informe o n�mero da sua op��o. \n 1 -> SIM \n 2-> N�O");
		opcao = scan.nextInt();
		
		
		//estrutura condicional if e else
		//Se o usu�rio escolheu o n�mero 2, se essa foi sua op��o a frase abaixo ser� execultada.
		if (opcao == 2) {
				
			show.println("Que pena! Mas tudo bem, fica para a pr�xima.");
		
		}else if(opcao == 1) {
			show.println("Ok! O jogo � assim...");
			show.println("Eu vou escolher um n�mero de 0 a 10...");
			show.println("Mas n�o vou falar para voc� qual escolhi.");
			show.println("Se voc� conseguir adivinhar o n�mero.");
			show.println("Voc� ser� o vencedor!!");
			
			escolha_computador = gerador.nextInt(11);
			
			show.println("\nOk, " + nome + ". Eu j� escolhi meu n�mero!");
			show.println("Agora tente adivinhar!");
			
			//estrutura de repeti��o do e while
			do {
				//a escolha do usu�rio 
				escolha_usuario = scan.nextInt();
				// se a escolha do usu�rio for diferente da do computador vai dar a mensagem "Resposta errada!"
				if(escolha_usuario != escolha_computador) {
					show.println("Resposta errada!");
				// se a escolha do usu�rio for igual do computador vai dar a mensagem "Parab�ns! Voc� acertou."
				}else {
					show.println("Parab�ns! Voc� acertou.");
				}
			// Jogo s� dura enquanto a escolha do computador for diferente ao do usuario.
			}while(escolha_computador != escolha_usuario);
			
		}
		
		scan.close();	
	}

}
