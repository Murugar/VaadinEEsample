package com.iqmsoft;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.cdi.CDIUI;
import org.vaadin.cdiviewmenu.ViewMenuUI;
import com.vaadin.server.VaadinRequest;

@CDIUI("")
@Theme("apptheme")
@Title("vaadinee")
public class MainUI extends ViewMenuUI {

    private static final long serialVersionUID = 1L;
    static final String APP_NAME = "vaadinee";

    @Override
    public void init(VaadinRequest request) {
        super.init(request);
    }
}



