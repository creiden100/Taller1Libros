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
public class PruebaLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ConjuntoLibros cl=new ConjuntoLibros();
        cl.CraeLibros("Alice in Wonderland", "Lewis Carroll" , 320,8);
        cl.CraeLibros("El método Lean Startup", "Eric Ries" , 700,7);
        
    }
    
}
