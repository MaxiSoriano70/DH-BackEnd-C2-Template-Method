package mascotas.service;

import mascotas.backend.model.*;

public class Veterinario {
    public String ColocarVacuna(Mascota mascota, Vacuna vacuna){
        String msj = null;
        if(mascota instanceof Canino mascotaCanino){
            if (vacuna.getTipoVacuna() == TipoVacuna.DESPARACITARIA){
                msj = mascotaCanino.colocarVacunaDesparacitaria(vacuna);
            } else if (vacuna.getTipoVacuna() == TipoVacuna.ANTIRRABICA) {
                msj = mascotaCanino.colocarVacunaAntirrabica(vacuna);
            }
            else {
                msj = mascotaCanino.colocarVacunaCanino(vacuna);
            }
        }

        if(mascota instanceof Felino mascotaFelino){
            if (vacuna.getTipoVacuna() == TipoVacuna.DESPARACITARIA){
                msj = mascotaFelino.colocarVacunaDesparacitaria(vacuna);
            } else if (vacuna.getTipoVacuna() == TipoVacuna.ANTIRRABICA) {
                msj = mascotaFelino.colocarVacunaAntirrabica(vacuna);
            }
            else {
                msj = mascotaFelino.colocarVacunaFelino(vacuna);
            }
        }
        return msj;
    }
}
