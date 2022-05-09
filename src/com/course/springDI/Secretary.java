package com.course.springDI;

public class Secretary implements Employeers{

    // Create an interface
    private ReportCreator newReport;

    private String email;
    private String companyName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNewReport(ReportCreator newReport) {
        this.newReport = newReport;
    }

    @Override
    public String action() {
        return "Taking notes";
    }

    @Override
    public String getReport() {
        return "the secretary is writing a report called:"+newReport.getReport();
    }
}
