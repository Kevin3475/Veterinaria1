package co.edu.uniquindio.poo.model;

public class Veterinaria {

    private String nombre;
    private String nit;
    Mascota [] listMascotas;
    Dueno [] listDuenos;

    public Veterinaria(String nombre,String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listMascotas = new Mascota[10];
        this.listDuenos = new Dueno[10];
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNit(){
        return nit;
    }
    public void setNit(String nit){
        this.nit = nit;
    }


    public boolean almacenarMascota(String nombre,String especie,String raza,int edad,String id,Dueno dueno ){

        Mascota nuevaMascota =
                new Mascota(nombre,especie,raza,edad,id,dueno);

        for(int i = 0; i < listMascotas.length; i ++){
            if(listMascotas[i] != null && listMascotas[i].getId().equals(id)){
                return false;
            }
        }
        for(int i = 0; i < listMascotas.length; i ++){
            if(listMascotas[i] == null ){
                listMascotas[i] = nuevaMascota;
                return true;
            }
        }
        return false;
    }



    private int obtenerPosicionMascota(String id){
        for(int i = 0; i < listMascotas.length; i ++){
            if(listMascotas[i] != null && listMascotas[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public Mascota obtenerMascota(String id){
        int indexMascota = obtenerPosicionMascota(id);
        if(indexMascota == -1) return null;

        return listMascotas[indexMascota];
    }



    public Mascota [] obtenerListaMascotas(){
        return listMascotas;
    }



    public boolean actualizarMascota(String nombre,String especie,String raza,int edad,String id){
        int indexMascota = obtenerPosicionMascota(id);
        if(indexMascota == -1) return false;

        Mascota actualizarMascota = listMascotas[indexMascota];
        actualizarMascota.setNombre(nombre);
        actualizarMascota.setEspecie(especie);
        actualizarMascota.setRaza(raza);
        actualizarMascota.setEdad(edad);
        return true;
    }



    public boolean eliminarMascota(String id){
        int indexMascota = obtenerPosicionMascota(id);
        if(indexMascota == -1) return false;

        listMascotas[indexMascota] = null;
        return true;
    }




    public boolean agregarDueno(String nombre,String telefono,String direccion,String id){
        Dueno nuevoDueno =
                new Dueno(nombre,telefono,direccion,id);

        for(int i = 0; i < listDuenos.length; i ++){
            if (listDuenos[i] != null && listDuenos[i].getId().equals(id)){
                return false;
            }
        }
        for(int i = 0; i < listDuenos.length; i++){
            if(listDuenos[i] == null){
                listDuenos[i] = nuevoDueno;
                return true;
            }
        }
        return false;
    }


    private int obtenerPosicionDueno(String id){
        for(int i = 0; i < listDuenos.length; i++){
            if(listDuenos[i] != null && listDuenos[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public Dueno obtenerDueno(String id){
        int indexDueno = obtenerPosicionDueno(id);
        if(indexDueno == -1) return null;

        return listDuenos[indexDueno];
    }



    public Dueno[] obtenerListaDuenos(){
        return listDuenos;
    }



    public boolean actualizarDueno(String nombre,String telefono,String direccion,String id){

        int indexDueno = obtenerPosicionDueno(id);
        if(indexDueno == -1) return false;

        Dueno actualizarDueno = listDuenos[indexDueno];

        actualizarDueno.setNombre(nombre);
        actualizarDueno.setTelefono(telefono);
        actualizarDueno.setDireccion(direccion);
        return true;
    }



    public boolean eliminarDueno(String id){
        int indexDueno = obtenerPosicionDueno(id);

        if(indexDueno == -1) return false;

        listDuenos[indexDueno] = null;
        return true;
    }



    public double calcularCostoConsulta(Mascota mascota) {
        double valorBase = 30000; // valor fijo base de la consulta
        double costoFinal = valorBase;

        // Incremento según la especie
        if (mascota.getEspecie().equalsIgnoreCase("perro")) {
            costoFinal += 10000;
        } else if (mascota.getEspecie().equalsIgnoreCase("gato")) {
            costoFinal += 8000;
        } else {
            costoFinal += 5000; // otras especies
        }

        // Incremento según la edad
        if (mascota.getEdad() > 10) {
            costoFinal += 7000; // mascotas mayores de 10 años
        } else if (mascota.getEdad() < 2) {
            costoFinal += 4000; // cachorros o muy jóvenes
        }

        return costoFinal;
    }
}




































