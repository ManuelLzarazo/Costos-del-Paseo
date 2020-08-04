
package costos.del.paseo;

import java.util.Scanner;

public class CostosDelPaseo {

   
    public static void main(String[] args) {
    
              
    Scanner Teclado =new Scanner(System.in);

        double Cpb =60;

        double Cpr =0;

        double Cb =0; 

        double Neg =0;
        
        double Nef =0;
        
        double Ndp =0;
        
        double Npc =0;
        
        double Cpc =0;
        
        double Nhh =0;
        
        double Chd =0;
        

         
    System.out.println("Digite el número de estidiantes gordos");
            Neg = Teclado.nextInt();
       

    System.out.println("Digite el numero de estudiantes flacos");
            Nef = Teclado.nextInt();
            
    System.out.println("Digite el numero de dias del paseo");
            Ndp = Teclado.nextInt();  
            
            
         Cpr =((Neg*2)+Nef);
              
                   
            
            if (Cpr>Cpb){
                Cb = (double)(Cpr/Cpb);
            System.out.println("la cantidad de buses requeridos para el paseo son"+Cb);
            }
            if (Cpr<Cpb){
                Cb = (double)(1);
            System.out.println("la cantidad de buses requeridos oara el paseo es"+Cb);
            }

          Npc = (double)(((Neg*5)+(Nef*3))*Ndp);
                    System.out.println("el numero de platos de comida requeridos en el paseo son "+Npc);
                    
          Cpc = (double)(Npc*10000);
          System.out.print("El Costo de los platos de comida es de "+Cpc);
          System.out.println("pesos");
          
          Nhh = (double)(Neg+Nef)/4;
          System.out.println("La candidad de habitaciones requeridas en el hotel son "+Nhh);
          
          Chd = (double)((Nhh*Ndp)*25000);
          System.out.print("El Costo de las habitaciones del hotel por los días de paseo es "+Chd);
          System.out.println("pesos");
          
         }

    
    }
    

