/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apputilities;

/**
 *
 * @author rhill
 */
public abstract class AppModel {
    private AppController ctrl;
    
    public AppModel() {
        
    }
    
    public AppModel(AppController ctrl) {
        this.setController(ctrl);
    }
    
    public final void setController(AppController ctrl) {
        this.ctrl = ctrl;
    }
}
