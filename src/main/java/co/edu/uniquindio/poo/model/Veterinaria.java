package co.edu.uniquindio.poo.model;


import java.time.LocalDate;

public class Veterinaria {

    private String nombre;
    private String nit;
    Mascota [] listMascotas;
    Gato [] listGatos;
    Perro[] listPerros;
    Ave[] listAves;
    Reptil[] listReptiles;
    Dueno [] listDuenos;
    Consulta [] listConsulta;

    public Veterinaria(String nombre,String nit){
        this.nombre = nombre;
        this.nit = nit;
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


    public boolean almacenarGato(String nombre,Especie especie,String raza,Edad edad,double pesoKg,String id,Dueno dueno ){

        Gato nuevoGato =
                new Gato(nombre,especie,raza,edad,pesoKg,id,dueno);

        for(int i = 0; i < listGatos.length; i ++){
            if(listGatos[i] != null && listGatos[i].getId().equals(id)){
                return false;
            }
        }
        for(int i = 0; i < listGatos.length; i ++){
            if(listGatos[i] == null ){
                listGatos[i] = nuevoGato;
                return true;
            }
        }
        return false;
    }



    private int obtenerPosicionGato(String id){
        for(int i = 0; i < listGatos.length; i ++){
            if(listGatos[i] != null && listGatos[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public Gato obtenerGato(String id){
        int indexGato = obtenerPosicionGato(id);
        if(indexGato == -1) return null;

        return listGatos[indexGato];
    }



    public Gato [] obtenerListaGatos(){
        return listGatos;
    }



    public boolean actualizarGato(String nombre,String raza,double pesoKg,String id){
        int indexGato = obtenerPosicionGato(id);
        if(indexGato == -1) return false;

        Gato actualizarGato = listGatos[indexGato];
        actualizarGato.setNombre(nombre);
        actualizarGato.setRaza(raza);
        actualizarGato.setPesoKg(pesoKg);
        return true;
    }



    public boolean eliminarGato(String id){
        int indexGato = obtenerPosicionGato(id);
        if(indexGato == -1) return false;

        listGatos[indexGato] = null;
        return true;
    }





    public boolean almacenarPerro(String nombre,Especie especie,String raza,Edad edad,double pesoKg,String id,Dueno dueno ){

        Perro nuevoPerro =
                new Perro (nombre,especie,raza,edad,pesoKg,id,dueno);

        for(int i = 0; i < listPerros.length; i ++){
            if(listPerros[i] != null && listPerros[i].getId().equals(id)){
                return false;
            }
        }
        for(int i = 0; i < listPerros.length; i ++){
            if(listPerros[i] == null ){
                listPerros[i] = nuevoPerro;
                return true;
            }
        }
        return false;
    }



    private int obtenerPosicionPerro(String id){
        for(int i = 0; i < listPerros.length; i ++){
            if(listPerros[i] != null && listPerros[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public Perro obtenerPero(String id){
        int indexPerro = obtenerPosicionPerro(id);
        if(indexPerro == -1) return null;

        return listPerros[indexPerro];
    }



    public Perro [] obtenerListaPerros(){
        return listPerros;
    }



    public boolean actualizarPerro(String nombre,String raza,double pesoKg,String id){
        int indexPerro = obtenerPosicionPerro(id);
        if(indexPerro == -1) return false;

        Perro actualizarPerro = listPerros[indexPerro];
        actualizarPerro.setNombre(nombre);
        actualizarPerro.setRaza(raza);
        actualizarPerro.setPesoKg(pesoKg);
        return true;
    }



    public boolean eliminarPerro(String id){
        int indexPerro = obtenerPosicionPerro(id);
        if(indexPerro == -1) return false;

        listPerros[indexPerro] = null;
        return true;
    }





    public boolean almacenarAve(String nombre,Especie especie,String raza,Edad edad,double pesoKg,String id,Dueno dueno ){

        Ave nuevaAve =
                new Ave (nombre,especie,raza,edad,pesoKg,id,dueno);

        for(int i = 0; i < listAves.length; i ++){
            if(listAves[i] != null && listAves[i].getId().equals(id)){
                return false;
            }
        }
        for(int i = 0; i < listAves.length; i ++){
            if(listAves[i] == null ){
                listAves[i] = nuevaAve;
                return true;
            }
        }
        return false;
    }



    private int obtenerPosicionAve(String id){
        for(int i = 0; i < listAves.length; i ++){
            if(listAves[i] != null && listAves[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public Ave obtenerAve(String id){
        int indexAve = obtenerPosicionAve(id);
        if(indexAve == -1) return null;

        return listAves[indexAve];
    }



    public Ave [] obtenerListaAves(){
        return listAves;
    }



    public boolean actualizarAve(String nombre,String raza,double pesoKg,String id){
        int indexAve = obtenerPosicionAve(id);
        if(indexAve == -1) return false;

        Ave actualizarAve = listAves[indexAve];
        actualizarAve.setNombre(nombre);
        actualizarAve.setRaza(raza);
        actualizarAve.setPesoKg(pesoKg);
        return true;
    }



    public boolean eliminarAve(String id){
        int indexAve = obtenerPosicionAve(id);
        if(indexAve == -1) return false;

        listAves[indexAve] = null;
        return true;
    }



    public boolean almacenarReptil(String nombre,Especie especie,String raza,Edad edad,double pesoKg,String id,Dueno dueno ){

        Reptil nuevoReptil =
                new Reptil (nombre,especie,raza,edad,pesoKg,id,dueno);

        for(int i = 0; i < listReptiles.length; i ++){
            if(listReptiles[i] != null && listReptiles[i].getId().equals(id)){
                return false;
            }
        }
        for(int i = 0; i < listReptiles.length; i ++){
            if(listReptiles[i] == null ){
                listReptiles[i] = nuevoReptil;
                return true;
            }
        }
        return false;
    }



    private int obtenerPosicionReptil(String id){
        for(int i = 0; i < listReptiles.length; i ++){
            if(listReptiles[i] != null && listReptiles[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }


    public Reptil obtenerReptil(String id){
        int indexReptil = obtenerPosicionReptil(id);
        if(indexReptil == -1) return null;

        return listReptiles[indexReptil];
    }



    public Reptil [] obtenerListaReptiles(){
        return listReptiles;
    }



    public boolean actualizarReptil(String nombre,String raza,double pesoKg,String id){
        int indexReptil = obtenerPosicionReptil(id);
        if(indexReptil == -1) return false;

        Reptil actualizarReptil = listReptiles[indexReptil];
        actualizarReptil.setNombre(nombre);
        actualizarReptil.setRaza(raza);
        actualizarReptil.setPesoKg(pesoKg);
        return true;
    }



    public boolean eliminarReptil(String id){
        int indexReptil = obtenerPosicionReptil(id);
        if(indexReptil == -1) return false;

        listReptiles[indexReptil] = null;
        return true;
    }



    public boolean agregarDueno(String nombre,String telefono,String direccion,String id,int fidelidadClinica){
        Dueno nuevoDueno =
                new Dueno(nombre,telefono,direccion,id,fidelidadClinica);

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



    public boolean actualizarDueno(String nombre,String telefono,String direccion,String id,int fidelidadClinica){

        int indexDueno = obtenerPosicionDueno(id);
        if(indexDueno == -1) return false;

        Dueno actualizarDueno = listDuenos[indexDueno];

        actualizarDueno.setNombre(nombre);
        actualizarDueno.setTelefono(telefono);
        actualizarDueno.setDireccion(direccion);
        actualizarDueno.setFidelidadClinica(fidelidadClinica);
        return true;
    }


    public boolean eliminarDueno(String id){
        int indexDueno = obtenerPosicionDueno(id);

        if(indexDueno == -1) return false;

        listDuenos[indexDueno] = null;
        return true;
    }



    public double calcularCostoConsulta(Mascota mascota,Consulta Consulta) {
        double valorBase = 30000;
        double costoFinal = valorBase + mascota.getCostoExtraEspecie();

        if (mascota.getEdad() == Edad.CACHORRO) {
            costoFinal += 5000;
        } else if (mascota.getEdad() == Edad.ADULTO) {
            costoFinal += 8000;
        } else if (Consulta.getTipoConsulta() == TipoConsulta.CONSULTA_GENERAL) {
            costoFinal += 10000; // ejemplo de recargo
        } else if (Consulta.getTipoConsulta() == TipoConsulta.URGENCIA) {
            costoFinal += 20000;
        } else if (Consulta.getTipoConsulta() == TipoConsulta.CONTROL_RUTINARIO) {
            costoFinal += 8000;
        } else if (Consulta.getTipoConsulta() == TipoConsulta.VACUNACION) {
            costoFinal += 9000;
        }

        return costoFinal;
    }


    public Dueno[] obtenerDuenosFrecuentes() {
        Dueno[] duenosOrdenados = listDuenos.clone();

        for (int i = 0; i < duenosOrdenados.length - 1; i++) {
            for (int j = i + 1; j < duenosOrdenados.length; j++) {
                if (duenosOrdenados[i] != null && duenosOrdenados[j] != null) {
                    int visitasI = contarMascotasDeDueno(duenosOrdenados[i]);
                    int visitasJ = contarMascotasDeDueno(duenosOrdenados[j]);

                    if (visitasJ > visitasI) {
                        Dueno temp = duenosOrdenados[i];
                        duenosOrdenados[i] = duenosOrdenados[j];
                        duenosOrdenados[j] = temp;
                    }
                }
            }
        }
        return duenosOrdenados;
    }

    public int contarMascotasDeDueno(Dueno dueno) {
        int contador = 0;
        for (Mascota mascota : listMascotas) {
            if (mascota != null && mascota.getDueno() != null && mascota.getDueno().getId().equals(dueno.getId())) {
                contador++;
            }
        }
        return contador;
    }
    public int obtenerNumeroVisitas(Dueno dueno) {
        return contarMascotasDeDueno(dueno);
    }

    public Dueno obtenerDuenoMasFrecuente() {
        Dueno mejor = null;
        int maxVisitas = -1;

        for (Dueno dueno : listDuenos) {
            if (dueno != null) {
                int visitas = contarMascotasDeDueno(dueno);
                if (visitas > maxVisitas) {
                    maxVisitas = visitas;
                    mejor = dueno;
                }
            }
        }
        return mejor;
    }



    public double calcularDosis(Mascota mascota, double mgPorKg) {

        double peso = mascota.getPesoKg();
        double dosisTotal = peso * mgPorKg;
        return dosisTotal;
    }

    public LocalDate proximaVacunacion(Mascota mascota) {
        LocalDate fechaActual = LocalDate.now();
        int mesesProx;

        switch (mascota.getEspecie()) {
            case PERRO:
            case GATO:
                mesesProx = 12;
                break;
            case AVE:
                mesesProx = 8;
                break;
            case REPTIL:
                mesesProx = 18;
                break;
            default:
                mesesProx = 12;
        }

        return fechaActual.plusMonths(mesesProx);
    }
}







































