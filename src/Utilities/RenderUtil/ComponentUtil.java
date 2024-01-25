package Utilities.RenderUtil;

import javax.swing.*;
import java.awt.*;

public class ComponentUtil {

    public static JLabel changeFont(JLabel label, Font font) {
        label.setFont(font);
        return label;
    }

    public static JButton changeFont(JButton button, Font font) {
        button.setFont(font);
        return button;
    }
}
