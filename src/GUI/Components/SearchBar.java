package GUI.Components;

import Utilities.SearchBar.SearchFilter;
import Utilities.SearchBar.SearchSort;
import interfaces.Partnership;
import interfaces.PartnershipList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class SearchBar extends JTextField {

    public SearchBar(int width) {
        super(width);
    }

    public List<Partnership> pullResponse(String query, List<SearchFilter> filters, SearchSort searchSort) {
        List<Partnership> response = new ArrayList<>();
        for (PartnershipList partnership : PartnershipList.values()) {
            if  (partnership.name().toLowerCase().contains(query.toLowerCase())) {
                response.add(partnership.getPartnership());
            }
        }
        return response;
    }
}
