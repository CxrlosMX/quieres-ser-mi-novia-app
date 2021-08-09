/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lamina;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author: CxrlosMX
 * @Git-Hub: https://github.com/CxrlosMX
 * @Phone: 953-212-97-27
 * @Email: LuisCRendon131@gmail.com
 * @Date: 8/08/2021
 *
 */
public class Lamina extends JPanel {

    private JPanel lamina2, lamina3;
    private JLabel mensaje;

    //Botones
    private final JButton botonNo, botonSi;

    public Lamina() {
        //Asignamos un layout a la lamina principal
        setLayout(new BorderLayout());

        this.dameLaminaTexto("Quieres ser mi novia?", "Agency FB", 50, Font.ITALIC, new Color(4, 4, 2), Color.WHITE);

        //Agregmos la tercera lamina
        lamina3 = new JPanel();

        botonSi = this.addBoton(lamina3, "SI", "Serif", 15, Font.BOLD);
        botonNo = this.addBoton(lamina3, "NO", "Serif", 15, Font.BOLD);
        botonNo.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent me) {
                Random d = new Random();
                int a = d.nextInt(300);
                int b = d.nextInt(300);
                botonNo.setLocation(a, b);
            }

        });
        lamina3.add(botonNo);
        add(lamina2, BorderLayout.NORTH);
        add(lamina3);
    }

    //Método que me devuelve una lamina
    public void dameLaminaTexto(String texto, String tipoLetra, int tamagno, int estilo, Color colorLamina, Color textoColor) {
        lamina2 = new JPanel();
        mensaje = new JLabel(texto);
        //Cambiamos el tipo de letra,tamaño y estilo del mensaje
        mensaje.setFont(new Font(tipoLetra, estilo, tamagno));
        lamina2.setBackground(colorLamina);
        mensaje.setForeground(textoColor);
        lamina2.add(mensaje);

    }

    //Método que genera los botones
    public JButton addBoton(JPanel lamina, String mensaje, String tipoLetra, int tamagno, int estilo) {
        JButton boton = new JButton(mensaje);
        boton.setFont(new Font(tipoLetra, estilo, tamagno));
        lamina.add(boton);

        return boton;
    }

}
