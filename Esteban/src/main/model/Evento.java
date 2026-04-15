public class model {
    private String nombre;
    private int tipo_evento;
    private Date fecha_realizacion;
    private String ubicacion;
    private int capacidad;
    public model(String nombre, int tipo_evento, Date fecha_realizacion, String ubicacion, int capacidad) {
        this.nombre = nombre;
        this.tipo_evento = tipo_evento;
        this.fecha_realizacion = fecha_realizacion;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;

    
    }
}
