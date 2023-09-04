import com.iesam.laliga2023.domain.Equipo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Equipo equipo1 = new Equipo(1,"Equipo FC","663 554 215","Al lado del vecino");
        System.out.println("El codigo del equipo es: "+equipo1.getCodigo());
        System.out.println("El Nombre del equipo es: "+equipo1.getNombre());
        System.out.println("El Telefono del equipo es: "+equipo1.getTelefono());
        System.out.println("LA Direccion del equipo es: "+equipo1.getDireccion());
    Equipo equipo2 = new Equipo(0,"","","");
    equipo2.setCodigo(2);
    equipo2.setNombre("MiEquipo2");
    equipo2.setTelefono("658 255 687");
    equipo2.setDireccion("La otra esquina");
    }
}