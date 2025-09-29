package co.edu.uniquindio.poo.test;


import co.edu.uniquindio.poo.model.Veterinaria;
import co.edu.uniquindio.poo.model.Dueno;
import co.edu.uniquindio.poo.model.Mascota;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeterinariaTest {

    private Veterinaria vet;
    private Dueno dueno;

    @BeforeEach
    void setUp() {
        vet = new Veterinaria("Mi Vet", "999");
        vet.agregarDueno("Carlos", "12345", "Calle 10", "D1");
    }

    // 1️⃣ Registrar un dueño exitosamente
    @Test
    void testAgregarDuenoExitoso() {
        boolean resultado = vet.agregarDueno("Ana", "54321", "Carrera 5", "D2");
        assertTrue(resultado, "El dueño debería agregarse exitosamente");
    }

    // 2️⃣ Evitar registrar un dueño con ID repetido
    @Test
    void testAgregarDuenoDuplicado() {
        boolean resultado = vet.agregarDueno("Carlos", "12345", "Calle 10", "D1");
        assertFalse(resultado, "No debería permitir dueños con ID duplicado");
    }

    // 3️⃣ Registrar una mascota asociada a un dueño
    @Test
    void testRegistrarMascotaExitosamente() {
        boolean resultado = vet.almacenarMascota("Firulais", "Perro", "Labrador", 3, "M1", dueno);
        assertTrue(resultado, "La mascota debería registrarse exitosamente");
    }

    // 4️⃣ Evitar registrar una mascota con ID repetido
    @Test
    void testRegistrarMascotaConIdDuplicado() {
        vet.almacenarMascota("Firulais", "Perro", "Labrador", 3, "M1", dueno);
        boolean resultado = vet.almacenarMascota("Max", "Perro", "Pastor", 5, "M1", dueno);
        assertFalse(resultado, "No debería permitir mascotas con ID duplicado");
    }

    // 5️⃣ Actualizar los datos de una mascota existente
    @Test
    void testActualizarMascota() {
        vet.almacenarMascota("Luna", "Gato", "Siames", 4, "M2", dueno);
        boolean resultado = vet.actualizarMascota("Luna Nueva", "Gato", "Persa", 5, "M2");
        Mascota mascota = vet.obtenerMascota("M2");

        assertTrue(resultado, "La mascota debería actualizarse");
        assertEquals("Luna Nueva", mascota.getNombre(), "El nombre debería actualizarse");
        assertEquals("Persa", mascota.getRaza(), "La raza debería actualizarse");
        assertEquals(5, mascota.getEdad(), "La edad debería actualizarse");
    }

    // 6️⃣ Calcular correctamente el costo de la consulta de un perro cachorro
    @Test
    void testCalcularCostoConsultaPerroCachorro() {
        Mascota cachorro = new Mascota("Rocky", "Perro", "Bulldog", 1, "M3", dueno);
        double costo = vet.calcularCostoConsulta(cachorro);

        assertEquals(30000 + 10000 + 4000, costo, "El costo debería ser base + perro + cachorro");
    }
}
