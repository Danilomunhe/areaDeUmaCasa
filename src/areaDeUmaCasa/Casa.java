package areaDeUmaCasa;

import java.util.Scanner;

public class Casa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String comodo, resposta;
		double largura, comprimento, areaTotal=0;
		double area;
		
		
		
		System.out.print("Vamos come�ar ? " + "( Sim ou N�o): ");
        resposta = leitor.next();
        
        
	 
       if (resposta.equals("Sim") || resposta.equals("sim") ) {
    	   while(resposta.equals("Sim") || resposta.equals("sim") ){
    	       
    		   
    		   System.out.println("__________________________________");
    		   System.out.print("Nome do comodo:");
    		   comodo = leitor.next();
    		   
    	       System.out.print("Informe a largura do comodo: ");
    	       largura = leitor.nextDouble();
    	       
    	       System.out.print("Informe o comprimento do comodo: ");
    	       comprimento = leitor.nextDouble();
    	       
    	       area = largura * comprimento;    	     
    	       areaTotal = area + areaTotal;
    	       
    	       System.out.println("O comodo " + comodo + " possui uma �rea de: " + area + " m2");
    	       
    	       System.out.println("__________________________________");
    	       System.out.println("Deseja adicionar mais um c�modo ? ");
    	       resposta = leitor.next(); 
    	   }
    	   leitor.close();
       }else {
    	   System.out.println("Aplica��o Encerrada");
       }
       
       System.out.println("A �rea total foi de: " + areaTotal);

}
}