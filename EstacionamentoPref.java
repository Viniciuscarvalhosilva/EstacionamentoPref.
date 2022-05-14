package estacionamentoPref;

import java.util.Scanner; 															
public class EstacionamentoPref 													
{

	public static void main(String[] args)											
	{
		int a,b,c;																	//VARIAVEIS DO TIPO INTEIRO
		Scanner read = new Scanner (System.in);										
		
		System.out.println("DIGITE (1) PARA SIM OU (2)PARA NAO\n");
		System.out.println("Voce tem 60 anos ou mais?\n\n(DIGITE 1 ou 2):\n(1)SIM\n(2)NAO\n");		//MENSAGEM(Voce tem 60 anos ou mais) EXIBIDA NA TELA DO USUARIO, PULA DUAS LINHAS EXIBE (DIGITE 1 OU 2), PULA UMA LINHA E EXIBE (1)SIM OU (2)NAO E PULA UMA LINHA
		a = read.nextInt();															//LE VALOR DIGITADO E GRAVA NA VARIAVEL a
		System.out.println("-------------------------------");						//EXIBE CARACTERES NA TELA DO USUARIO E PULA UMA LINHA
		
		System.out.print("Voce e gestante?\n\n(DIGITE 1 ou 2):\n(1)SIM\n(2)NAO\n");	//MENSAGEM EXIBIDA NA TELA DO USUARIO
		b = read.nextInt();															//LE VALOR DIGITADO E GRAVA NA VARIAVEL b
		System.out.println("-------------------------------");						//EXIBE CARACTERES NA TELA DO USUARIO E PULA UMA LINHA
		
		System.out.print("Voce tem alguma deficiencia?\n\n(DIGITE 1 ou 2):\n(1)SIM\n(2)NAO\n");	//MENSAGEM EXIBIDA NA TELA DO USUARIO
		c = read.nextInt();															//LE VALOR DIGITADO E GRAVA NA VARIAVEL c
		System.out.println("");
		
		if(a == 1 || b==1 ||c==1)													//CONDICAO E COMPARACAO LOGICA 'OU'
		{
			System.out.println("*******************************");					//EXIBE CARACTERES NA TELA DO USUARIO E PULA UMA LINHA
			System.out.println("Voce PODE estacionar na vaga");						//SE QUALQUER DAS CONDICOES FOREM VERDADEIRAS EXIBE MENSAGEM PARA USUARIO E PULA UMA LINHA
			System.out.println("*******************************");					//EXIBE CARACTERES NA TELA DO USUARIO E PULA UMA LINHA
		}
		else
		{
			System.out.println("********************************");					//EXIBE CARACTERES NA TELA DO USUARIO E PULA UMA LINHA
			System.out.println("Voce NAO pode estacionar na vaga");					//SE TODAS AS CONDICOES FOREM FALSAS EXIBE MENSAGEM PARA USUARIO E PULA UMA LINHA
			System.out.println("********************************");					//EXIBE CARACTERES NA TELA DO USUARIO E PULA UMA LINHA
		}
		

	}

}
