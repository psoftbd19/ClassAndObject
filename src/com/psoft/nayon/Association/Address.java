package com.psoft.nayon.Association;

public class Address {

    private String houseNo;
    private String RoadNo;
    private String postalCode;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoadNo() {
        return RoadNo;
    }

    public void setRoadNo(String roadNo) {
        RoadNo = roadNo;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", RoadNo='" + RoadNo + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
}
