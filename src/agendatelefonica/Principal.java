package agendatelefonica;

public class Principal {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        // Crear algunos contactos
        Contacto c1 = new Contacto("Juan Perez", "3001234567");
        Contacto c2 = new Contacto("Maria Lopez", "3159876543");

        // 1. Registrar
        miAgenda.registrarContacto(c1);
        miAgenda.registrarContacto(c2);

        // 2. Disponibles
        miAgenda.disponibles();

        // 3. Listar
        miAgenda.listarContactos();

        // 4. Buscar
        miAgenda.buscarContacto("Maria Lopez");
    }
}