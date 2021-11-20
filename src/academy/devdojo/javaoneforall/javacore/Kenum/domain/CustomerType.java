package academy.devdojo.javaoneforall.javacore.Kenum.domain;

//80 - Object Orientation - Enumeration pt 01 - Introduction
//81 - Object Orientation - Enumeration pt 02 - Attributes and Constructors
//83 - Object Orientation - Enumeration pt 04 - Getting enumeration by attribute

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    START_UP(3, "Start-Up");

    private int dbValue;
    private String reportValue;


    CustomerType(int dbValue, String reportValue){
        this.dbValue = dbValue;
        this.reportValue = reportValue;
    }
    public static CustomerType getByReportValue(String reportValue){
        for (CustomerType customerType : values()) {
            if(customerType.getReportValue().equalsIgnoreCase(reportValue)){
                return customerType;
            }
        }
        return null;

    }

    public String getReportValue() {
        return reportValue;
    }

    public int getDbValue() {
        return dbValue;
    }
}
