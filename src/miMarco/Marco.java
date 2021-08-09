/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miMarco;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import lamina.Lamina;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/08/2021
 *
 */
public class Marco extends JFrame {

    public Marco() {
        //Método para que no se pueda redimencionar nuestra ventana
        setResizable(false);
        setVisible(true);
        //Titulo del JFrame
        setTitle("Quieres ser mi novia?"); 
        //Asignamos un icono
        ImageIcon ImageIcon = new ImageIcon("src/corazon.jpg");
        Image image = ImageIcon.getImage();
        this.setIconImage(image);
        //Asignamos una dimención
        setBounds(400, 150, 500, 500);
        Lamina lamina = new Lamina();
        add(lamina);
    }

}
