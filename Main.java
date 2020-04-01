import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		Main1 jogo1 = new Main1();
		Main2 jogo2 = new Main2();
		int k = 0;
		do{
     			 System.out.println("________________________________________________________________");
     			 System.out.print("\t\tBem vindo ao Jogo\nQual o desejo do jogador?\n");
		  	System.out.print("1.Procurar o alimento\n2.Desafiar e fazer apostas de dois robos de qual encontra o alimento primeiro\n3.Sair\n>>> ");
			int escolha = scanner.nextInt();
			switch(escolha){
				case 1: jogo1.Main1();
						break;
				case 2: jogo2.Main2();
						break;
				default: k =1;
			}
   			 System.out.print("Deseja jogar um novo jogo?\n0.Sim\n1.Não\n>>> ");
		k = scanner.nextInt();
		}while(k == 0);
	 System.out.print("Fim de programa");
	} 
}
