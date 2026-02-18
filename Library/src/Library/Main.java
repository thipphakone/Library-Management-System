
package Library;
import Library.login;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
/**
 *
 * @author Trivico
 */
public class Main {
    
    
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.out.println("Failed to initialize Laf");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            login loginFrame = new login(); 
            loginFrame.setVisible(true);    
            loginFrame.setLocationRelativeTo(null); 
        }
    });
    }
    
}
