import java.util.ArrayList;
import java.util.List;

public class Pago {
    private String id;
    private String citaId;
    private double monto;
    private String metodoPago;

    // Constructor, getters y setters
    // ...

    @Override
    public String toString() {
        return "Pago{" +
                "id='" + id + '\'' +
                ", citaId='" + citaId + '\'' +
                ", monto=" + monto +
                ", metodoPago='" + metodoPago + '\'' +
                '}';
    }
}

public class PagoDAO {
    private List<Pago> pagos;

    public PagoDAO() {
        pagos = new ArrayList<>();
        // Aquí podrías cargar los datos de la base de datos en la lista al iniciar el DAO
    }

    public void crearPago(Pago pago) {
        // Implementar lógica para insertar un nuevo pago en la base de datos
        pagos.add(pago);
    }

    public Pago obtenerPago(String id) {
        // Implementar lógica para obtener un pago de la base de datos por su ID
        for (Pago pago : pagos) {
            if (pago.getId().equals(id)) {
                return pago;
            }
        }
        return null;
    }

    public List<Pago> obtenerTodosPagos() {
        // Implementar lógica para obtener todos los pagos de la base de datos
        return pagos;
    }

    public void actualizarPago(Pago pago) {
        // Implementar lógica para actualizar un pago en la base de datos
        for (int i = 0; i < pagos.size(); i++) {
            if (pagos.get(i).getId().equals(pago.getId())) {
                pagos.set(i, pago);
                break;
            }
        }
    }

    public void eliminarPago(String id) {
        // Implementar lógica para eliminar un pago de la base de datos por su ID
        pagos.removeIf(pago -> pago.getId().equals(id));
    }
}
