package GUI;

import GUI.Pages.HomePage;
import interfaces.Partnership;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static MainFrame instance;

    public static MigLayout layout;
    public static JFrame frame;
    private static JPanel panel;

    public MainFrame() {

        //TODO: TURN OFF DEBUG BEFORE COMPETITION! 4/20/22
        layout = new MigLayout("debug, fillx, insets 0");

        panel = new JPanel();
        panel.setBackground(new Color(180, 220, 255));
        panel.setLayout(layout);

        frame = new JFrame("FBLA");
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println(Toolkit.getDefaultToolkit().getScreenSize());
        frame.add(scrollPane);
        frame.setVisible(true);
        constructPage(new HomePage(this));
    }

    public static void constructPage(Page page) {
        panel.removeAll();
        page.construct(panel);
        panel.repaint();
        panel.updateUI();
    }

    public static void constructPage(Partnership partnership) {
        panel.removeAll();
        partnership.build(panel);
        panel.repaint();
        panel.updateUI();
    }


    public static MainFrame getInstance() {
        return instance;
    }

}
