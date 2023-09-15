public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo de Novela: " + tipo);
    }
}
