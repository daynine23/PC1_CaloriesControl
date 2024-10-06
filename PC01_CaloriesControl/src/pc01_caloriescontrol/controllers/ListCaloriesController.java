/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01_caloriescontrol.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import pc01_caloriescontrol.models.Alimento;
import pc01_caloriescontrol.models.UsuarioCalorias;
import pc01_caloriescontrol.models.UsuarioCaloriasModel;

/**
 *
 * @author USUARIO
 */
public class ListCaloriesController {
    
    
    public UsuarioCalorias cargarCalorias(){
        
        List<String> fileList = new ArrayList<>();
        UsuarioCaloriasModel ucModel = new UsuarioCaloriasModel();
        UsuarioCalorias uc = new UsuarioCalorias();
        fileList = ucModel.listCalories(); //MODEL
        
        for(int i=0; i < fileList.size(); i++){
                String txtLine = fileList.get(i);
                String[] parts = new String[0];
                parts = txtLine.split(",");
                
                String part1 = parts[0];
                String part2 = parts[1];
                String part3 = parts[2];
                String part4 = parts[3];
                String part5 = parts[4];
                String part6 = parts[5];
                String part7 = parts[6];
                
                uc.setNombre(part1);
                uc.setCaloriasDesayuno(Integer.parseInt(part2));
                uc.setCaloriasAlmuerzo(Integer.parseInt(part3));
                uc.setCaloriasCena(Integer.parseInt(part4));
                uc.setTotalCalorias(Integer.parseInt(part5));
                uc.setEstadoConsumo(part6);
                uc.setRecomendacion(part7);
            }
        
        return uc;
    }
    
    
    public List<Alimento> cargarAlimentos(){
        List<String> fileList = new ArrayList<>();
        List<Alimento> al = new ArrayList<>();
        
        UsuarioCaloriasModel ucModel = new UsuarioCaloriasModel();
        fileList = ucModel.listFoods(); //MODEL
        
        for(int i=0; i < fileList.size(); i++){
                String txtLine = fileList.get(i);
                String[] parts = new String[0];
                parts = txtLine.split(",");
                
                String part1 = parts[0];
                String part2 = parts[1];
                String part3 = parts[2];
                String part4 = parts[3];
                
                Alimento a = new Alimento();
                a.setNombreAlimento(part2);
                a.setGramos(Integer.parseInt(part3));
                a.setCalorias(Integer.parseInt(part4));
                al.add(a);
            }
        
        return al;
    }
    
}
