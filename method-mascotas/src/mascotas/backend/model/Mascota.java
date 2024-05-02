package mascotas.backend.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Mascota {
    private String nombre;
    private Especie especie;
    private String raza;
    private String color;
    private boolean sexo;
    private boolean esterilizado;
    private double peso;
    private String domicilio;
    private ArrayList<Vacuna> vacunasAntirrabicas;
    private ArrayList<Vacuna> vacunasDesparacitarias;

    public Mascota(String nombre, Especie especie, String raza, String color, boolean sexo, boolean esterilizado, double peso, String domicilio) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
        this.esterilizado = esterilizado;
        this.peso = peso;
        this.domicilio = domicilio;
        this.vacunasAntirrabicas = new ArrayList<>();
        this.vacunasDesparacitarias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ArrayList<Vacuna> getVacunasAntirrabicas() {
        return vacunasAntirrabicas;
    }

    public void setVacunasAntirrabicas(ArrayList<Vacuna> vacunasAntirrabicas) {
        this.vacunasAntirrabicas = vacunasAntirrabicas;
    }

    public ArrayList<Vacuna> getVacunasDesparacitarias() {
        return vacunasDesparacitarias;
    }

    public void setVacunasDesparacitarias(ArrayList<Vacuna> vacunasDesparacitarias) {
        this.vacunasDesparacitarias = vacunasDesparacitarias;
    }

    public abstract String colocarVacunaAntirrabica(Vacuna vacuna);

    public abstract String colocarVacunaDesparacitaria(Vacuna vacuna);
}
