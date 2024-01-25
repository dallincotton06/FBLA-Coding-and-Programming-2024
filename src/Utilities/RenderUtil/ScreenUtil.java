package Utilities.RenderUtil;


import GUI.Components.SearchBar;
import GUI.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.NavigableMap;

public class ScreenUtil {

    public static int proportionalGapRight(int percent, int objectWidth) {
        return (MainFrame.frame.getBounds().x - objectWidth) / (percent / 100);
    }


    public static void addTopLogo(JPanel panel) {
        JPanel boundingBox = new JPanel();
        boundingBox.setLayout(new FlowLayout());
        boundingBox.setPreferredSize(new Dimension(80, 9));
        boundingBox.setBackground(new Color(0, 0, 0, 255));
        boundingBox.add(new JLabel(new ImageIcon(ImageUtil.readAndScale("src/Assets/Images/houseonahilllogo.png", 25, 25))));
        boundingBox.add(ComponentUtil.changeFont(new JLabel("House on a Hill Studios"), new Font("Serif", Font.BOLD, 24)), "split, wrap");

        panel.add(boundingBox, "gapleft 5%, split, wrap");
    }

    public static void addNavigationPopup(JPanel panel) {

        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setLayout(MainFrame.layout);
        popupMenu.setPreferredSize(new Dimension(150, 100));
        SearchBar searchBar = new SearchBar(25);
        searchBar.setText("search");

        JButton close = new JButton("x");
        close.setActionCommand("close");
        popupMenu.add(close, "gapleft 100, wrap");
        popupMenu.add(new JLabel("Account"), "wrap");
        popupMenu.add(new JLabel("TBD"), "wrap");
        popupMenu.add(new JLabel("Placeholder"), "wrap");

        JButton navButton = new JButton("Navigation >");
        ComponentUtil.changeFont(navButton, new Font("Ariel", Font.BOLD, 24));
        navButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                ComponentUtil.changeFont(navButton, new Font("Ariel", Font.BOLD, 24));
                popupMenu.show(navButton, navButton.getX() - 1280, navButton.getY() + 37);
            }

            @Override
            public void mouseEntered(MouseEvent event) {
                navButton.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent event) {
                navButton.setForeground(Color.BLACK);
            }
        });

        close.addActionListener(e -> {
            if (e.getActionCommand().equals("close")) {
                popupMenu.setVisible(false);
            }
        });

        panel.add(searchBar, "cell 6 0");
        panel.add(navButton, "cell 8 0, wrap 30");


    }
}
