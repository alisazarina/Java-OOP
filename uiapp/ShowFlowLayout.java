package uiapp;

/**
 *
 * @author Alisa Zarina
 */

import javax.swing.*;    // JFrame, JButton
import java.awt.*;       // FlowLayout

public class ShowFlowLayout extends JFrame {        // must extend JFrame (inherit JFrame attributes)
    
    // create a frame using FlowLayout manager
    public ShowFlowLayout() {
        // set FlowLayout, aligned left, horizontal gap 10, versitcal gap 20
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        
        // add 10 buttons into the frame
        for (int i = 1; i <= 10; i++) {
            add(new JButton("Component" + i));
        }
    }
    
    public static void main(String[] args) {
        ShowFlowLayout frame = new ShowFlowLayout();           // create a frame
        frame.setTitle("ShowFlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
