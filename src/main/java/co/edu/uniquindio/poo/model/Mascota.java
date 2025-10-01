package co.edu.uniquindio.poo.model;

public abstract class  Mascota {

    private String nombre;
    private String raza;
    private Edad edad;
    private double pesoKg;
    private String id;
    private Dueno dueno;


    public Mascota(String nombre,String raza,Edad edad,double pesoKg,String id,Dueno dueno){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.pesoKg = pesoKg;
        this.id = id;
        this.dueno = dueno;
    }

    public String getNombre(){
        return nombre;
    }

    public String getRaza(){
        return raza;
    }
    public Edad getEdad(){
        return edad;
    }
    public double getPesoKg(){
        return pesoKg;
    }
    public String getId(){
        return id;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setEdad(Edad edad){
        this.edad = edad;
    }
    public void setPesoKg(double pesoKg){
        this.pesoKg = pesoKg;
    }
    public void getId(String id){
        this.id = id;
    }
    public Dueno getDueno() {
        return dueno;
    }

    @Override
    public String toString(){
        return "Mascota {\n Nombre: " + nombre + "\n Raza: " + raza + "\n Edad: " + edad + "\n Peso en kilos: " + pesoKg + "\n Id: " + id + "\n Dueño: " + dueno.getNombre() + "\n" + "}";
    }

    public abstract double getCostoExtraEspecie();

    public abstract Especie getEspecie();

}