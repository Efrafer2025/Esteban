
import model.evento;
import java.util.ArrayList;
import java.util.List;
public class repository {
private List<evento> obtenertodos(){
    return listaeventos;
}
public Evento guardar(Evento evento){
    listaEventos.add(evento);
        return evento;
    
}
public Evento buscarPorId(Long id){
    for (Evento e: listaEventos){
        if (e.getId().equals(id)){
        return e;
        }
    }
    return null;
}
public void eliminarPorId(Long id){
    listaEventos.removeIf(e -> e.getId().equals(id));
}
}
