package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalTime;

public class Brewery {
    @JsonProperty("brewery_id")
    private int id;
    @JsonProperty("brewery_name")
    private String breweryName;
    @JsonProperty("brewery_main_img")
    private String breweryImg;
    private String website;
    @JsonProperty("open_hour")
    private LocalTime openHour;
    @JsonProperty("close_hour")
    private LocalTime closeHour;
    @JsonProperty("history")
    private String history;
    @JsonProperty("brewery_contact")
    private Contact contact;

    public String getBreweryImg() {
        return breweryImg;
    }

    public void setBreweryImg(String breweryImg) {
        this.breweryImg = breweryImg;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public LocalTime getOpenHour() {
        return openHour;
    }

    public void setOpenHour(LocalTime openHour) {
        this.openHour = openHour;
    }

    public LocalTime getCloseHour() {
        return closeHour;
    }

    public void setCloseHour(LocalTime closeHour) {
        this.closeHour = closeHour;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Brewery(int id, String breweryName, String breweryImg, String website, LocalTime openHour, LocalTime closeHour, String history, Contact contact) {
        this.id = id;
        this.breweryName = breweryName;
        this.breweryImg = breweryImg;
        this.website = website;
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.history = history;
        this.contact = contact;
    }

    public Brewery() {}

    @Override
    public String toString() {
        return "Brewery{" +
                "id=" + id +
                ", Brewery Name='" + breweryName +
                ", Brewery Img =" + breweryImg +
                ", Website=" + website +
                ", Open Hour=" + openHour +
                ", Close Hour=" + closeHour +
                ", History=" + history +
                ", Contact Info=Email: " + contact.getEmail() +
                " Phone: " + contact.getPhone() + " Address: " + contact.getAddress() +
                '}';
    }
}
