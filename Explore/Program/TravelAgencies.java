public class TravelAgencies {

    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private Boolean flightFacility;

    // ✅ Parameterized Constructor
    public TravelAgencies(int regNo, String agencyName, String packageType, int price, Boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    // ✅ Default Constructor
    public TravelAgencies() {}

    // ✅ Getters
    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public Boolean getFlightFacility() {
        return flightFacility;
    }

    // ✅ Setters
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFlightFacility(Boolean flightFacility) {
        this.flightFacility = flightFacility;
    }
}
