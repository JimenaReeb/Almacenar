package almacenar;
import java.util.List;
import java.util.LinkedList;
public class Contenedor {
    List<Paquete> contenido;
    public Contenedor(){
        contenido=new LinkedList<>();
    }
    public boolean agregar(Paquete paquete){
        return !contenido.contains(paquete) && !contenido.add(paquete);
    }
    public boolean remover(Paquete paquete){
        return contenido.remove(paquete);
    }
    public double getVolumen(){
        int suma=0;
        for(Paquete paquete:contenido){
            suma+=paquete.getVolumen();
        }
        return suma;
    }
    public int cantidad(){
        return contenido.size();
    }
    public void limpiar(){
        contenido.clear();
    }
    public boolean contiene(Paquete paquete){
        return contenido.contains(paquete);
    }
}
