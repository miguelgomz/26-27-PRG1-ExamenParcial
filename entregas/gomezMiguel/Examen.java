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
           System.out.println("Cuantas materias estas matriculado  ");
           int materias=scanner.next.Int();


           if(materias>1&&edad <10){
           do{
             System.out.println("Cuantas materias estas matriculado  ");
               materias=scanner.next.Int();
           }while(materias>1&&edad <10);

           }
            System.out.println("Cuantas materias estas matriculado  ");
           int materiaas=scanner.next.Int();
           if (int i =0; i<materiaas;i++){
             System.out.println("nota de esta materia   ");
              int nota =scanner.next.Int();
              int total = nota +nota;
           }

    }
}

    }
}
       

        

}
}