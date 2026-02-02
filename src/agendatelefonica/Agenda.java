package agendatelefonica;

public class Agenda {
    private Contacto[] contactos = new Contacto [10];

    //busca el primer espacio vacio y guarda el contacto

    public void registrarContacto(Contacto c) {
        for (int i =0; i< contactos.length; i++) {
            if (contactos[i] == null) {
                contactos[i] = c;
                System.out.println("Contacto" + c.getNombre() + " registrado con exito");
                return;
            }
        }
            System.out.println("La agenda esta llena");
        }
        //recorre la lista y muestra los que no son nulos
        public void listarContactos() {
            System.out.println("----LISTA CONTACTOS----");
            for (Contacto c : contactos) {
                if(c!= null){
                    System.out.println("Nombre"+ c.getNombre() + " |Tel: " + c.getNumero());

                }
            }
        }
        //compara nombres recibidos con los guardados

        public void buscarContacto(String nombreBuscado) {
        for (Contacto c: contactos) {
            if (c != null && c.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("El telefono de " + nombreBuscado + "es" + c.getNumero());
                return;
            }
        }
        System.out.println("contacto no encontrado");
        }
        //mestra si hay espacions disponibles
        public void disponibles() {
        int contador =0;
        for (Contacto c : contactos) {
            if (c == null) contador++;
        }
        System.out.println("Espacios disponibles para registrar " + contador);

        }
}
