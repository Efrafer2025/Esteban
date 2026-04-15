import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/eventos")
public class EventoController {
    private EventoService service = new EventoService();

    @GetMapping

    public List<Evento> listar(){
        return service.listar();
    } 
    @PostMapping
    public Evento crear(@requestBody Evento vento){
        return service.crear(evento);

    }
    @GetMapping("/(id)")
    public Evento obtener(@PathVariable long id){
        return service.obtenerPorId(id);

    }
    @PutMapping("/(id)")
    public Evento actualizar(@PathVariableLong Long id, @RequestBody Evento evento){
        return service.actualizar(id,evento);

    }
    @DeleteMapping("/(id)")
    public void eliminar(@PathVariable Long id){
        service.eliminar(id);
    }
}
