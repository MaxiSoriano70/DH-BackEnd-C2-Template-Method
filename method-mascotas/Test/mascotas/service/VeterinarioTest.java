package mascotas.service;

import mascotas.backend.model.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeterinarioTest {
    @Test
    @DisplayName("Se a colocado con exito la ANTIRRABICA la proxima dosis es en 365 dias")
    void colocarVacunaCanino(){
        Mascota perro1 = new Canino("Bobi", Especie.CANINO,"Labrado","Marrón",true,false,20.3,"Calle Falsa 123");
        Veterinario veterinario = new Veterinario();
        Vacuna vacunaAntirrabica = new Vacuna(TipoVacuna.ANTIRRABICA,"Bravecto");
        String respuestaObtenida = veterinario.ColocarVacuna(perro1,vacunaAntirrabica);
        String respuestaEsperada = "Se a colocado con exito la ANTIRRABICA la proxima dosis es en 365 dias";
        assertEquals(respuestaEsperada,respuestaObtenida);
    }

    @Test
    @DisplayName("Se a colocado con exito la DESPARACITARIA la proxima dosis es en 60 dias")
    void colocarVacunaFeliino(){
        Mascota gato1 = new Felino("Cloe", Especie.FELINO,"Persa","Rubio",false,true,3.3,"Calle Falsa 321");
        Veterinario veterinario = new Veterinario();
        Vacuna vacunaAntirrabica = new Vacuna(TipoVacuna.DESPARACITARIA,"Bravecto");
        String respuestaObtenida = veterinario.ColocarVacuna(gato1,vacunaAntirrabica);
        String respuestaEsperada = "Se a colocado con exito la DESPARACITARIA la proxima dosis es en 60 dias";
        assertEquals(respuestaEsperada,respuestaObtenida);
    }
}