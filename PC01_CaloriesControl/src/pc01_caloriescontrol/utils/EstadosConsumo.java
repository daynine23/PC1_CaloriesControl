/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01_caloriescontrol.utils;

/**
 *
 * @author USUARIO
 */
public enum EstadosConsumo {
    BAJO_CONSUMO("Bajo Consumo"),
    CONSUMO_ADECUADO("Consumo Adecuado"),
    EXCESO_CALORIAS("Exceso de Calorías");

    private final String nombreEstado;

    // Constructor para asignar el nombreEstado
    EstadosConsumo(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }

    @Override
    public String toString() {
        return nombreEstado;
    }
}
