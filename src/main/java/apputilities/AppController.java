/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apputilities;

/**
 *
 * @author rhill
 */
public abstract class AppController {
    protected AppModel model;
    protected AppGUI gui;
    
    public AppController() {
        
    }
    
    public AppController(AppModel model, AppGUI gui) {
        this.model = model;
        this.gui = gui;
    }
    
    public final void setModel(AppModel model) {
        this.model = model;
    }
    
    public final void setGUI(AppGUI gui) {
        this.gui = gui;
    }
    
    public abstract void showGUI();
}
