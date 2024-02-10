package org.danielgallo84;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Semana {
    private List<String> dias;

    public Semana() {
        dias = new ArrayList<>();
    }
    public void crearDias() {
    dias.add("Lunes");
    dias.add("Martes");
    dias.add("Miércoles");
    dias.add("Jueves");
    dias.add("Viernes");
    dias.add("Sábado");
    dias.add("Domingo");
}
public List<String> obtenerDias() {
    return dias;
}
public int longitudDeLaLista() {
    return dias.size();
}
public void eliminarDia(String dia) {
    dias.remove(dia);
}
public String obtenerDia(int indice) {
    return dias.get(indice);
}
public boolean existeDia(String dia) {
    return dias.contains(dia);
}
public void ordenarDias() {
    Collections.sort(dias);
}
public void vaciarLista() {
    dias.clear();
}
}