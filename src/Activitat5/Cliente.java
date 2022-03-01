package Activitat5;
import java.util.ArrayList;

public class Cliente {
    private Fecha fecha;
    private String email;
    private String nombre;
    private String apellidos;
    private String dni;
    private ArrayList<Compra> compras;
    private double totalGastado;

    public Cliente(Fecha fecha, String email, String nombre, String apellidos, String dni) {
        this.fecha = fecha;
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.compras = new ArrayList<>();
    }
    public void addCompra(Compra compra){
        if (!this.compras.contains(compra)) {
            this.compras.add(compra);
        }
    }

    public double getTotalGastado() {
        double precio = 0;
        for (int i = 0; i < compras.size() ; i++) {
             precio = precio + this.compras.get(i).getPrecio();
        }
        totalGastado = totalGastado + precio;
        return precio;
    }

    @Override
    public String toString() {
        return "Cliente: "+nombre+" "+apellidos+" | Compras("+compras.size()+"): "+compras + " - Total gastado: "+ getTotalGastado()+" euros";
    }

}
