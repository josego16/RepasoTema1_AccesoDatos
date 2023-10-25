import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "lista_contactos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contactos {
    @XmlElement(name = "contacto")
    private List<Contacto> listaContactos;

    public Contactos() {
        listaContactos = new ArrayList<>();
    }

    public Contactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    @Override
    public String toString() {
        return "{" + "contactos: '" + getListaContactos() + "'";
    }

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
}
