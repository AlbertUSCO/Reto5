package model.vo;
public class ProyectoCiudad {
    private String constructora;
    private String fechaInicio;
    private String clasificacion;
    //Constructores
    //constructor vacio para get,set de otras clases 
    public ProyectoCiudad() {
    }
    //Constructor 
    public ProyectoCiudad(String constructora, String fechaInicio, String clasificacion) {
        this.constructora = constructora;
        this.fechaInicio = fechaInicio;
        this.clasificacion = clasificacion;
    }
    //Get, Set
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }  
}
