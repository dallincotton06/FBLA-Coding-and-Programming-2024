package interfaces;

import Utilities.RenderUtil.ScreenUtil;

import javax.swing.*;

public class Partnership {

    String name;
    Type type;
    String description;
    public Partnership(String name, Type type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;

    }

    public void build(JPanel panel) {
        
    }

    public enum Type {
        TRADES,
        COLLEGES,
        NONE
    }
}
