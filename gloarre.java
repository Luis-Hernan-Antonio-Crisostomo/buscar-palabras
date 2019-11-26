import java.util.*;
public class gloarre
{
    public static void main(String[] args){
      Scanner a = new Scanner(System.in);
      Scanner b = new Scanner(System.in);
      int cantidad;
      System.out.println("CANTIDAD DE PALABRAS");
      cantidad = a.nextInt();
      String palabras[] = new String[cantidad];
      for(int i=0; i<cantidad; i++){
           System.out.println("palabra "+i);
          palabras[i]=b.nextLine();
        }
      System.out.println("PALABRAS impresas en orden alreves");
      for(int i=cantidad-1; i>=0; i--){
           System.out.println(palabras[i]);
        }
    }
}
