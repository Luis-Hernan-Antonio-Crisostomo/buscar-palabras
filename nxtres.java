import java.util.*;
public class nxtres{
public static void main(String[] args){
Scanner a = new Scanner(System.in);
Scanner b = new Scanner(System.in);
/**Scanner d = new Scanner(System.in);
Scanner e = new Scanner(System.in);**/
int c;
System.out.println("Cantidad de productos a ingresar:");
c = a.nextInt();
String producto[] = new String [c];
for(int i=0; i<c; i++){
  System.out.println("Nombre del producto: "+i);
  producto [i] = b.nextLine();
}
  
  int precio[] = new int [c];
for(int h=0; h<c; h++){
  System.out.println("precio de: "+h);
  precio [h] = b.nextInt();
}
  int cantidad[] = new int [c];
for(int g=0; g<c; g++){
  System.out.println("cantidad: "+ g);
  cantidad [g] = b.nextInt();
}
for(int g=0; g<c; g++){
  System.out.print(producto[g]+" "+"$"+precio[g]+" "+cantidad[g]+" ");
  System.out.println();
}
System.out.println("**************************************************");
System.out.println("TOTAL A PAGAR:");
int total[] =new int[c];
for(int i=0; i<c; i++){
    total[i] = cantidad[i]*precio[i];
}
for(int g=0; g<c; g++){
  System.out.print(producto[g]+" "+"$"+total[g]+" ");
  System.out.println();
}
 
System.out.println("**************************************************");
}
}


