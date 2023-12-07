import Info_Producto.Producto;

import java.util.Scanner;

public class MyMain {

    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Hola holita mundo");

        Producto producto0 = new Producto();
        System.out.println(producto0.getPrecio());

        Producto producto1 = new Producto("01","producto1",20);

        Producto producto2 = new Producto("01","producto2",20);

        System.out.println("El producto de código " + producto1.getCodigo() + " y nombre " + producto1.getNombre() + " tiene un precio de " + producto1.getPrecio() + " euros.");

        System.out.println("El producto de código " + producto2.getCodigo() + " y nombre " + producto2.getNombre() + " tiene un precio de " + producto2.getPrecio() + " euros.");

        System.out.print("Ingrese el código del producto : ");
        String codigoProducto3 = scan.next();

        System.out.print("Ingrese el nombre del producto : ");
        String nombrePorducto3 = scan.next();

        System.out.print("Ingrese el precio del producto : ");
        float precioProducto3 = scan.nextFloat();

        Producto producto3 = new Producto(codigoProducto3, nombrePorducto3, precioProducto3);

        System.out.println("El producto de código " + producto3.getCodigo() + " y nombre " + producto3.getNombre() + " tiene un precio de " + producto3.getPrecio() + " euros.");

    }

}
