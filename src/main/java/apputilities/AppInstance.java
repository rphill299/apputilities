/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package apputilities;

/**
 *
 * @author rhill
 */
public abstract class AppInstance implements Runnable {
    protected AppController ctrl;
    
    public AppInstance(AppController ctrl) {
        this.setController(ctrl);
    }
    
    public void showGUI() {
        this.ctrl.showGUI();
    }
    
    public final void setController(AppController ctrl) {
        this.ctrl = ctrl;
    }
}
