package com.course.springDI;

public class Report implements ReportCreator{
    @Override
    public String getReport() {
        return "Mandatory Report ";
    }
}
