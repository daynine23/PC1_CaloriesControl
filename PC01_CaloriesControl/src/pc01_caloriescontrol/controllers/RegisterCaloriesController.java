/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc01_caloriescontrol.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import pc01_caloriescontrol.models.Alimento;
import pc01_caloriescontrol.models.UsuarioCalorias;
import pc01_caloriescontrol.models.UsuarioCaloriasModel;
import pc01_caloriescontrol.utils.EstadosConsumo;
import pc01_caloriescontrol.utils.Recomendaciones;

/**
 *
 * @author USUARIO
 */
public class RegisterCaloriesController {
    
    private static final List<Alimento> listaAlimentos = new ArrayList<>();
    
    
    public void registerCaloriesControl(String userName){
        int dCalorias = 0;
        int aCalorias = 0;
        int cCalorias = 0;
        int totalCalorias = 0;
        
        System.out.println("La lista de alimentos esta vacia? : " + listaAlimentos.isEmpty());
        
        if(!listaAlimentos.isEmpty()){
            try {
                UsuarioCalorias uc = new UsuarioCalorias();
                for(Alimento a : listaAlimentos){
                    if(a.getTipoComida()==0){
                        dCalorias =+ a.getCalorias();
                    } else if(a.getTipoComida()==1){
                        aCalorias =+ a.getCalorias();
                    } else {
                        cCalorias =+ a.getCalorias();
                    }
                }
                uc.setNombre(userName);
                uc.setCaloriasDesayuno(dCalorias);
                uc.setCaloriasAlmuerzo(aCalorias);
                uc.setCaloriasCena(cCalorias);
                totalCalorias = dCalorias + aCalorias + cCalorias;
                uc.setTotalCalorias(totalCalorias);
                if(totalCalorias < 1500){
                    uc.setEstadoConsumo(EstadosConsumo.BAJO_CONSUMO.toString());
                    uc.setRecomendacion(Recomendaciones.REC_BAJO_CONSUMO.toString());
                } else if (totalCalorias > 1500 && totalCalorias < 2000){
                    uc.setEstadoConsumo(EstadosConsumo.CONSUMO_ADECUADO.toString());
                    uc.setRecomendacion(Recomendaciones.REC_CONSUMO_ADECUADO.toString());
                } else if (totalCalorias > 2000){
                    uc.setEstadoConsumo(EstadosConsumo.EXCESO_CALORIAS.toString());
                    uc.setRecomendacion(Recomendaciones.REC_EXCESO_CALORIAS.toString());
                }
                UsuarioCaloriasModel ucModel = new UsuarioCaloriasModel();
                ucModel.saveCalories(uc); //MODEL
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR", e.getMessage(), JOptionPane.ERROR_MESSAGE);
            }
        }

        //AQUI DEBERIA LLAMAR AL METODO CARGAR TABLA DESDE TXT
        //eventListController.addNewRow(metadata);
        //showMessageDialog(null, "Se registro el invitado en guest.txt!");
    }
    
    
    public void addCalories(Alimento a, String userName) throws Exception
    {
            listaAlimentos.add(a);
            UsuarioCaloriasModel ucModel = new UsuarioCaloriasModel();
            ucModel.saveFoods(a, userName); //MODEL
    }
    
}
