package co.edu.uniquindio.poo.model;

public class Dueno {

    private String nombre;
    private String telefono;
    private String direccion;
    private String id;
    private Mascota[] mascotas;

    public Dueno(String nombre,String telefono,String direccion,String id){
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.id = id;
        this.mascotas = new Mascota[3];
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getId(){
        return id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setId(String id){
        this.id = id;
    }

    @Override
    public String toString(){
        return "Dueno: {\n Nombre: " + nombre + "\n Telefono: " + telefono + "\n Direccion: " + direccion + "\n Id: " + id + "}\n";
    }
}
