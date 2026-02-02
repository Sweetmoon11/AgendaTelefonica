package agendatelefonica;

public class Contacto {
    private String nombre;
    private String numero;

    //constructor

    public Contacto (String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //getters y setters

    public String getNombre() {return nombre;}
    public void setNombre(String Nombre) {this.nombre = nombre;}

    public String getNumero() {return numero;}
    public void setNumero (String numero) {this.numero = numero; }

}
