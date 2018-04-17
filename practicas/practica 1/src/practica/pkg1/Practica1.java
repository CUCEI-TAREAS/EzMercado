package practica.pkg1;

import java.sql.DriverManager;
import java.sql.SQLException;
import practica.pkg1.gui_main;

public class Practica1 {

    public static void main(String[] args) {
        
        gui_main gui = new gui_main();
        gui.setAlwaysOnTop(true);
        gui.show();
        
        gui.buscarRespaldos();
        gui.conectarDb();
    }

}
