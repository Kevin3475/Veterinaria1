package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;

public class MainViewController {

    @FXML
    private Button btnAgregarDueno;

    @FXML
    private Button btnAgregarMascota;

    @FXML
    private Button btnListarMascotas;

    @FXML
    private Button btnListarDuenos;

    // Lista de Dueños y Mascotas (simula tu Veterinaria)
    private List<Dueno> listaDuenos = new ArrayList<>();
    private List<Mascota> listaMascotas = new ArrayList<>();

    @FXML
    public void initialize() {
        btnAgregarDueno.setOnAction(this::agregarDueno);
        btnAgregarMascota.setOnAction(this::agregarMascota);
        btnListarMascotas.setOnAction(this::listarMascotas);
        btnListarDuenos.setOnAction(this::listarDuenos);
    }

    private void agregarDueno(ActionEvent event) {
        Dueno d = new Dueno("Juan Pérez","3101234567","Calle Falsa 123","D001",0);
        listaDuenos.add(d);
        System.out.println("Dueño agregado: " + d);
    }

    private void agregarMascota(ActionEvent event) {
        if (listaDuenos.isEmpty()) {
            System.out.println("Primero agrega un dueño");
            return;
        }
        // Ejemplo: agregar un Gato
        Dueno dueño = listaDuenos.get(0);
        Mascota m = new Gato("Michi", Especie.GATO, "Siames", Edad.ADULTO, 3.5, "M001", dueño);
        listaMascotas.add(m);
        System.out.println("Mascota agregada: " + m);
    }

    private void listarMascotas(ActionEvent event) {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay mascotas");
            return;
        }
        listaMascotas.forEach(System.out::println);
    }

    private void listarDuenos(ActionEvent event) {
        if (listaDuenos.isEmpty()) {
            System.out.println("No hay dueños");
            return;
        }
        listaDuenos.forEach(System.out::println);
    }
}
