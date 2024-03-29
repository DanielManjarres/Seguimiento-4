package ejercicio4;

public class ProductosPerecederos extends Productos {
    private String fechaVencimiento;

    public ProductosPerecederos(String nombre, String descripcion, int precio, int stock,int id, String fechaVencimiento) {
        super(nombre,descripcion,precio, stock,id);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return  super.toString()+ ", fechaVencimiento= " + fechaVencimiento ;
    }
}
