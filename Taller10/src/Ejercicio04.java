
import java.util.Scanner;

/**
 * *
 * Crea un programa que gestione el inventario de una tienda. Utiliza una matriz
 * bidimensional para almacenar los productos disponibles en la tienda, con
 * información como nombre, precio y cantidad. El programa debe permitir agregar
 * nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 *
 * @author Dava
 */
public class Ejercicio04 {

    public static void main(String[] args) {
        String[][] productos = new String[10][3];
        Scanner teclado = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Ver inventario");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 
            if (opcion == 1) {
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][0] == null) {
                        System.out.print("Nombre del producto: ");
                        productos[i][0] = teclado.nextLine();
                        System.out.print("Precio del producto: ");
                        productos[i][1] = teclado.nextLine();
                        System.out.print("Cantidad disponible: ");
                        productos[i][2] = teclado.nextLine();
                        break;
                    }
                }
            } else if (opcion == 2) {
                System.out.print("Introduce el nombre del producto a actualizar: ");
                String nombreActualizar = teclado.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][0] != null && productos[i][0].equals(nombreActualizar)) {
                        System.out.print("Nueva cantidad disponible: ");
                        productos[i][2] = teclado.nextLine();
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 3) {
                System.out.print("Introduce el nombre del producto a buscar: ");
                String nombreBuscar = teclado.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][0] != null && productos[i][0].equals(nombreBuscar)) {
                        System.out.println("Producto encontrado: ");
                        System.out.println("Nombre: " + productos[i][0]);
                        System.out.println("Precio: " + productos[i][1]);
                        System.out.println("Cantidad: " + productos[i][2]);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 4) {
                System.out.print("Introduce el nombre del producto a eliminar: ");
                String nombreEliminar = teclado.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][0] != null && productos[i][0].equals(nombreEliminar)) {
                        productos[i][0] = null;
                        productos[i][1] = null;
                        productos[i][2] = null;
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else if (opcion == 5) {
                System.out.println("Inventario:");
                for (int i = 0; i < productos.length; i++) {
                    if (productos[i][0] != null) {
                        System.out.println("Nombre: " + productos[i][0] + ", Precio: " + productos[i][1] + ", Cantidad: " + productos[i][2]);
                    }
                }
            } else if (opcion == 6) {
                break;
            } else {
                System.out.println("Opcion invalida.");
            }
        }

    }
}

/***
 * 
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Ver inventario
6. Salir
Elige una opcion: 1
Nombre del producto: Cola
Precio del producto: 3
Cantidad disponible: 6
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Ver inventario
6. Salir
Elige una opcion: 5
Inventario:
Nombre: Cola, Precio: 3, Cantidad: 6
1. Agregar producto
2. Actualizar existencias
3. Buscar producto
4. Eliminar producto
5. Ver inventario
6. Salir
Elige una opcion: 6
 */