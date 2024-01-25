package GUI.Components;

import GUI.MainFrame;
import GUI.Page;
import interfaces.Partnership;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class HyperLink extends JLabel {

    Page destination;
    Partnership partnership;
    public HyperLink(Page destination) {
        this.destination = destination;
    }

    public HyperLink(Partnership partnership) {
        this.partnership = partnership;
    }

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        new MouseAdapter() {

            @Override
            public void mouseClicked (MouseEvent event) {
                if (partnership != null) {
                    MainFrame.constructPage(partnership);
                } else {
                    MainFrame.constructPage(destination);
                }
            }

            @Override
            public void mouseEntered (MouseEvent event){
                setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited (MouseEvent event) {
                setForeground(Color.BLACK);
            }
        };
    }
}
