
import javax.swing.*;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author caio.aluzano
 */
public class Main {

    public Main(String[] args) {

        Runnable thread = new Runnable() {
            @Override
            public void run() {
                criarGUI();
            }
        };

        SwingUtilities.invokeLater(thread);

    }

    public static void criarGUI() {

        JFrame Frame = new JFrame();
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Label = new JLabel("Hello World");
        JLabel Label2 = new JLabel("Ola Mundo");
        JLabel Label3 = new JLabel("Hallo Welt");

        JPanel panel = new JPanel();
        Frame.getContentPane().add(panel);
        /*Frame.getContentPane().add(Label);
        Frame.getContentPane().add(Label2);
        Frame.getContentPane().add(Label3);*/

        panel.add(Label);
        panel.add(Label2);
        panel.add(Label3);

        JTextField field = new JTextField(10);
        panel.add(field);
        
        JButton button = new JButton("Botão");
        panel.add(button);
        
        Frame.setSize(500, 300);
        Frame.setVisible(true);

    }

    //public static void c
}
