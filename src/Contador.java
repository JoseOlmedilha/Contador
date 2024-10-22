import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
  
        boolean situacao = true;
        Scanner sc = new Scanner(System.in);
        

        do{
        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        try {
           situacao =  contar(numero1, numero2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
            continue;
        }
      
        }while (situacao); 
            
        
        sc.close(); 
        
    }


    public static boolean contar(int numero1, int numero2) throws ParametrosInvalidosException{
       
        
        if ( numero1 >= numero2){
            throw new ParametrosInvalidosException("O segundo parametro tem que ser maior que o primeiro. ");  
        }

        int contagem = numero2 - numero1; 

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + i);   
        }

        return false;

    }

}