package co.edu.uniquindio.poo.test;


import co.edu.uniquindio.poo.model.Veterinaria;
import co.edu.uniquindio.poo.model.Dueno;
import co.edu.uniquindio.poo.model.Mascota;
import co.edu.uniquindio.poo.model.Perro;
import co.edu.uniquindio.poo.model.Gato;
import co.edu.uniquindio.poo.model.Ave;
import co.edu.uniquindio.poo.model.Reptil;
import co.edu.uniquindio.poo.model.Especie;
import co.edu.uniquindio.poo.model.Edad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeterinariaTest {

    private Veterinaria vet;
    private Dueno dueno;
    private Perro perro;
    private Gato gato;
    private Ave ave;
    private Reptil reptil;
    private Especie especie;

    @BeforeEach
    void setUp() {
        vet = new Veterinaria("Mi Vet", "999");
        vet.agregarDueno("Carlos", "12345", "Calle 10", "D1",30);
    }


    @Test
    void testAgregarDuenoExitoso() {
        boolean resultado = vet.agregarDueno("Ana", "54321", "Carrera 5", "D2",40);
        assertTrue(resultado, "El dueño debería agregarse exitosamente");
    }


    @Test
    void testAgregarDuenoDuplicado() {
        boolean resultado = vet.agregarDueno("Carlos", "12345", "Calle 10", "D1",30);
        assertFalse(resultado, "No debería permitir dueños con ID duplicado");
    }


    @Test
    void testRegistrarMascotaExitosamente() {
        boolean resultado = vet.almacenarPerro("Firulais", Especie.PERRO , "Labrador", Edad.CACHORRO, 12, "12",dueno);
        assertTrue(resultado, "La mascota debería registrarse exitosamente");
    }


    @Test
    void testRegistrarMascotaConIdDuplicado() {
        vet.almacenarPerro("Firulais",Especie.PERRO, "Labrador", Edad.CACHORRO, 12,"12", dueno);
        boolean resultado = vet.almacenarPerro("Max", Especie.PERRO, "Pastor", Edad.CACHORRO, 12,"12",dueno);
        assertFalse(resultado, "No debería permitir mascotas con ID duplicado");
    }


    @Test
    void testActualizarMascota() {
        vet.almacenarGato("Luna", Especie.GATO, "Siames", Edad.CACHORRO, 3,"M2", dueno);
        boolean resultado = vet.actualizarGato("Luna Nueva", "Persa", 4,"M2");
        Gato gato = vet.obtenerGato("M2");

        assertTrue(resultado, "La mascota debería actualizarse");
        assertEquals("Luna Nueva", gato.getNombre(), "El nombre debería actualizarse");
        assertEquals("Persa", gato.getRaza(), "La raza debería actualizarse");
        assertEquals(5, gato.getEdad(), "La edad debería actualizarse");
    }


    @Test
    void testCalcularCostoConsultaPerroCachorro() {
        Mascota cachorro = new Perro("Rocky",Especie.PERRO , "Bulldog",Edad.CACHORRO, 6,"M3", dueno);
        double costo = vet.calcularCostoConsulta(cachorro);

        assertEquals(30000 + 5000 + 5000, costo, "El costo debería ser base + perro + cachorro");
    }


}
