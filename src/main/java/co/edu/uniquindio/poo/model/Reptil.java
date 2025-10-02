package co.edu.uniquindio.poo.model;

public class Reptil extends Mascota {

    Especie especie;

    public Reptil(String nombre, Especie especie, String raza, Edad edad, double pesoKg, String id, Dueno dueno) {
        super(nombre, raza, edad, pesoKg, id, dueno);

        this.especie = especie;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    @Override
    public double getCostoExtraEspecie() {
        return 10000;
    }
}
