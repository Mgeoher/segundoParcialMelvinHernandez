
package tarjetadecreditoydebito;

import java.util.Scanner;

/**
 *
 * @author mgeoh
 */
public class Principal {

    public static void main(String[] args) {
        
       TarjetaCredito tC = new TarjetaCredito () ; 
       Scanner sc= new Scanner(System.in); 
      System.out.println("Bienvenido");
      
      System.out.println("Digite el nombre de la tarjeta");
      String nombre = sc.nextLine();
      System.out.println("Digite el numero de la tarjeta");
      String numero = sc.nextLine();
      System.out.println("Digite el tasa de Interes de la tarjeta");
      String tsaI = sc.nextLine();
      
       
      
      
     System.out.println(tC.n(nombre));
      System.out.println(tC.nu(numero));
      System.out.println(tC.tasa(tsaI));
      
       System.out.println("que desea realizar");
       System.out.println("1-Comprar  2- pagar  3-consultar saldo");
       int opcion = sc.nextInt(); 
       
       switch (opcion) 
               {
           case 1:
               System.out.println("Ingrese el valor a pagar");
               int monto = sc.nextInt();
                System.out.print("el total de su saldo es ");
               System.out.println(tC.comprar(monto));
              
               
               break;
           case 2:
               
               System.out.println("Ingrese el valor");
               int monto1 = sc.nextInt();
               System.out.print("el nuevo monto es: ");
               System.out.println(tC.pagar(monto1));
               
               break;
               
           case 3:
               System.out.print("su saldo acuatual es: ");
                    System.out.println(tC.getlimiteCredito());
               break; 
               
               
       }
       TarjetaDebito tD = new TarjetaDebito ();
       
       System.out.println(tD.n(nombre));
      System.out.println(tD.nu(numero));
      System.out.println(tD.tasa(tsaI));
       
        System.out.println("que desea realizar");
       System.out.println("1-Comprar  2- pagar  3-consultar saldo");
       int opcion1 = sc.nextInt(); 
       
       switch (opcion1) 
               {
           case 1:
               System.out.println("Ingrese el valor a pagar");
               int monto = sc.nextInt();
                System.out.print("el total de su saldo es ");
               System.out.println(tD.comprar(monto));
              
               
               break;
           case 2:
               
               System.out.println("Ingrese el valor");
               int monto1 = sc.nextInt();
               System.out.print("el nuevo monto es: ");
               System.out.println(tD.depositar(monto1));
               
               break;
               
           case 3:
               System.out.print("su saldo acuatual es: ");
                    System.out.println(tD.getlimiteDebito());
                    
               break;
       }  
       }
    }
