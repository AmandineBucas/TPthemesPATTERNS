/**
 * Created by Amandine on 08/01/2017.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class affichage extends JFrame{

    private JButton mybutton;

    public affichage(){

        this.setTitle("button");
        this.setSize(600, 300);

        JPanel pan = new JPanel();

        JComboBox<String> combo = new JComboBox<>();
        combo.addItem("Mario");
        combo.addItem("StarWars");

        mybutton = new actiontheme1().createButton();
        pan.add(mybutton);

        combo.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {

                if(!e.equals(mybutton)){
                    pan.remove(mybutton);
                    if(e.getItem().equals("Mario")){
                        mybutton = new actiontheme1().createButton();
                        combo.setBackground(Color.red);
                        pan.add(mybutton);
                    }
                    else{
                        mybutton = new actiontheme2().createButton();
                        combo.setBackground(Color.blue);
                        pan.add(mybutton);
                    }
                }
                pan.repaint();
                pan.revalidate();
            }
        });

        pan.add(combo);

        this.setContentPane(pan);
        this.setVisible(true);
    }

    public static void main(String[] args){
        JFrame affichage = new affichage();
    }
}
