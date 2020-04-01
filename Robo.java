import java.util.ArrayList;

public class Robo extends MovimentoInvalidoException{
	ArrayList <Integer> armazenamento = new ArrayList();
	int[][] plano = new int[4][4];
	int[][] plano_escolhido = new int[4][4];
	int plano_robo[][] = {{1,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}}; 
	int m1, m2;
 	int soma = 0;
	String cor;
	public static String UP = "up";
	public static String DOWN = "down";
	public static String RIGHT = "right";
	public static String LEFT = "left";
	
	Robo(int m1, int m2, String cor){
		this.m1 = m1;
		this.m2 = m2;
		this.cor = cor;
  		this.plano_escolhido[m1][m2] = 1;

	}

	public int getPlano_robo(){
		return this.plano_robo[4][4];
	}

	private void setPlano_robo(int valor){
		for(int i = 0; i < 4; i++){
    		for(int j = 0; j < 4; j++){
    			this.plano_robo[i][j] = valor;
    		}
    	}
	}

	public int getM1(){
		return m1;
	}

	public void setM1(int m1){
		this.m1 = m1;
	}

	public int getM2(){
		return m2;
	}

	public void setM2(int m2){
		this.m2 = m2;
	}
	
	public String getCor(){
		return cor;
	}

	public void setCor(String cor){
		this.cor = cor;
	}

 	public int somavez(){
    	soma += 1;
    	return soma; 
    }

    

	public void mensagens(){
		System.out.println("Plano de seu alimento: (" +m1+","+m2+")");
    	for(int i = 0; i < 4; i++){
      		for(int j = 0; j < 4; j++){
        		if(plano_robo[i][j] == 1){
          			System.out.println("plano_robo: (" +i+","+j+") = "+this.plano_robo[i][j]);
        		}
      		}
    }
		System.out.println("Sua cor: "+ cor);
	}

	
	public boolean mover(String movimento){
      int planoMudar[][] = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
    if(movimento.equals(UP)){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l+1][c];
									plano_robo[l+1][c] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		}
		if(movimento.equals(DOWN)){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l-1][c];
									plano_robo[l-1][c] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		}
		if(movimento.equals(RIGHT)){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l][c+1];
									plano_robo[l][c+1] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		}
		if(movimento.equals(LEFT)){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l][c-1];
									plano_robo[l][c-1] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		}
	return false;
	}

	public boolean mover(int movimento){
      int[][] aux = new int[4][4];
      if(movimento == 1){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l+1][c];
									plano_robo[l+1][c] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		if(movimento == 2){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l-1][c];
									plano_robo[l-1][c] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		if(movimento == 3){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l][c+1];
									plano_robo[l][c+1] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		if(movimento == 4){
			if(MovimentoInvalidoException(movimento) == false){
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){
						for(int l = 0; l < 4 && l >=0; l++){	
							for(int c = 0; c < 4 && c>= 0; c++){ 	
								if(plano_robo[i][j] == 1){
									aux[i][j] = plano_robo[i][j];
									plano_robo[i][j] = plano_robo[l][c-1];
									plano_robo[l][c-1] = aux[i][j];
								}
							}
						}
					}
				}
				for (int i = 0; i < 4 && i >=0 ;i++) {
					for(int j = 0; j < 4 && j >=0 ; j++){	
						setPlano_robo(plano_robo[i][j]); 
					}
				}
				return true;
			}
		}
		return false;
	}

	public boolean encontrou_o_alimento(){
		for (int i = 0; i < 4 && i >=0 ;i++) {
			for(int j = 0; j < 4 && j >=0 ; j++){	
				if(plano_escolhido[m1][m2] == 1 && plano_robo[i][j] == 1 && m1 == i && m2 == j){
						return true;
				}
			}
		}
		return false;
	}

	public boolean MovimentoInvalidoException(String movimento){
		try{
			for (int i = 0; i < 4 && i >=0 ;i++) {
				for(int j = 0; j < 4 && j >=0 ; j++){
					if(movimento == UP){
						if(plano_robo[i][j] == 1){
							if(i++ < 4){return false;}
						}
					}
					if (movimento == DOWN) {
						if(plano_robo[i][j] == 1){
							if(i--<4){return false;}
						}
					}
					if(movimento == RIGHT){
						if(plano_robo[i][j] == 1){
							if(j++<4){return false;}
						}
					}
					if(movimento == LEFT){
						if(plano_robo[i][j] == 1){
							if(j--<4){return false;}
						}
					}

				}
			}
		System.exit(0);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Limite excendido");
		}catch(ArrayStoreException e){
			System.out.println("Problema armazenamento");
		}finally{
			for (int i = 0; i < 4 && i >=0 ;i++) {
				for(int j = 0; j < 4 && i >=0 ; j++){
					if(plano_robo[i][j] == 1){
						System.out.println("Posicao atual: ("+i+","+j+")");
					}
				}
			}
		}
		return true;
	}


	public boolean MovimentoInvalidoException(int movimento){
		try{
			for (int i = 0; i < 4 && i >=0 ;i++) {
				for(int j = 0; j < 4 && j >=0 ; j++){
					if(movimento == 1){
						if(plano_robo[i][j] == 1){
							if(i++<4){return false;}
						}
					}
					if (movimento == 2) {
						if(plano_robo[i][j] == 1){
							if(i--<4){return false;}
						}
					}
					if(movimento == 3){
						if(plano_robo[i][j] == 1){
							if(j++<4){return false;}
						}
					}
					if(movimento == 4){
						if(plano_robo[i][j] == 1){
							if(j--<4){return false;}
						}
					}

				}
			}
		System.exit(0);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Limite excendido");
		}catch(ArrayStoreException e){
			System.out.println("Problema armazenamento");
		}finally{
			for (int i = 0; i < 4 && i >=0 ;i++) {
				for(int j = 0; j < 4 && i >=0 ; j++){
					if(plano_robo[i][j] == 1){
						System.out.println("Posicao atual: ("+i+","+j+")");
					}
				}
			}
		}
		return true;
	}

}
