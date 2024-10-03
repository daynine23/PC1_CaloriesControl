/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pc01_caloriescontrol.core;

/**
 *
 * @author C2A601-03
 */
public interface Model {
    
    /**
     * Attaches an observer in the model.
     *
     * @param view View to be attached
     */
    public void attach(View view);

    /**
     * Detaches a view from the model.
     *
     * @param view View to be detached
     */
    public void detach(View view);

    /**
     * Notify all attached views in the model.
     */
    public void notifyViews();
    
}
