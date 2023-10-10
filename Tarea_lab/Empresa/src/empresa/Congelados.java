/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
class Congelados extends Producto {
   protected double temperaturaCongelacion;
   protected String nombre;
   protected int id;

    public Congelados(int id, int fechaCaducidad, int numeroLote, double temperaturaCongelacion, String nombre) {
        super(fechaCaducidad, numeroLote);
        this.temperaturaCongelacion = temperaturaCongelacion;
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + id + "\nTemperatura de Congelación Recomendada: " + temperaturaCongelacion + "°C");
    }
}
