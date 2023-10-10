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
public class Producto 
{
    protected int fechaCaducidad;
    protected int numeroLote;

    public Producto(int fechaCaducidad, int numeroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Fecha de Caducidad: " + fechaCaducidad + "\nNúmero de Lote: " + numeroLote);
    }
}
