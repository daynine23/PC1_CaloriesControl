/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01_caloriescontrol.models;

/**
 *
 * @author USUARIO
 */
public class Alimento {
    
    private String nombreAlimento;
    private int gramos;
    private int calorias;
    private int tipoComida;
    
    
    public String toString()
    {
        //nombre, caloriasDesayuno, caloriasAlmuerzo, caloriasCena, totalCalorias, estadoConsumo,recomendación

        return getNombreAlimento()+ "," + getGramos()+  "," +
                getCalorias();
    }
    

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public int getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(int tipoComida) {
        this.tipoComida = tipoComida;
    }
    
    
    
    
}
