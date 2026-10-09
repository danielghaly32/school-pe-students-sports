package com.mycompany.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Encapsulating attributes by making them private and using getters and setters

// Encapsulating attributes and methods in the Sports class

class Sports {

    // Private attributes for encapsulation

    private String nameOfSports = "SportsNames";
    private String students = "Students";
    private int numberOfStudents = 112;

    // Public getters and setters for access

    public String getNameOfSports() {
        return nameOfSports;
    }

    public void setNameOfSports(String nameOfSports) {
        this.nameOfSports = nameOfSports;
    }

    public String getStudents() {
        return students;
    }

    public void setStudents(String students) {
        this.students = students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    // Methods of the Sports class

    void dropDownList() {
    }

    void selectStudent() {
    }

    void deselectStudent() {
    }
}

// Encapsulating attributes and methods in the Students class

class Students {

    // Private attributes for encapsulation

    private String name = "StudentName";
    private String gender = "StudentGender";
    private int age = 15-17;

    // Public getters and setters for access

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Methods of the Students class

    void walk() {
    }

    void run() {
    }

    void sleep() {
    }
}

// Boy class inheriting from Students
class Boy extends Students {
    // Boy-specific behaviors can be added here if needed
}

// Girl class inheriting from Students
class Girl extends Students {
    // Girl-specific behaviors can be added here if needed
}

public class Main {

    public static void main(String[] args) {

        // JFrame = A GUI to add components to
        JFrame frame = new JFrame("Grade 11 PE Students and Sports"); // Creates a frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Allows you to exit out of the application
        frame.setSize(1100, 800); // Sets the x-dimension and y-dimension of the frame
        frame.setLayout(null);

        // JLabel = A label to add text to the GUI
        JLabel label1 = new JLabel("Football"); // Creates a first label
        JLabel label2 = new JLabel("Basketball"); // Creates a second label
        JLabel label3 = new JLabel("Table Tennis"); // Creates a third label
        JLabel label4 = new JLabel("Capture the Flag"); // Creates a fourth label

        // Sets the label's bounds (x, y, width, height)
        int frameHeight = 800; // Explicitly set the frame height for better control
        int labelHeight = 20; // Approximate height of JLabel

        // Positions the labels on certain areas of the frame
        label1.setBounds(150, frameHeight / 6, 150, labelHeight);
        label2.setBounds(650, frameHeight / 6, 150, labelHeight);
        label3.setBounds(150, frameHeight / 2, 150, labelHeight);
        label4.setBounds(650, frameHeight / 2, 150, labelHeight);

        // Creates the student selection lists for each sport with 112 students - The number of students in Grade 11
        String[] students = new String[112];
        for (int i = 0; i < students.length; i++) {
            students[i] = "Student " + (i + 1);
        }

        // Creates football Drop-down list (JList)
        JList<String> footballList = new JList<>(students);
        footballList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        footballList.setVisibleRowCount(5); // Display 5 options at a time
        JScrollPane footballScrollPane = new JScrollPane(footballList);
        footballScrollPane.setBounds(150, (frameHeight / 6) + 30, 150, 100); // Positioned below Football label

        // Creates basketball Drop-down list (JList)
        JList<String> basketballList = new JList<>(students);
        basketballList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        basketballList.setVisibleRowCount(5);
        JScrollPane basketballScrollPane = new JScrollPane(basketballList);
        basketballScrollPane.setBounds(650, (frameHeight / 6) + 30, 150, 100); // Positioned below Basketball label

        // Creates table Tennis Drop-down list (JList)
        JList<String> tableTennisList = new JList<>(students);
        tableTennisList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableTennisList.setVisibleRowCount(5);
        JScrollPane tableTennisScrollPane = new JScrollPane(tableTennisList);
        tableTennisScrollPane.setBounds(150, (frameHeight / 2) + 30, 150, 100); // Positioned below Table Tennis label

        // Creates capture the Flag Drop-down list (JList)
        JList<String> captureFlagList = new JList<>(students);
        captureFlagList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        captureFlagList.setVisibleRowCount(5);
        JScrollPane captureFlagScrollPane = new JScrollPane(captureFlagList);
        captureFlagScrollPane.setBounds(650, (frameHeight / 2) + 30, 150, 100); // Positioned below Capture the Flag
                                                                                // label

        // Creates buttons for each list
        JButton footballButton = new JButton("Show Football Selection");
        footballButton.setBounds(150, (frameHeight / 6) + 150, 200, 30);
        JButton basketballButton = new JButton("Show Basketball Selection");
        basketballButton.setBounds(650, (frameHeight / 6) + 150, 200, 30);
        JButton tableTennisButton = new JButton("Show Table Tennis Selection");
        tableTennisButton.setBounds(150, (frameHeight / 2) + 150, 200, 30);
        JButton captureFlagButton = new JButton("Show Capture Flag Selection");
        captureFlagButton.setBounds(650, (frameHeight / 2) + 150, 200, 30);

        // Adds ActionListeners to the buttons
        footballButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySelectedItems(footballList, "Football");
            }
        });

        basketballButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySelectedItems(basketballList, "Basketball");
            }
        });

        tableTennisButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySelectedItems(tableTennisList, "Table Tennis");
            }
        });

        captureFlagButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displaySelectedItems(captureFlagList, "Capture the Flag");
            }
        });

        // Adds labels to the frame
        frame.add(label1); // Add the first label (Football)
        frame.add(label2); // Add the second label (Basketball)
        frame.add(label3); // Add the third label (Table Tennis)
        frame.add(label4); // Add the fourth label (Capture the Flag)

        // Adds drop-down lists (JLists) to the frame
        frame.add(footballScrollPane); // Add Football list
        frame.add(basketballScrollPane); // Add Basketball list
        frame.add(tableTennisScrollPane); // Add Table Tennis list
        frame.add(captureFlagScrollPane); // Add Capture the Flag list

        // Adds buttons to the frame
        frame.add(footballButton);
        frame.add(basketballButton);
        frame.add(tableTennisButton);
        frame.add(captureFlagButton);

        frame.setVisible(true); // Makes the frame visible

        // Creates an instructional label
        JLabel instructionLabel = new JLabel(
                "To select or deselect multiple students for each sport, hold down Ctrl or Command (macOS) while selecting or deselecting the students.");
        instructionLabel.setBounds(150, frameHeight - 50, 1200, 20); // Positioned near the bottom of the frame

        // Adds an instruction label to the frame
        frame.add(instructionLabel);
    }

    // Uses a method to display the selected items
    private static void displaySelectedItems(JList<String> list, String sport) {
        java.util.List<String> selectedItems = list.getSelectedValuesList();
        if (selectedItems.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No students selected for " + sport);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Selected students for " + sport + ": " + String.join(", ", selectedItems));
        }
    }
}