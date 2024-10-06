/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc01_caloriescontrol.models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import pc01_caloriescontrol.core.Model;
import pc01_caloriescontrol.core.View;

/**
 *
 * @author C2A601-03
 */
public class UsuarioCaloriasModel implements Model{
    
    
    private static final String DIRECTORY = "./src/pc01_caloriescontrol/";
    private static final String FILECALORIES = "calorias.txt";
    private static final String FILEFOODS = "alimentos.txt";
    private final List<View> views = new ArrayList<>();
    private String notice;

    @Override
    public void attach(View view) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void detach(View view) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void notifyViews() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public void saveCalories(UsuarioCalorias uc) throws Exception
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(DIRECTORY, FILECALORIES), true));
            writer.write(uc.toStringCalories(), 0, uc.toStringCalories().length());
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException fnfe) {
            notice = "File not found";
            notifyViews();
        } catch (Exception ex) {
            notice = "Error while writing the file";
            notifyViews();
        }
    }
    
    public void saveFoods(Alimento a, String userName) throws Exception
    {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(DIRECTORY, FILEFOODS), true));
            System.out.println("comidas : " + userName + "," + a.toString() + a.toString().length());
            writer.write(userName + "," + a.toString(), 0, a.toString().length() + userName.length() + 1);
            writer.newLine();
            writer.close();
        } catch (FileNotFoundException fnfe) {
            notice = "File not found";
            notifyViews();
        } catch (Exception ex) {
            notice = "Error while writing the file";
            notifyViews();
        }
    }
    
    public List<String> listCalories(){
        List<String> fileList = new ArrayList<>();
        /*if(Obtener_Codigo_Alumno.getText().isEmpty()){
            showMessageDialog(null, "Porfavor ingrese el codigo de alumno!");
            return;
        }*/
        
        try{
            //LEEMOS CALORIAS
            FileReader fr = new FileReader("./src/pc01_caloriescontrol/calorias.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String d;
            while((d=br.readLine())!= null){
                    fileList.add(d);
            }
            br.close();
            
                                    
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return fileList;
    }
    
    public List<String> listFoods(){
        
        List<String> fileList = new ArrayList<>();
        
        try{
        FileReader fr = new FileReader("./src/pc01_caloriescontrol/alimentos.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String d;
            while((d=br.readLine())!= null){
                    fileList.add(d);
            }
            br.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return fileList;
    }

}
