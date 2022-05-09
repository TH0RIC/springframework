package com.course.springDI;

public class Director implements Employeers {

    // Create an interface
    private ReportCreator newReport;

    private String email;
    private String companyName;

    // Create a constructor that injects  the dependency!!
    public Director(ReportCreator newReport){

        this.newReport = newReport;
    }

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


    // Mwtodo init. Ejecuta tareas antes de iniciar el bean

    public void initMethod(){

        System.out.println("Estoy dentro de INIT. el bean no se ha inicializado todavia");
    }

    // Metodo destroy. Ejecuta tareas despues de usar el bean
    public void destroyMethod(){

        System.out.println("Estoy dentro de DESTROY. El bean ya se usó");

    }




    @Override
    public String action() {
        return "Bossing around";
    }

    @Override
    public String getReport() {
        return "The director has a report called: "+newReport.getReport();
    }
}
