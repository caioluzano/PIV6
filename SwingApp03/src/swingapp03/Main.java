package SwingApp03;


import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public static void main(String[] args) {

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
        Frame.setMinimumSize(new Dimension(400,600));
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setTitle("Swing App 03");
        
        JPanel panel = new JPanel();
        Frame.add(panel);
        
        JLabel Label = new JLabel("Valor: ");
        panel.add(Label);

        
        JTextField field = new JTextField(10);
        panel.add(field);
        
        JButton button = new JButton("Enviar");
        panel.add(button);
        
        ActionListener listener = new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                
                System.out.println("Clicou no botão com AL implementado diretamente");
            }
        };
        
        button.addActionListener(listener);
        Frame.pack();
        Frame.setVisible(true);

    }

    //public static void c
}
