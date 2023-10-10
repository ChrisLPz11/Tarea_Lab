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
class refrigerado extends Producto {
    protected String codigoSupervision;
    protected String nombre;
    protected int id;

    public refrigerado(int id, int fechaCaducidad, int numeroLote, String codigoSupervision, String nombre) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.nombre = nombre;
        this.id = id;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nID: " + id + "\nCódigo de Supervisión: " + codigoSupervision);
    }
}

