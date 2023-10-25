import java.util.ArrayList;
import java.util.List;

public class Contactos {
    private List<Contacto> listaContactos;

    public Contactos() {
        listaContactos = new ArrayList<>();
    }

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
}
