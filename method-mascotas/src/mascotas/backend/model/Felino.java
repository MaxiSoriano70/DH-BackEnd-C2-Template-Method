package mascotas.backend.model;

import java.util.ArrayList;

public class Felino extends Mascota{
    private ArrayList<Vacuna> vacunasFelinos;

    public Felino(String nombre, Especie especie, String raza, String color, boolean sexo, boolean esterilizado, double peso, String domicilio) {
        super(nombre, especie, raza, color, sexo, esterilizado, peso, domicilio);
        this.vacunasFelinos = new ArrayList<>();
    }
    public String colocarVacunaFelino(Vacuna vacuna) {
        return "Se a colocado con exito la "+ vacuna.getTipoVacuna() + " la proxima dosis es en 60 dias";
    }

    @Override
    public String colocarVacunaAntirrabica(Vacuna vacuna) {
        return "Se a colocado con exito la "+ vacuna.getTipoVacuna() + " la proxima dosis es en 365 dias";
    }

    @Override
    public String colocarVacunaDesparacitaria(Vacuna vacuna) {
        return  "Se a colocado con exito la "+ vacuna.getTipoVacuna() + " la proxima dosis es en 60 dias";
    }
}
