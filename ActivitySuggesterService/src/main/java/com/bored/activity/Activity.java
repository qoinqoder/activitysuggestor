package com.bored.activity;

public class Activity {
    private String activity;
    private String type;
    private int participants;
    private float price;
    private float accessibility;

    // Getters, setters and toString() methods...


    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getAccessibility() {
        return accessibility;
    }

    public void setAccessibility(float accessibility) {
        this.accessibility = accessibility;
    }

    @Override
    public String toString() {
        return "\n{" +
                "\nactivity='" + activity + '\'' +
                ", \ntype='" + type + '\'' +
                ", \nparticipants=" + participants +
                ", \nprice=" + price +
                ", \naccessibility=" + accessibility +
                '}';
    }
}

