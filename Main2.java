import java.util.Scanner;
import java.util.Random;

public class Main2{
  Scanner scanner = new Scanner(System.in);
  void Main2(){ 
		int soma = 0;
		Random random = new Random();
		System.out.println("Jogo escolhido 2");
		System.out.println("Escolha o lugar da comida");
		System.out.println("Obs: O plano é 4x4, numero fora do limite não terão espaço cedido, e pode escolher a cor dos robos");
		System.out.print("Linha: ");
		int m1 = scanner.nextInt();
		System.out.print("Coluna: ");
		int m2 = scanner.nextInt();
		System.out.print("Cor do robo(1): ");
		String cor_do_Robo1 = scanner.next();
		System.out.print("Cor do robo(2): ");
		String cor_do_Robo2 = scanner.next();
		Robo robo1 = new Robo(m1,m2,cor_do_Robo1);
		Robo robo2 = new Robo(m1,m2,cor_do_Robo2);
		int movimento1;
		int movimento2;
		boolean k1 = false;
		boolean k2 = false;
		boolean k = (k1 && k2);
		boolean k0 = (k1 || k2);
		for(k = false; k0 != true;){
            movimento1 = random.nextInt(4);
            movimento2 = random.nextInt(4);
     		robo1.mover(movimento1);
     		robo1.mensagens();
			k1 = robo1.encontrou_o_alimento();
     		robo2.mover(movimento2);
     		robo2.mensagens();
			k2 = robo2.encontrou_o_alimento();
			soma = + 1;
			}
    	}
	}