import java.util.Scanner;

public class Cambios {
     public static void main (String args[]){
         Scanner scan = new Scanner(System.in);
         String texto ;
         int cont=0;
         String resultado = "";//variable para los datos finales a mostrar

         System.out.print("Ingrese el texto a modificar");
         texto = scan.nextLine();

         for (int i=0;i<texto.length();i++){//recorremos la cadena
             
             if(texto.charAt(i) >='a' && texto.charAt(i) <= 'z'){ //delimito que se encuentre entre a y z min
                 resultado+=Character.toUpperCase(texto.charAt(i));
                 
             }else if(texto.charAt(i) >='A' && texto.charAt(i) <= 'Z'){//delimito que se encuentre entre a y z may
                 resultado+=Character.toLowerCase(texto.charAt(i));
                
             } else if (Character.isDigit(texto.charAt(i))) { // si el caracter es digito incluirlo en resultado

                 resultado+=texto.charAt(i);

             } else{
                 // al no crear else donde reconozcamos los espacios en (i) se imprime todo junto

             }
         }


         System.out.println(resultado);
     }


}
