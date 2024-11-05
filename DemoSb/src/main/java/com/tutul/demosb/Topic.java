package com.tutul.demosb;

public class Topic {
    private String ID;
    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String name, String ID, String description) {
        this.name = name;
        this.ID = ID;
        this.description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
