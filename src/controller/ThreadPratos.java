package controller;

import java.util.concurrent.Semaphore;

public class ThreadPratos extends Thread {
	
	
 private int idPrato;
 private static int posInicio;
 private static int posEntrega;
 private Semaphore semaforo;
 private static int tempoParcialCozimento =100;
 
 public ThreadPratos(int idPrato, Semaphore semaforo) {

	 this.idPrato = idPrato;
	 this.semaforo = semaforo;
	 
}
 
 
@Override
	public void run() {
		
	pratoInicio();
	pratoEmProducao();
	
	pratoEntregue();
	
	}

private void pratoInicio() {
	posInicio++;
	
	
	System.out.println("#" + idPrato + " foi o " + posInicio + " ° a iniciar");
}


private void pratoEmProducao() {
	
	String nomePrato ="";
	int tempoProducao =0;
	 double percentual=0.0;
	 int tempoDecorrido=0;
	 
	 //Código teste para ser inserido na classe controller
	
	if(idPrato%2==0){
		nomePrato ="Lasanha";
		tempoProducao =(int) ((Math.random() * 601) + 600);
		while(tempoDecorrido < tempoProducao){
			
			 
			 tempoDecorrido += tempoParcialCozimento;
			 
			 percentual=(tempoDecorrido / tempoProducao);
			 
			 System.out.println("#"+ idPrato+ " é "+nomePrato+" está com " +(percentual*100)+" %");
			 
			 try {
				sleep(100);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			 
			 
		}
		
	}
		
		else{
			
			nomePrato ="Sopa de cebola";
			tempoProducao =(int) ((Math.random() * 301) + 500);
			
			
			
		}

		
		
		
	}
	
	





private void pratoEntregue() {
 
	
}
 	
}
