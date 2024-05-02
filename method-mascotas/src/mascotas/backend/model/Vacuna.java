package mascotas.backend.model;

public class Vacuna {
    private TipoVacuna tipoVacuna;
    private String marca;

    public Vacuna(TipoVacuna tipoVacuna, String marca) {
        this.tipoVacuna = tipoVacuna;
        this.marca = marca;
    }

    public TipoVacuna getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(TipoVacuna tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
