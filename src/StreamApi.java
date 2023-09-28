import java.util.ArrayList;
import java.util.List;

public class StreamApi {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        Empleado oscar = new Empleado("Oscar Blacarte", "Systems");
        Empleado liliana = new Empleado("Liliana Castro", "Systems");
        Empleado fernanda = new Empleado("Fernanda Martinez", "Systems");
        Empleado manuel = new Empleado("manuel lopez", "RH");
        Empleado rebeta = new Empleado("Rebeca perez", "Systems");
        Empleado oscar2 = new Empleado("Oscar Blacarte", "Systems");
        empleados.add(oscar);
        empleados.add(liliana);
        empleados.add(fernanda);
        empleados.add(manuel);
        empleados.add(rebeta);
        empleados.add(oscar2);

        empleados.stream()
                .filter( empleado ->   empleado.getDepartamento().equals("Systems") )
                .sorted( (empleado1, empleados2) -> empleado1.getNombre().compareToIgnoreCase(empleados2.getNombre()))
                .distinct()
                .forEach( empleado -> System.out.println(empleado));
    }
}
