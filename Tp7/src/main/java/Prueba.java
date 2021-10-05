/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author martinbordon
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        Materia m1 = new Materia(1 ,"Ingles I", 1);
        Materia m2 = new Materia(2 ,"Matematica", 1);
        Materia m3 = new Materia(3 ,"Laboratorio 1", 1);
        
        a1.agregarMateria(m1);
        a1.agregarMateria(m2);
        a1.agregarMateria(m3);
        
        
        a2.agregarMateria(m1);
        a2.agregarMateria(m2);
        a2.agregarMateria(m3);
        a2.agregarMateria(m3);
        
      
        System.out.println("Lopez se inscribió en " +a1.cantidadDeMaterias()+ " materias.");
        System.out.println("-----------------------------");
        System.out.println("Martinez se inscribió en " +a2.cantidadDeMaterias()+ " materias.");
    }
    
}
