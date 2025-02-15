public class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        titulo = "Desconocido"; 
        autor = "Sin Autor";
        numeroPaginas = 0 ;
    }

    public Libro (String titulo,String autor,int numeroPaginas) {
        this.titulo = titulo; 
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;   

    }  

    public void mostrarDetalles(){
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("numeroPaginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Libro Libro1 = new Libro();
        Libro1.mostrarDetalles();
    }

}
