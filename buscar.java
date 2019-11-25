import java.util.*;
public class buscar
{
  public static void main(String[] args){
    Scanner dar = new Scanner(System.in);
    Scanner rellenar = new Scanner(System.in);
    Scanner letra = new Scanner(System.in);
    System.out.println("Cantidad de palabras a ingresar");
    int n= dar.nextInt();
    String cadena [] = new String[n];
    
    for (int j=0;j<cadena.length;j++){
    System.out.println("palabra "+j);
    cadena[j]=rellenar.nextLine();}
    System.out.println("Letra de inicio de palabra:");
    String gf = letra.nextLine();
    for(int k=0;k<cadena.length;k++){
    while(cadena[k].startsWith(gf)) {
       System.out.println(cadena[k]);
    break;}
    }
    }
}

