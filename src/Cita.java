
import java.util.ArrayList;
import java.util.List;

public class Cita {
    private String id;
    private String clienteId;
    private String fechaHora;
    private String servicio;
    private String estilista;

    // Constructor, getters y setters
    // ...

    @Override
    public String toString() {
        return "Cita{" +
                "id='" + id + '\'' +
                ", clienteId='" + clienteId + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", servicio='" + servicio + '\'' +
                ", estilista='" + estilista + '\'' +
                '}';
    }
}

public class CitaDAO {
    private List<Cita> citas;

    public CitaDAO() {
        citas = new ArrayList<>();
        // Aquí podrías cargar los datos de la base de datos en la lista al iniciar el DAO
    }

    public void crearCita(Cita cita) {
        // Implementar lógica para insertar una nueva cita en la base de datos
        citas.add(cita);
    }

    public Cita obtenerCita(String id) {
        // Implementar lógica para obtener una cita de la base de datos por su ID
        for (Cita cita : citas) {
            if (cita.getId().equals(id)) {
                return cita;
            }
        }
        return null;
    }

    public List<Cita> obtenerTodasCitas() {
        // Implementar lógica para obtener todas las citas de la base de datos
        return citas;
    }

    public void actualizarCita(Cita cita) {
        // Implementar lógica para actualizar una cita en la base de datos
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getId().equals(cita.getId())) {
                citas.set(i, cita);
                break;
            }
        }
    }

    public void eliminarCita(String id) {
        // Implementar lógica para eliminar una cita de la base de datos por su ID
        citas.removeIf(cita -> cita.getId().equals(id));
    }
}
