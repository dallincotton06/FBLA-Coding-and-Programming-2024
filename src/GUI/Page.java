package GUI;

import javax.print.attribute.standard.Destination;
import javax.swing.*;
import java.net.URI;
import java.net.URISyntaxException;

public interface Page {
    void construct(JPanel panel);

    default void changeDestinaton(Destination destination) throws URISyntaxException {
        destination = new Destination(new URI(""));
    }
}
