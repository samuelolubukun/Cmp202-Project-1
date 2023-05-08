package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Physicsoop.Energy;
public class EnergyUI {
    JFrame frame = new JFrame("PhysicsUI Calc");
    JButton potentialEnergyBtn = new JButton("Potential Energy");
    JButton powerBtn = new JButton("Power");

    public void MainUI() {
        potentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPotentialEnergyUI();
            }
        });

        powerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPowerUI();
            }
        });

        frame.add(potentialEnergyBtn);
        frame.add(powerBtn);
        frame.setSize(200, 100);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    JFrame potentialEnergyFrame = new JFrame("Potential Energy");
    JLabel massLabel = new JLabel("Enter mass (kg):");
    JLabel heightLabel = new JLabel("Enter height (m):");
    JTextField massTextField = new JTextField();
    JTextField heightTextField = new JTextField();
    JButton calculatePotentialEnergyBtn = new JButton("Calculate");

    public void drawPotentialEnergyUI() {
        Energy myObj = new Energy();
        potentialEnergyFrame.setLayout(new GridLayout(3, 2));
        potentialEnergyFrame.setSize(300, 150);

        potentialEnergyFrame.add(massLabel);
        potentialEnergyFrame.add(massTextField);
        potentialEnergyFrame.add(heightLabel);
        potentialEnergyFrame.add(heightTextField);
        potentialEnergyFrame.add(calculatePotentialEnergyBtn);

        calculatePotentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float mass = Float.parseFloat(massTextField.getText());
                float height = Float.parseFloat(heightTextField.getText());
                float result = myObj.calculatePotentialEnergy(mass, height);
                JOptionPane.showMessageDialog(null, "Potential Energy = " + result + " J");
            }
        });

        potentialEnergyFrame.setVisible(true);
    }

        JFrame powerFrame = new JFrame("Power");
        JLabel workLabel = new JLabel("Enter work(J):");
        JLabel timeLabel = new JLabel("Enter time(s)");
        JTextField workTextField = new JTextField();
        JTextField timeTextField = new JTextField();
        JButton calculatePowerBtn = new JButton("Calculate");


        public void drawPowerUI() {
            Energy myObj = new Energy();
            powerFrame.setLayout(new GridLayout(3, 2));
            powerFrame.setSize(300, 150);

            powerFrame.add(workLabel);
            powerFrame.add(workTextField);
            powerFrame.add(timeLabel);
            powerFrame.add(timeTextField);
            powerFrame.add(calculatePowerBtn);

            calculatePowerBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    float work = Float.parseFloat(workTextField.getText());
                    float time = Float.parseFloat(timeTextField.getText());
                    float result = myObj.calculatePower(work, time);
                    JOptionPane.showMessageDialog(null, "Power = " + result + " W");
                }
            });

            powerFrame.setVisible(true);
        }



    }



