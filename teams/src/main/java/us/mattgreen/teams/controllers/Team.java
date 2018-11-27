package us.mattgreen.teams.controllers;

public class Team {
    private String name;
    private String location;

    public Team(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Team() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
