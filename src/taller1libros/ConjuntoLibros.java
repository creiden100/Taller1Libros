/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1libros;

/**
 *
 * @author SERGIO
 */
public class ConjuntoLibros {
    
    private Libro[] libros;

    public ConjuntoLibros() {
        this.libros = new Libro[10];
    }

       public void CraeLibros(String titulo, String autor, int  numeroPaginas, int calificacion) {
           int ban=-1;
           if(libros.length<10){
               ban=(libros.length-1);
           if(verificar(titulo,autor)){
               Libro l;
               l = new Libro(titulo,autor);
               libros[ban]=l;
           }else{
               System.err.println("El titulo del libro ya esta.");
           }
           if( numeroPaginas!=-1){
               libros[ban].setNumeroPaginas(numeroPaginas);
           }
           if( calificacion!=-1){
               libros[ban].setCalificacion(calificacion);
           }
           }else{
               System.err.println("La lista de libros esta llena.");
           }
           
           
    }
       public boolean verificar(String titulo, String autor) {
        
           boolean bandera=false;
           if (libros.length==0) {
               bandera=true;
           }else{
               for(int i=0;i<libros.length;i++){
               if(!libros[i].getAutor().equals(autor)&&!libros[i].getTitulo().equals(titulo)){
                   bandera=true;
               }
               }
               
           }
          
       return bandera;       
    }
}
