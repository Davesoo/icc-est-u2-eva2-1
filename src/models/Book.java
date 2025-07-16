package models;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int fecha;

    public Book(String titulo, String autor, int fecha){
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + fecha;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (fecha != other.fecha)
            return false;
        return true;
    }

    @Override
    public int compareTo(Book otro) {
        // Ordenar por título alfabéticamente
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return "Título = " + titulo + ", autor = " + autor + "'}";
    }

}
