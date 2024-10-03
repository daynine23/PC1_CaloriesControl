/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc01_caloriescontrol.core;

/**
 *
 * @author C2A601-03
 */
public interface View {
    
    /**
     * Defines what to do when a model notifies it of changes.
     *
     * @param model Model that triggered the update
     * @param data Data sent by this model
     */
    void update(Model model, Object data);
    
}
