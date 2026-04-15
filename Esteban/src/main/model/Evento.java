import jakarta.validation.constraints.NotBlank;

public class Evento {
    private Long id;
    private String nombre;
    private String tipo;
    private String fecha;
    private String ubicacion;
    private int capacidad;

    public Evento(){}
    
    public Evento(Long id,String nombre,String tipo,String fecha,String ubicacion,int capacidad){
        this.id=id;
        this.nombre=nombre;
        this.tipo=tipo;
        this.fecha=fecha;
        this.ubicacion=ubicacion;
        this.capacidad=capacidad;
    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getFecha() {return fecha;}
    public void setFecha(String fecha) {this.fecha = fecha;}

    public String getUbicacion() {return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

    public int getCapacidad() {return capacidad;}
    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}
}   
