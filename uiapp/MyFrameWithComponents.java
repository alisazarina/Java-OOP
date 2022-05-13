package uiapp;

/**
 *
 * @author Alisa Zarina
 */

import javax.swing.*;       // JFrame, JButton

public class MyFrameWithComponents {
    
    public static void main(String[] args) {
    // Create a frame
    JFrame frame = new JFrame("Adding Components into the Frame");    // also title
    
    // Create a button
    JButton jbtOK = new JButton("OK");
    JButton jbtNew = new JButton("New");
    
    // Add button into frame
    frame.add(jbtOK);
    frame.add(jbtNew);
    
    // Design button
    frame.setSize(400, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);             // set visibility
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
}
