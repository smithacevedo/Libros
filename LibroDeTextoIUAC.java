public class LibroDeTextoIUAC extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoIUAC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
    }
}
