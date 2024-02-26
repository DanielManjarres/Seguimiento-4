package ejercicio4;

public class Productos {
    private String nombre;
    private String descripcion;
    private int precio;
    private int stock;
    private int id;

    public Productos(String nombre, String descripcion, int precio, int stock, int id) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombre() {

        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {

        return precio;
    }

    public int getStock() {

        return stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Productos " +
                "nombre= " + nombre + '\'' +
                ", descripcion= " + descripcion + '\'' +
                ", precio= " + precio +
                ", stock= " + stock +
                ", id=" + id;
    }
}

