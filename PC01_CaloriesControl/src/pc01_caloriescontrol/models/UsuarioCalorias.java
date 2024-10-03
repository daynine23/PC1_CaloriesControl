/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc01_caloriescontrol.models;

import java.util.List;

/**
 *
 * @author C2A601-03
 */
public class UsuarioCalorias {
    
    private String nombre;
    private int caloriasDesayuno;
    private int caloriasAlmuerzo;
    private int caloriasCena;
    private int totalCalorias;
    private String estadoConsumo;
    private String recomendacion;
    private List alimentosRegistradosLst;
    
    
    public String toStringCalories()
    {
        //nombre, caloriasDesayuno, caloriasAlmuerzo, caloriasCena, totalCalorias, estadoConsumo,recomendación

        return getNombre()+ "," + getCaloriasDesayuno()+  "," +
                getCaloriasAlmuerzo()+ "," + getCaloriasCena() + "," + getTotalCalorias()+
                "," + getEstadoConsumo() + "," + getRecomendacion();
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCaloriasDesayuno() {
        return caloriasDesayuno;
    }

    public void setCaloriasDesayuno(int caloriasDesayuno) {
        this.caloriasDesayuno = caloriasDesayuno;
    }

    public int getCaloriasAlmuerzo() {
        return caloriasAlmuerzo;
    }

    public void setCaloriasAlmuerzo(int caloriasAlmuerzo) {
        this.caloriasAlmuerzo = caloriasAlmuerzo;
    }

    public int getCaloriasCena() {
        return caloriasCena;
    }

    public void setCaloriasCena(int caloriasCena) {
        this.caloriasCena = caloriasCena;
    }

    public int getTotalCalorias() {
        return totalCalorias;
    }

    public void setTotalCalorias(int totalCalorias) {
        this.totalCalorias = totalCalorias;
    }

    public String getEstadoConsumo() {
        return estadoConsumo;
    }

    public void setEstadoConsumo(String estadoConsumo) {
        this.estadoConsumo = estadoConsumo;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    public List getAlimentosRegistradosLst() {
        return alimentosRegistradosLst;
    }

    public void setAlimentosRegistradosLst(List alimentosRegistradosLst) {
        this.alimentosRegistradosLst = alimentosRegistradosLst;
    }
    
    
    
    
}
