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
class Frescos extends Producto {
    int fechaEnvasado;
    protected String paisOrigen;
    protected String nombre;
    protected int id;

    public Frescos(int id, int fechaCaducidad, int numeroLote, int fechaEnvasado, String paisOrigen, String nombre) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + id + "\nFecha de Envasado: " + fechaEnvasado + "\nPaís de Origen: " + paisOrigen);
    }
}
