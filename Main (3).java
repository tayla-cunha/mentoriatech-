
import java.util.Scanner; 

import java.util.Locale; 
public class Main { 
    public static void main(String[] args) { 
        Locale.setDefault(Locale.US);  

        Scanner scanner = new Scanner(System.in); 


        double[] notas = new double[8]; 

        for (int i = 0; i < notas.length; i++) {
 System.out.print("Digite a nota " + (i + 1) + ": "); 
            notas[i] = scanner.nextDouble(); 
        }
            double b1 = (notas[0] + notas[1]) / 2; 
            double b2 = (notas[2] + notas[3]) / 2;
            double b3 = (notas[4] + notas[5]) / 2; 
            double b4 = (notas[6] + notas[7]) / 2; 
            
            double s1 = (b1 + b2) / 2; 
            double s2 = (b3 + b4) / 2;  
            
            double mediaSemestre = (s1 + s2) / 2; 

            double mediaFinal = (b1 + b2 + b3 + b4) / 4; 


        System.out.println("\n===== RESULTADOS ====="); 
        System.out.println("1º Bimestre: " + b1); 
        System.out.println("2º Bimestre: " + b2); 
        System.out.println("1º Semestre: " + s1); 
        System.out.println("----------------------"); 
        System.out.println("3º Bimestre: " + b3);
        System.out.println("4º Bimestre: " + b4);  
        System.out.println("2º Semestre: " + s2); 
        System.out.println("----------------------"); 
        System.out.println("Média Final: " + mediaFinal); 

        scanner.close(); 
    }
}




