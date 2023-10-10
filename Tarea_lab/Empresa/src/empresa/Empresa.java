/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class Empresa  {
    public static void main(String[] args) {
        String[] opciones = { "Fresco", "Refrigerado", "Congelado" };
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione el tipo de producto:", "Selección de Producto", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (opcion == -1) {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún tipo de producto.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        List<Producto> listaProductos = new ArrayList<>();

        while (true) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del producto (0 para finalizar):"));
            if (id == 0) {
                break;
            }

            int lote = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de lote:"));
            int fechaCaducidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de caducidad:"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");

            switch (opcion) {
                case 0:
                    int fechaEnvasado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de envasado:"));
                    String paisOrigen = JOptionPane.showInputDialog("Ingrese el país de origen:");
                    Frescos productoFresco = new Frescos(id, fechaCaducidad, lote, fechaEnvasado, paisOrigen, nombre);
                    listaProductos.add(productoFresco);
                    break;
                case 1:
                    String codigoSupervision = JOptionPane.showInputDialog("Ingrese el código de supervisión:");
                    refrigerado productoRefrigerado = new refrigerado(id, fechaCaducidad, lote, codigoSupervision, nombre);
                    listaProductos.add(productoRefrigerado);
                    break;
                case 2:
                    double temperaturaCongelacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura de congelación recomendada (en °C):"));
                    Congelados productoCongelado = new Congelados(id, fechaCaducidad, lote, temperaturaCongelacion, nombre);
                    listaProductos.add(productoCongelado);
                    break;
            }
        }

        // Mostrar la lista de productos
        JOptionPane.showMessageDialog(null, "Lista de Productos Agregados:\n" + obtenerInformacionProductos(listaProductos));
    }

    public static String obtenerInformacionProductos(List<Producto> listaProductos) {
        StringBuilder info = new StringBuilder();
        for (Producto producto : listaProductos) {
            info.append("Tipo: ").append(producto.getClass().getSimpleName()).append("\n");
            info.append("Fecha de Caducidad: ").append(((Producto) producto).fechaCaducidad).append("\n");
            info.append("Número de Lote: ").append(((Producto) producto).numeroLote).append("\n");
            if (producto instanceof Frescos) {
                Frescos Frescos = (Frescos) producto;
                info.append("Fecha de Envasado: ").append(Frescos.fechaEnvasado).append("\n");
                info.append("País de Origen: ").append(Frescos.paisOrigen).append("\n");
            } else if (producto instanceof refrigerado) {
                refrigerado refrigerado = (refrigerado) producto;
                info.append("Código de Supervisión: ").append(refrigerado.codigoSupervision).append("\n");
            } else if (producto instanceof Congelados) {
                Congelados congelado = (Congelados) producto;
                info.append("Temperatura de Congelación Recomendada: ").append(congelado.temperaturaCongelacion).append("°C").append("\n");
            }
            info.append("\n");
        }
        return info.toString();
    }
}
