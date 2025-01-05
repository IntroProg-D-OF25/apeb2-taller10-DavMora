
import java.util.Scanner;

/***
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
 * El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.

Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 * @author Dava
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        String[][] productos = new String[10][4]; 
        Scanner teclado = new Scanner(System.in);
        int opcion;

  
        productos[0] = new String[]{"Camisa", "20", "10", "001"};
        productos[1] = new String[]{"Pantalon", "30", "15", "002"};
        productos[2] = new String[]{"Zapatos", "50", "5", "003"};
        productos[3] = new String[]{"Sombrero", "15", "20", "004"};
        productos[4] = new String[]{"Bufanda", "10", "12", "005"};

        while (true) {
            System.out.println("1. Ver inventario");
            System.out.println("2. Facturar producto");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            if (opcion == 1) {
                System.out.println("Inventario:");
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][0] != null) {
                        System.out.println("Codigo: " + productos[i][3] + ", Nombre: " + productos[i][0] + ", Precio: " + productos[i][1] + ", Cantidad: " + productos[i][2]);
                    }
                }
            } else if (opcion == 2) {
                System.out.print("Introduce el codigo del producto a facturar: ");
                String codigoProducto = teclado.nextLine();
                boolean encontrado = false;
                int productoIndex = -1;
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][3] != null && productos[i][3].equals(codigoProducto)) {
                        productoIndex = i;
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    System.out.print("Introduce las unidades a comprar: ");
                    String unidadesStr = teclado.nextLine();
                    String cantidadDisponibleStr = productos[productoIndex][2];
                    int cantidadDisponible = 0;
                    int unidades = 0;

                
                    for (int i = 0; i < cantidadDisponibleStr.length(); i++) {
                        cantidadDisponible = cantidadDisponible * 10 + (cantidadDisponibleStr.charAt(i) - '0');
                    }

                    for (int i = 0; i < unidadesStr.length(); i++) {
                        unidades = unidades * 10 + (unidadesStr.charAt(i) - '0');
                    }

                    if (unidades > cantidadDisponible) {
                        System.out.println(" No hay suficientes existencias");
                    } else {
                        String precioUnitarioStr = productos[productoIndex][1];
                        int precioUnitario = 0;

                       
                        for (int i = 0; i < precioUnitarioStr.length(); i++) {
                            precioUnitario = precioUnitario * 10 + (precioUnitarioStr.charAt(i) - '0');
                        }

                        int subtotal = precioUnitario * unidades;
                        int iva = (subtotal * 15) / 100; 
                        int total = subtotal + iva;

                        if (total > 100) { 
                            int descuento = (total * 10) / 100; 
                            total -= descuento;
                            System.out.println("Descuento aplicado ");
                        }

                        System.out.println("Factura:");
                        System.out.println("Producto: " + productos[productoIndex][0]);
                        System.out.println("Precio unitario: " + precioUnitario);
                        System.out.println("Unidades: " + unidades);
                        System.out.println("Subtotal: " + subtotal);
                        System.out.println("IVA (15%): " + iva);
                        System.out.println("Total: " + total);

                       
                        cantidadDisponible -= unidades;
                        productos[productoIndex][2] = String.valueOf(cantidadDisponible);
                    }
                } else {
                    System.out.println("Producto no encontrado");
                }
            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Opcion invalida");
            }
        }

    }
}

/***
 * 1. Ver inventario
2. Facturar producto
3. Salir
Elige una opcion: 1
Inventario:
Codigo: 001, Nombre: Camisa, Precio: 20, Cantidad: 10
Codigo: 002, Nombre: Pantalon, Precio: 30, Cantidad: 15
Codigo: 003, Nombre: Zapatos, Precio: 50, Cantidad: 5
Codigo: 004, Nombre: Sombrero, Precio: 15, Cantidad: 20
Codigo: 005, Nombre: Bufanda, Precio: 10, Cantidad: 12
1. Ver inventario
2. Facturar producto
3. Salir
Elige una opcion: 2
Introduce el codigo del producto a facturar: 003
Introduce las unidades a comprar: 5
Descuento aplicado 
Factura:
Producto: Zapatos
Precio unitario: 50
Unidades: 5
Subtotal: 250
IVA (15%): 37
Total: 259
1. Ver inventario
2. Facturar producto
3. Salir
Elige una opcion: 3
 */
