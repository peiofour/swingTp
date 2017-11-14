package com.ynov.tpswing;

import com.sun.org.apache.xml.internal.security.utils.JDKXPathAPI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame {
    private JPanel listPanel = new JPanel(new BorderLayout());
    private JPanel addLinePanel = new JPanel();
    private JPanel menuPanel = new JPanel();
    private JButton backToMenuButton = new JButton("Back");
    private JButton goAddLineButton = new JButton("Add line");
    private JButton goListPanelButton = new JButton("Liste");



    Fenetre(){
        this.setTitle("WAZZZAAAA");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyTable mytable = new MyTable();
        JTable table = new JTable(mytable);

        backToMenuButton.addActionListener(new goToPanel(this, menuPanel));
        goAddLineButton.addActionListener(new goToPanel(this, addLinePanel));
        goListPanelButton.addActionListener(new goToPanel(this, listPanel));

        //ListPanel
        listPanel.add(new JButton("bla"), BorderLayout.CENTER);

        //MenuPanel
        menuPanel.add(goAddLineButton, BorderLayout.NORTH);
        menuPanel.add(goListPanelButton, BorderLayout.CENTER);

        //AddLinePanel
        JPanel southAdd = new JPanel();
        southAdd.add(backToMenuButton, BorderLayout.WEST);

        addLinePanel.add(southAdd, BorderLayout.SOUTH);

        this.getContentPane().add(listPanel);

        this.setVisible(true);
    }

    class goToPanel extends AbstractAction{

        private JFrame fenetre;
        private JPanel panel;

        goToPanel(JFrame fenetre, JPanel panel) {
            this.fenetre = fenetre;
            this.panel = panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button ok");
            fenetre.getContentPane().removeAll();
            fenetre.getContentPane().add(panel);
            fenetre.setVisible(true);
        }
    }

}
