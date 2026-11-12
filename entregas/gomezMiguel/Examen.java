import java.util.Scanner;

public class Examen {

    public static void main(String[] args) {
        System.out.println("Examen parcial");
        Scanner scanner = new Scanner(System.in);
        int edad = 0;

        do {
            System.out.println("Cual es tu edad");
            edad = scanner.nextInt();
        } while (edad <= 16 || edad >= 99);

        if (edad >= 18) {
            System.out.println("Mayor edad");
        } else {
            System.out.println("Menor edad");
        }

        int materias = 0;

        do {
            System.out.println("Cuantas materias estas matriculado");
            materias = scanner.nextInt();
        } while (materias < 1 || materias >= 10);

        double total = 0;
        int notasMayoresACinco = 0;
        int suspendidos = 0;

        for (int i = 0; i < materias; i++) {
            double nota = 0;

            do {
                System.out.println("nota de esta materia " + (i + 1));
                nota = scanner.nextDouble();
            } while (nota < 0 || nota > 10);

            total = total + nota;

            if (nota > 5) {
                notasMayoresACinco = notasMayoresACinco + 1;
            }
        }

        double media = total / materias;
        System.out.println("La media es: " + media);
        System.out.println("Cantidad de notas mayores a 5: " + notasMayoresACinco);

        scanner.close();
        do {
            
        }
    }
}