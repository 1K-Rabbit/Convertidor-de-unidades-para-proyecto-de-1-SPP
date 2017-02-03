/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covertidor.de.distancias.p1;
import java.util.Scanner;
/**
 *
 * @author FabricioArturo
 */
public class CovertidorDeDistanciasP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        int OpEntrada, Entrada, x;
        double centimetros, pulgadas, metros, pies, kilometros, millas;
        System.out.println("Bienvenido al convertidor de distancias.");
        System.out.println("1. Presione 1 para convertir centimetros y pulgadas.");
        System.out.println("2. Preisone 2 para convertir metros y pies.");
        System.out.println("3. Presione 3 para convertir kilometros y millas.");
        OpEntrada = kb.nextInt();
        //Main Switch.
        switch (OpEntrada)
      //Case 1 de Centimetros - Pulgadas. 
        {
            case 1: 
                System.out.println("Convertir centimetros y pulgadas.");
                System.out.println("1.Inserte 1 para convertir  centimetros a pulgadas.");
                System.out.println("2. Inserte 2 para convertir  pulgadas a centimetros.");
                Entrada = kb.nextInt();
                
                x = Entrada;
                        
                    if (x>=1)
                            
                    {
                  System.out.println("Inserte centimetros");
                        centimetros = kb.nextDouble();
                        pulgadas = ( centimetros * 0.393701);
                        System.out.println(centimetros +" centimetros equivalen a " + pulgadas + " pulgadas.");
                    }
                            
                        else {
                        System.out.println(" Inserte pulgadas ");
                        pulgadas = kb.nextDouble();
                        centimetros = (pulgadas * 2.54);
                        System.out.println(pulgadas + " pulgadas equivalen a " + centimetros + " centimetros." );
                        
                }
                                
             //Case 2 de metros a pies.
            case 2:
                System.out.println("Convertir metros y pies.");
                System.out.println("1.Inserte 1 para convertir  metros a pies.");
                System.out.println("2. Inserte 2 para convertir  pies a metros.");
                Entrada = kb.nextInt();
                
                  x = Entrada;
                        
                    if (x>=1)
               
                {
                        System.out.println("Inserte metros");
                        metros = kb.nextDouble ();
                        pies = (metros * 3.28084);
                        System.out.println(metros + " metros equivalen a " + pies + " pies.");
                }
            
                        
                        else {
                        System.out.println("Inserte pies.");
                        pies = kb.nextDouble();
                        metros = (pies * 0.3048);
                        System.out.println(pies + " pies equivalen a " + metros + " metros.");
                        
                 }
            //Case 3 de kilometros - millas
            case 3:
                System.out.println("Convertir kilometros y millas.");
                System.out.println("1. Inserte 1 para convertir kilometros a millas.");
                System.out.println("2. Inserte 2 para covnertir millas a kilometros.");
                Entrada = kb.nextInt();
                x = Entrada;
                        
                    if (x>=1) 
              
              {
                    
                        System.out.println("Inserte kilometros.");
                        kilometros = kb.nextDouble();
                        millas = (kilometros * 0.621371);
                        System.out.println( kilometros + " kilometros equivalen a " + millas + " millas.");
              }
              else {
                        
                    
                        System.out.println("Inserte millas.");
                        millas = kb.nextDouble();
                        kilometros = (millas * 1.60934);
                        System.out.println(millas + " equivalen a" + kilometros + " kilometros.");
                }
                
                
        
            
       
        }
        
        
        // TODO code application logic here
    }
    
}
