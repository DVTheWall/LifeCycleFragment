package com.example.peacock.fragment_lifecycle;

/**
 * Created by peacock on 7/6/17.
 */

public class Model {

    public int icon;
    public String name;

    public Model() {
    }

    // Constructor.
    public Model(int icon, String name) {

        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
