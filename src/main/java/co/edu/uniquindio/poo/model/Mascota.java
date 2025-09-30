package co.edu.uniquindio.poo.model;

public class Mascota {

    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String id;
    private Dueno dueno;


    public Mascota(String nombre,String especie,String raza,int edad,String id,Dueno dueno){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.id = id;
        this.dueno = dueno;
    }

    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }
    public String getId(){
        return id;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    public void setRaza(String raza){
        this.raza = raza;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void getId(String id){
        this.id = id;
    }
    public Dueno getDueno() {
        return dueno;
    }

    @Override
    public String toString(){
        return "Mascota {\n Nombre: " + nombre + "\n Especie: " + especie + "\n Raza: " + raza + "\n Edad: " + edad + "\n Id: " + id + "\n Dueño: " + dueno.getNombre() + "\n" + "}";
    }

}