/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apputilities;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author rhill
 */
public abstract class AppGUI extends JFrame {
    public static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static final int SCREEN_WIDTH = SCREEN_SIZE.width;
    public static final int SCREEN_HEIGHT = SCREEN_SIZE.height;
    public static final String FILE_SEPARATOR = System.getProperty("file.separator");
    public static final String RESOURCE_PATH = "."+FILE_SEPARATOR+"resources"+FILE_SEPARATOR;
    
    protected AppController ctrl;
    
    public AppGUI() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public AppGUI(AppController ctrl) {
        this();
        this.setController(ctrl);
    }
    
    public final void setController(AppController ctrl) {
        this.ctrl = ctrl;
    }
}
