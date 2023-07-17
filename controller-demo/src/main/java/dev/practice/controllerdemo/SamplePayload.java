package dev.practice.controllerdemo;

import org.springframework.web.bind.annotation.GetMapping;

public class SamplePayload {
    private String name;
    private int id;
    private String occupation;

    public SamplePayload() {
    }

    public SamplePayload(String name, int id, String occupation) {
        this.name = name;
        this.id = id;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "SamplePayload{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Occupation='" + occupation + '\'' +
                '}';
    }

}
