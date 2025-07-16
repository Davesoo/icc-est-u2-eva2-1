package controllers;
import models.Book;
import java.util.*;

public class LibroController {
    
    public Set<Book> procesarLibros (List<Book> libros){
        Set<Book> libroSet = new TreeSet<>(libros);
        return libroSet;
    }

    public void imprimirLibros(Set<Book> libros){
        for (Book libro : libros){
            System.out.println(libro);
        }
    } 
}
