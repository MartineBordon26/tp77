/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author martinbordon
 */
public class EstacionamientoA {
    TreeMap <Ubicacion,Vehiculo> lista = new TreeMap<>();

    @Override
    public String toString() {
        return "EstacionamientoA{" + "lista=" + lista + '}';
    }
    
   public boolean agregarVehiculo(Ubicacion ubi, Vehiculo vehi){
        if(lista.containsKey(ubi)){
        
            return false;
        }else {
        
            lista.put(ubi,vehi);
            return true;
            
        }
      
    }
    
    public Vehiculo obtenerVehiculo(Ubicacion  ubi){
        return lista.get(ubi);
    }
    
    public boolean desocuparLugar(Ubicacion ubi){
        return lista.remove(ubi)!=null;
    }
    
    public List<Vehiculo> obtenerVehiculoPorPiso(int piso){
        
        ArrayList<Vehiculo> nuevaLista=new ArrayList<>();
        
        
        Set<Ubicacion> ubicaciones=lista.keySet();
        for(Ubicacion ubi:ubicaciones){
        
            if(piso==ubi.getPiso()){
            
                nuevaLista.add(lista.get(ubi));
            }


