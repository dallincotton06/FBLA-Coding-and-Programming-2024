package GUI.Pages;

import GUI.Components.SearchBar;
import GUI.MainFrame;
import GUI.Page;
import Utilities.RenderUtil.ComponentUtil;
import Utilities.RenderUtil.ScreenUtil;
import javax.swing.*;
import java.awt.*;

public class HomePage implements Page {

    JLabel missionStatement;
    SearchBar searchBar;
    public HomePage(MainFrame main) {
        missionStatement = ComponentUtil.changeFont(
            new JLabel("Find Your Pathway Easier Than Ever."), new Font("Serif", Font.BOLD, 48));
        searchBar = new SearchBar(25);
        searchBar.setFont(new Font("Serif", Font.BOLD, 56));
    }
    @Override
    public void construct(JPanel panel) {
        panel.add(missionStatement, "align center, span");
        panel.add(searchBar, "align center, span");
    }
}