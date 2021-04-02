// Ejemplo 2.6: Producto.java
// Calcular el producto de tres enteros.
import java.util.Scanner; // el programa usa Scanner

public class Producto 
{
   public static void main( String args[] )
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int x; // primer n�mero introducido por el usuario
      int y; // segundo n�mero introducido por el usuario
      int z; // tercer n�mero introducido por el usuario
      int resultado; // producto de los n�meros

      System.out.print( "Escriba el primer entero: " ); // indicador de entrada
      x = entrada.nextInt(); // lee el primer entero

      System.out.print( "Escriba el segundo entero: " ); // indicador de entrada
      y = entrada.nextInt(); // lee el segundo entero
      
      System.out.print( "Escriba el tercer entero: " ); // indicador de entrada
      z = entrada.nextInt(); // lee el tercer entero

      resultado = x * y * z; // calcula el producto de los n�meros

      System.out.printf( "El producto es %d\n", resultado );

   } // fin del m�todo main

} // fin de la clase Producto


/**************************************************************************
Resultados de la corrida:
Escriba el primer entero: 3
Escriba el segundo entero: 4
Escriba el tercer entero: 5
El producto es 60
 *************************************************************************/