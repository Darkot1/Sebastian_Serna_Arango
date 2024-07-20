public class menu {

    public void menuPrincipal() {
        System.out.println("1: Gestion de inventario.");
        System.out.println("2: Registro de empleados.");
        System.out.println("3: Gestion de cursos.");
        System.out.println("4: Salir.");
        System.out.println("Seleccione un punto del taller: ");
    }

    public void menuInventario() {

        System.out.println("MENU INVENTARIO");
        System.out.println("1: Agregar producto.");
        System.out.println("2: Eliminar producto.");
        System.out.println("3: Buscar producto por nombre.");
        System.out.println("4: Buscar producto por categoría.");
        System.out.println("5: Mostrar todos los productos.");
        System.out.println("6: Volver al menu principal.");
        System.out.println("Seleccione una opcion del menú de inventario: ");
    }

    public void menuEmpleado() {
        System.out.println("MENU GESTION DE EMPLEADOS");
        System.out.println("1: Agregar Empleado.");
        System.out.println("2: Ver empleados.");
        System.out.println("3: Volver al menu principal.");
        System.out.println("Seleccione una opcion del menu de empleados: ");
    }

}
