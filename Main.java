import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el título del libro: ");
        String titulo = input.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = input.nextLine();

        System.out.print("Ingrese el precio del libro: $");
        double precio = input.nextDouble();
        input.nextLine();

        System.out.println("¿Qué tipo de libro desea registrar?");
        System.out.println("1. Libro de Texto");
        System.out.println("2. Libro de Texto de la UNIAJC");
        System.out.println("3. Novela");
        System.out.print("Elija una opción (1/2/3): ");
        int opcion = input.nextInt();
        input.nextLine();

        Libro libro = null;

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el curso asociado al libro de texto: ");
                String cursoLibroTexto = input.nextLine();
                libro = new LibroDeTexto(titulo, autor, cursoLibroTexto);
                break;
            case 2:
                System.out.print("Ingrese el curso asociado al libro de texto de la IUAC: ");
                String cursoLibroTextoIUAC = input.nextLine();
                System.out.print("Ingrese la facultad que lo publicó: ");
                String facultadIUAC = input.nextLine();
                libro = new LibroDeTextoIUAC(titulo, autor, cursoLibroTextoIUAC, facultadIUAC);
                break;
            case 3:
                System.out.print("Ingrese el tipo de novela (histórica, romántica, policíaca, realista, ciencia ficción o aventuras): ");
                String tipoNovela = input.nextLine();
                libro = new Novela(titulo, autor, tipoNovela);
                break;
            default:
                System.out.println("Opción no válida.");
                input.close();
                return;
        }

        libro.setPrecio(precio);

        System.out.println("\nInformación del libro registrado:");
        libro.imprimirInformacion();

        input.close();
    }
}

