package mascotas.backend.model;

import java.util.ArrayList;
import java.util.List;

public class Canino extends Mascota{
    private ArrayList<Vacuna> vacunasCaninos;

    public Canino(String nombre, Especie especie, String raza, String color, boolean sexo, boolean esterilizado, double peso, String domicilio) {
        super(nombre, especie, raza, color, sexo, esterilizado, peso, domicilio);
        this.vacunasCaninos = new ArrayList<>();
    }

    public String colocarVacunaCanino(Vacuna vacuna) {
        return "Se a colocado con exito la "+ vacuna.getTipoVacuna() + " la proxima dosis es en 60 dias";
    }

    @Override
    public String colocarVacunaAntirrabica(Vacuna vacuna) {
        return  "Se a colocado con exito la "+ vacuna.getTipoVacuna() + " la proxima dosis es en 365 dias";
    }

    @Override
    public String colocarVacunaDesparacitaria(Vacuna vacuna) {
        return "Se a colocado con exito la "+ vacuna.getTipoVacuna() + " la proxima dosis es en 60 dias";
    }
}
