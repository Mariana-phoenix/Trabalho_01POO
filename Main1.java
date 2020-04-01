import java.util.Scanner;

public class Main1{
  Scanner scanner = new Scanner(System.in);
  void Main1(){ 
		int soma = 0;
		System.out.println("Jogo escolhido 1");
		System.out.println("Escolha o lugar da comida");
		System.out.println("Obs: O plano é 4x4, numero fora do limite não terão espaço cedido, e pode escolher a cor de seu robo");
		System.out.print("Linha: ");
		int m1 = scanner.nextInt();
		System.out.print("Coluna: ");
		int m2 = scanner.nextInt();
		System.out.print("Cor: ");
		String cor_do_Robo = scanner.next();
		Robo robo = new Robo(m1,m2,cor_do_Robo);
		for(boolean k = false; k != true;){
			if(soma >= 1){
      			System.out.println("*------------------*");
     			System.out.println("Não acabou o  jogo");}
				System.out.println("Faca seu movimento: ");         
				String movimento = scanner.next();                   
     			robo.mover(movimento);
     			robo.mensagens();
     			soma = robo.somavez();
				k = robo.encontrou_o_alimento();
    	}
	}
}
