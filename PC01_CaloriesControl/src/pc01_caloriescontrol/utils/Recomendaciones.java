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
public enum Recomendaciones {
    REC_BAJO_CONSUMO("Sugerir aumentar la ingesta de proteínas y carbohidratos"),
    REC_CONSUMO_ADECUADO("Felicitar al usuario por mantener un balance adecuado"),
    REC_EXCESO_CALORIAS("Sugerir reducir el consumo de grasas o aumentar la actividad física");

    private final String recomenEstado;

    // Constructor para asignar el nombreEstado
    Recomendaciones(String recomenEstado) {
        this.recomenEstado = recomenEstado;
    }

    @Override
    public String toString() {
        return recomenEstado;
    }
}
