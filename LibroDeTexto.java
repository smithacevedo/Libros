public class LibroDeTexto extends Libro {
    private String curso;

    public LibroDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
}
