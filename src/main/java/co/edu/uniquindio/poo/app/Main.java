package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.Veterinaria;
import co.edu.uniquindio.poo.model.Mascota;
import co.edu.uniquindio.poo.model.Dueno;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Veterinaria vet = new Veterinaria("Mi Veterinaria", "12345");
        int opcion;

        do {
            String menu = """
                    ===== MENÚ VETERINARIA =====
                    1. Registrar Mascota
                    2. Listar Mascotas
                    3. Buscar Mascota
                    4. Actualizar Mascota
                    5. Eliminar Mascota
                    6. Registrar Dueño
                    7. Listar Dueños
                    8. Buscar Dueño
                    9. Actualizar Dueño
                    10. Eliminar Dueño
                    11. Calcular costo de consulta
                    0. Salir
                    """;

            String input = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                opcion = 0;
            } else {
                try {
                    opcion = Integer.parseInt(input.trim()); // 👈 trim() para evitar errores
                } catch (NumberFormatException e) {
                    opcion = -1;
                }
            }

            switch (opcion) {
                case 1 -> {
                    // ✅ Registrar Mascota (requiere dueño)
                    String idDueno = JOptionPane.showInputDialog("Ingrese el ID del dueño de la mascota:");
                    Dueno dueno = vet.obtenerDueno(idDueno);

                    if (dueno == null) {
                        JOptionPane.showMessageDialog(null, "Debe registrar primero al dueño con ese ID.");
                    } else {
                        String nombre = JOptionPane.showInputDialog("Nombre de la mascota:");
                        String especie = JOptionPane.showInputDialog("Especie:");
                        String raza = JOptionPane.showInputDialog("Raza:");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
                        String idMascota = JOptionPane.showInputDialog("ID de la mascota:");

                        boolean ok = vet.almacenarMascota(nombre, especie, raza, edad, idMascota, dueno);
                        JOptionPane.showMessageDialog(null, ok ? "Mascota registrada con éxito" : "Error: Ya existe una mascota con ese ID o no hay espacio.");
                    }
                }
                case 2 -> {
                    Mascota[] lista = vet.obtenerListaMascotas();
                    StringBuilder sb = new StringBuilder("Lista de Mascotas:\n");
                    for (Mascota m : lista) {
                        if (m != null) sb.append(m.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
                case 3 -> {
                    String id = JOptionPane.showInputDialog("ID de la mascota a buscar:");
                    Mascota m = vet.obtenerMascota(id);
                    JOptionPane.showMessageDialog(null, (m != null) ? m.toString() : "Mascota no encontrada.");
                }
                case 4 -> {
                    String id = JOptionPane.showInputDialog("ID de la mascota a actualizar:");
                    String nombre = JOptionPane.showInputDialog("Nuevo nombre:");
                    String especie = JOptionPane.showInputDialog("Nueva especie:");
                    String raza = JOptionPane.showInputDialog("Nueva raza:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Nueva edad:"));

                    boolean ok = vet.actualizarMascota(nombre, especie, raza, edad, id);
                    JOptionPane.showMessageDialog(null, ok ? "Mascota actualizada." : "No se encontró la mascota.");
                }
                case 5 -> {
                    String id = JOptionPane.showInputDialog("ID de la mascota a eliminar:");
                    boolean ok = vet.eliminarMascota(id);
                    JOptionPane.showMessageDialog(null, ok ? "Mascota eliminada." : "No se encontró la mascota.");
                }
                case 6 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre del dueño:");
                    String telefono = JOptionPane.showInputDialog("Teléfono:");
                    String direccion = JOptionPane.showInputDialog("Dirección:");
                    String id = JOptionPane.showInputDialog("ID del dueño:");

                    boolean ok = vet.agregarDueno(nombre, telefono, direccion, id);
                    JOptionPane.showMessageDialog(null, ok ? "Dueño registrado con éxito" : "Error: Ya existe un dueño con ese ID o no hay espacio.");
                }
                case 7 -> {
                    Dueno[] lista = vet.obtenerListaDuenos();
                    StringBuilder sb = new StringBuilder("Lista de Dueños:\n");
                    for (Dueno d : lista) {
                        if (d != null) sb.append(d.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
                case 8 -> {
                    String id = JOptionPane.showInputDialog("ID del dueño a buscar:");
                    Dueno d = vet.obtenerDueno(id);
                    JOptionPane.showMessageDialog(null, (d != null) ? d.toString() : "Dueño no encontrado.");
                }
                case 9 -> {
                    String id = JOptionPane.showInputDialog("ID del dueño a actualizar:");
                    String nombre = JOptionPane.showInputDialog("Nuevo nombre:");
                    String telefono = JOptionPane.showInputDialog("Nuevo teléfono:");
                    String direccion = JOptionPane.showInputDialog("Nueva dirección:");

                    boolean ok = vet.actualizarDueno(nombre, telefono, direccion, id);
                    JOptionPane.showMessageDialog(null, ok ? "Dueño actualizado." : "No se encontró el dueño.");
                }
                case 10 -> {
                    String id = JOptionPane.showInputDialog("ID del dueño a eliminar:");
                    boolean ok = vet.eliminarDueno(id);
                    JOptionPane.showMessageDialog(null, ok ? "Dueño eliminado." : "No se encontró el dueño.");
                }
                case 11 -> {
                    String idMascota = JOptionPane.showInputDialog("Ingrese el ID de la mascota para calcular el costo de consulta:");
                    Mascota mascota = vet.obtenerMascota(idMascota);

                    if (mascota == null) {
                        JOptionPane.showMessageDialog(null, "Mascota no encontrada. Verifique el ID.");
                    } else {
                        double costo = vet.calcularCostoConsulta(mascota);
                        JOptionPane.showMessageDialog(null, "El costo de la consulta para " + mascota.getNombre() + " es: $" + costo);
                    }
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }
}
