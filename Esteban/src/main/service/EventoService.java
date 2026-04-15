import repository.EventoRepository;
import model.Evento;
import java.util.list;
public class EventoService {
    private EventoRepository repository = new EventoRepository();
    public List<Evento> listar(){
        return EventoRepository.obtenerTodos();
}
    public Evento crear (Evento evento) {
        return repository.buscarPorId(id);
    }
    public Evento actualizar (Long id,Evento nuevo){
        Evento existente = repository.buscarPorId(id);
        if (existente.setNombre(nuevo.getNombre());
            existente.setTipo(nuevo.getTipo());
            existente.setFecha(nuevo.getFecha());
            existente.setUbicacion(nuevo.getUbicacion());
            existente.setCapacidad(nuevo.getCapacidad());
    }
    return existente;
    }
    public void eliminar(Long id){
        repository.eliminar(id);
    }
} 
