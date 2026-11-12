import java.util.Scanner; 
public class Examen{
    public static void main(String []args) {

        System.out.println("Examen parcial ");
        Scannner scanner = new Scanner (System.in);
        System.out.println("Cual es tu edad  ");
          int edad=scanner.next.Int();
        do {
          System.out.println("Cual es tu edad  ");
           edad=scanner.next.Int();
            }while (edad>16&&edad <99 );

          if (edad >=18){
             System.out.println("Mayor edad  ");
          }else{
             System.out.println("Menor edad ");
          }
       

        

}
}