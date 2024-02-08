//Ashley Gutierrez Carreto
//November 28th, 2023
//Lab 11 Doctor
//The object of this code are the records for a clinic's doctors. It contains
//the speicialty, the name, and the fee. 
class Doctor extends Person 
{
    private String specialty;
    private double visitFee;

    public Doctor(String name, String specialty,  double visitFee) 
    {
        super(name);
        this.specialty = specialty;
        this.visitFee = visitFee;
    }

    public double getVisitFee() 
    {
        return visitFee;
    }
    public String getSpecialty() 
    {
        return specialty;
    }
    public void setVisitFee(double visitFee) 
    {
        this.visitFee = visitFee;
    }
    public void setSpecialty(String specialty)
    {   
        this.specialty = specialty;
    }
    public boolean equals(Doctor otherDoctor) 
    {
        return this.getName().equalsIgnoreCase(otherDoctor.getName());
    }
}

