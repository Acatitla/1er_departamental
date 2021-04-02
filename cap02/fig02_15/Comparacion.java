// Fig. 2.15: COmparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales  
// y de igualdad.
import java.util.Scanner; // el programa utiliza la clase Scanner

public class Comparacion 
{
   // el m�todo main empieza la ejecuci�n de la aplicaci�n en Java
   public static void main( String args[] )
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int numero1; // primer n�mero a comparar
      int numero2; // segundo n�mero a comparar

      System.out.print( "Escriba el primer entero: " ); // indicador 
      numero1 = entrada.nextInt(); // lee el primer n�mero del usuario

      System.out.print( "Escriba el segundo entero: " ); // indicador 
      numero2 = entrada.nextInt(); // lee el segundo n�mero del usuario 
      
      if ( numero1 == numero2 ) 
         System.out.printf( "%d == %d\n", numero1, numero2 );

      if ( numero1 != numero2 )
         System.out.printf( "%d != %d\n", numero1, numero2 );

      if ( numero1 < numero2 )
         System.out.printf( "%d < %d\n", numero1, numero2 );

      if ( numero1 > numero2 )
         System.out.printf( "%d > %d\n", numero1, numero2 );

      if ( numero1 <= numero2 )
         System.out.printf( "%d <= %d\n", numero1, numero2 );

      if ( numero1 >= numero2 )
         System.out.printf( "%d >= %d\n", numero1, numero2 );

   } // fin del m�todo main

} // fin de la clase Comparacion


/**************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y                *
 Resultados de la corrida:
Escriba el primer entero: 2
Escriba el segundo entero: 3
2 != 3
2 < 3
2 <= 3

Escriba el primer entero: 4
Escriba el segundo entero: 4
4 == 4
4 <= 4
4 >= 4

Escriba el primer entero: 6
Escriba el segundo entero: 5
6 != 5
6 > 5
6 >= 5
 *************************************************************************/