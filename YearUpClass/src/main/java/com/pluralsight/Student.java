package com.pluralsight;

public class Student extends Person {
    private int id;
    private int workbookPageNumber;
    private String github;
    private String linkedIn;
    private String codingNickname;
    private String codewarsXPoints;
    private String imageUrl;
    private String deviceType; // Mac or Windows
    private String currentlyWorkingOn;

    // Constructor
    public Student(int id, String firstname, String lastname, String email, String gender, String github, String linkedIn,
                   String codingNickname, String codewarsXPoints, String imageUrl, String deviceType,
                   int workbookPageNumber, String currentlyWorkingOn) {
        super(firstname, lastname, email, gender);
        this.id = id;
        this.github = github;
        this.linkedIn = linkedIn;
        this.codingNickname = codingNickname;
        this.codewarsXPoints = codewarsXPoints;
        this.imageUrl = imageUrl;
        this.deviceType = deviceType;
        this.workbookPageNumber = workbookPageNumber;
        this.currentlyWorkingOn = currentlyWorkingOn;
    }

    // Empty Constructor
    public Student() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkbookPageNumber() {
        return workbookPageNumber;
    }

    public void setWorkbookPageNumber(int workbookPageNumber) {
        this.workbookPageNumber = workbookPageNumber;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getCodingNickname() {
        return codingNickname;
    }

    public void setCodingNickname(String codingNickname) {
        this.codingNickname = codingNickname;
    }

    public String getCodewarsXPoints() {
        return codewarsXPoints;
    }

    public void setCodewarsXPoints(String codewarsXPoints) {
        this.codewarsXPoints = codewarsXPoints;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getCurrentlyWorkingOn() {
        return currentlyWorkingOn;
    }

    public void setCurrentlyWorkingOn(String currentlyWorkingOn) {
        this.currentlyWorkingOn = currentlyWorkingOn;
    }
}
