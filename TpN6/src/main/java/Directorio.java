
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author martinbordon
 */
public class Directorio {
     private TreeMap<Long, Cliente> lista = new TreeMap<>();
    
     
     
    public boolean agregarCliente(Long tel, Cliente c1) {
     
     if(lista.containsKey(tel)) {
         return false;
     } else {
         lista.put(tel, c1);
         return true;
     }
}
        
     

    
    public Cliente buscarCliente(Long tel) {
        return lista.get(tel);
    }
          
    
//    public List<Long> buscarTelefono(String ape) {
//        ArrayList<Cliente> nuevaLista=new ArrayList<>();
//        
//        Set<Long> tel=lista.keySet();
//        for(Long tel: telefonos) {
//            if(ape==cliente.)
//        }
//    }
    
    public List<Cliente> buscarClientes(String ape) {
       return null;
    }
    
    
    public boolean borrarCliente(Long tel) {
        
        return lista.remove(tel) !=null;
    }
    
    
}
 