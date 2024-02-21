package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        List<Productos> listaProductos = new ArrayList<>();
        List<ProductosPerecederos> listaProductosPerecedero = new ArrayList<>();
        Productos producto1 = new Productos("Atun", "Enlatado", 12, 50);
        ProductosPerecederos producto2 = new ProductosPerecederos("Leche","Deslactosada",8,100,"12/08/2025");
        Scanner lector = new Scanner(System.in);
        listaProductos.add(producto1);
        listaProductosPerecedero.add(producto2);

        int option;

        do {
            System.out.println("Seleccione opcion deseada \n1. Agregar Producto: \n2. Modificar Producto: \n3. Eliminar Producto: \n4. Salir y ver lista de productos:");
            option = lector.nextInt();
            switch (option){
                case 1:
                    System.out.println("Quiere agregar un producto: \n1. Pruducto no perecedero: \n2. Producto perecedero");
                    int producto = lector.nextInt();
                    if (producto==1){
                        System.out.println("Ingrese nombre del producto");
                        String x = lector.next();
                        System.out.println("Ingrese descripcion del producto");
                        String a = lector.next();
                        System.out.println("Ingrese precio del producto");
                        int b = lector.nextInt();
                        System.out.println("Ingrese Stock del producto");
                        int c = lector.nextInt();
                        Productos producto3 = new Productos(x,a,b,c);
                        listaProductos.add(producto3);
                    }else{
                        System.out.println("Ingrese nombre del producto");
                        String x = lector.next();
                        System.out.println("Ingrese descripcion del producto");
                        String a = lector.next();
                        System.out.println("Ingrese precio del producto");
                        int b = lector.nextInt();
                        System.out.println("Ingrese Stock del producto");
                        int c = lector.nextInt();
                        System.out.println("Ingrese Fecha de vencimiento");
                        String d = lector.next();
                        ProductosPerecederos producto3 = new ProductosPerecederos(x,a,b,c,d);
                        listaProductosPerecedero.add(producto3);
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto  que quiere editar");
                    String nombreEditar = lector.next();
                    boolean encontrado = true;
                    for (Productos productos : listaProductos){
                        if (productos.getNombre().equals(nombreEditar)){
                            System.out.println("Ingrese nombre del producto");
                            String x = lector.next();
                            productos.setNombre(x);
                            System.out.println("Ingrese descripcion del producto");
                            String a = lector.next();
                            productos.setDescripcion(a);
                            System.out.println("Ingrese precio del producto");
                            int b = lector.nextInt();
                            productos.setPrecio(b);
                            System.out.println("Ingrese Stock del producto");
                            int c = lector.nextInt();
                            productos.setStock(c);
                            encontrado = false;
                        } else{
                            for (ProductosPerecederos productosPerecederos : listaProductosPerecedero){
                                if (productosPerecederos.getNombre().equalsIgnoreCase(nombreEditar)){
                                    System.out.println("Ingrese nombre del producto");
                                    String x = lector.next();
                                    productosPerecederos.setNombre(x);
                                    System.out.println("Ingrese descripcion del producto");
                                    String a = lector.next();
                                    productosPerecederos.setDescripcion(a);
                                    System.out.println("Ingrese precio del producto");
                                    int b = lector.nextInt();
                                    productosPerecederos.setPrecio(b);
                                    System.out.println("Ingrese Stock del producto");
                                    int c = lector.nextInt();
                                    productosPerecederos.setStock(c);
                                    System.out.println("Ingrese Fecha de vencimiento");
                                    String d = lector.next();
                                    productosPerecederos.setFechaVencimiento(d);
                                    encontrado = false;
                                }

                            }
                        }
                    }
                    if (encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del producto  que quiere eliminar");
                    String nombreEliminar = lector.next();
                    encontrado = true;
                    for (Productos productos : listaProductos){
                        if (productos.getNombre().equals(nombreEliminar)){

                            encontrado = false;
                        } else{
                            for (ProductosPerecederos productosPerecederos : listaProductosPerecedero){
                                if (productosPerecederos.getNombre().equalsIgnoreCase(nombreEliminar)){
                                    listaProductosPerecedero.removeFirst();
                                    encontrado = false;
                                }
                            }
                        }
                    }
                    if (encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
            }
        }while (option!=4);
        System.out.println("Lista de productos:");
        for (Productos producto : listaProductos) {
            System.out.println(producto.toString());
        }
        System.out.println("Lista de productos perecederos:");
        for (Productos producto : listaProductosPerecedero) {
            System.out.println(producto.toString());
        }

    }
}
