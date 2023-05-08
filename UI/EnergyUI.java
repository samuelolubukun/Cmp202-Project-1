package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Physicsoop.Energy;
public class EnergyUI {
    JFrame frame = new JFrame("PhysicsUI Calc");
    JButton potentialEnergyBtn = new JButton("Potential Energy");
    JButton kineticEnergyBtn = new JButton("Kinetic Energy");
    JButton workBtn = new JButton("Work!");
    JButton powerBtn = new JButton("Power");
    JButton finalvelocityBtn = new JButton("Final Velocity");

    public void MainUI() {
        potentialEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPotentialEnergyUI();
            }
        });

        kineticEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawKineticEnergyUI();
            }
        });

        workBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawworkUI();
            }
        });


        powerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawPowerUI();
            }
        });

        finalvelocityBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawfinalvelocityUI();
            }
        });

        frame.add(potentialEnergyBtn);
        frame.add(kineticEnergyBtn);
        frame.add(workBtn);
        frame.add(powerBtn);
        frame.add(finalvelocityBtn);
        frame.setSize(200, 400);
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

    JFrame kineticEnergyFrame = new JFrame("Kinetic Energy");
    JLabel massLabel3 = new JLabel("Enter mass (kg):");
    JLabel velocityLabel = new JLabel("Enter velocity (m/s):");
    JTextField massTextField3 = new JTextField();
    JTextField velocityTextField = new JTextField();
    JButton calculateKineticEnergyBtn = new JButton("Calculate");

    public void drawKineticEnergyUI() {
        Energy myObj = new Energy();
        kineticEnergyFrame.setLayout(new GridLayout(3, 2));
        kineticEnergyFrame.setSize(300, 150);
        kineticEnergyFrame.add(massLabel3);
        kineticEnergyFrame.add(massTextField3);
        kineticEnergyFrame.add(velocityLabel);
        kineticEnergyFrame.add(velocityTextField);
        kineticEnergyFrame.add(calculateKineticEnergyBtn);

        calculateKineticEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float mass = Float.parseFloat(massTextField3.getText());
                float velocity = Float.parseFloat(velocityTextField.getText());
                float result = myObj.calculateKineticEnergy(mass, velocity);
                JOptionPane.showMessageDialog(null, "Kinetic Energy = " + result + "kgm/s");
            }
        });

        kineticEnergyFrame.setVisible(true);
    }

    JFrame workFrame = new JFrame("Work!");
    JLabel forceLabel = new JLabel("Enter force (N):");
    JLabel distanceLabel = new JLabel("Enter Distance (m):");
    JTextField forceTextField = new JTextField();
    JTextField distanceTextField = new JTextField();
    JButton calculateworkBtn = new JButton("Calculate");

    public void drawworkUI() {
        Energy myObj = new Energy();
        workFrame.setLayout(new GridLayout(3, 2));
        workFrame.setSize(300, 150);
        workFrame.add(forceLabel);
        workFrame.add(forceTextField);
        workFrame.add(distanceLabel);
        workFrame.add(distanceTextField);
        workFrame.add(calculateworkBtn);

        calculateworkBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float force = Float.parseFloat(forceTextField.getText());
                float distance = Float.parseFloat(distanceTextField.getText());
                float result = myObj.calculateWork(force, distance);
                JOptionPane.showMessageDialog(null, "Potential Energy = " + result + " J");
            }
        });

        workFrame.setVisible(true);
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

    JFrame finalvelocityFrame = new JFrame("Final Velocity");
    JLabel initialvelocityLabel = new JLabel("Enter Initial Velocity:");
    JLabel accelerationLabel = new JLabel("Enter Acceleration");
    JLabel timeLabel2 = new JLabel("Enter Time");
    JTextField initialvelocityTextField = new JTextField();
    JTextField accelerationTextField = new JTextField();
    JTextField timeTextField2 = new JTextField();
    JButton calculatefinalvelocityBtn = new JButton("Calculate");


    public void drawfinalvelocityUI() {
        Energy myObj = new Energy();
        finalvelocityFrame.setLayout(new GridLayout(4, 3));
        finalvelocityFrame.setSize(300, 150);

        finalvelocityFrame.add(initialvelocityLabel);
        finalvelocityFrame.add(initialvelocityTextField);
        finalvelocityFrame.add(accelerationLabel);
        finalvelocityFrame.add(accelerationTextField);
        finalvelocityFrame.add(timeLabel2);
        finalvelocityFrame.add(timeTextField2);
        finalvelocityFrame.add(calculatefinalvelocityBtn);

        calculatefinalvelocityBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float initialvelocity = Float.parseFloat(initialvelocityTextField.getText());
                float acceleration = Float.parseFloat(accelerationTextField.getText());
                float time = Float.parseFloat(timeTextField2.getText());
                float result = myObj.calculateFinalVelocity(initialvelocity, acceleration, time);
                JOptionPane.showMessageDialog(null, "Final Velocity = " + result + " m/s");
            }
        });

        finalvelocityFrame.setVisible(true);
    }




}



