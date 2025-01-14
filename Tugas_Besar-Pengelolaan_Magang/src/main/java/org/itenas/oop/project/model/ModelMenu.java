/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itenas.oop.project.model;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author aryan
 */
public class ModelMenu {
    private String Name;
    private MenuType type;
    private String icon;
    
    public static enum MenuType {
        TITLE, MENU, EMPTY
    }    

    public ModelMenu() {
    }

    public ModelMenu(String icon, String Name, MenuType type) {
        this.icon = icon;
        this.Name = Name;
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public MenuType getType() {
        return type;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public Icon toIcon() {
        
        return new ImageIcon(ClassLoader.getSystemResource("org/itenas/oop/project/icon/" + icon + ".png"));
    }

    
}
