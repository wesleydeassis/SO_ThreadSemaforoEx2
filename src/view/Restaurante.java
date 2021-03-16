package view;

public class Restaurante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int tempoSopaCebola =600;
		  int tempoLasanha = 1200;
		  int tempoParcialCozimento =100; 
		  int tempoDecorrido=0 ;
		  double percentual=0.0;
		  
		 
		 
		 
		 while(tempoDecorrido < tempoSopaCebola){
			
			 
			 tempoDecorrido += tempoParcialCozimento;
			 
			 percentual=(tempoDecorrido / tempoSopaCebola);
			 
			 System.out.println("O tempo de cozimento está em "+ percentual*100+"%");
			 
			 
		 	}

		
	 		
		 

		}

	}


