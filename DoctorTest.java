//Ashley Gutierrez Carreto
//November 28th, 2023
//Lab 11 Doctor
//The object of this code are the records for a clinic's doctors. It contains
//the speicialty, the name, and the fee.
public class DoctorTest 
{
    public static void main(String[] args) 
    {
        Doctor doctor1 = new Doctor("Dr. Campbell", "Obstetrician", 115.0);
        Doctor doctor2 = new Doctor("Dr.Susan", "Pediatrician", 145.0);
        // details of the first two doctors
        
        System.out.println("Name: " + doctor1.getName()); 
        System.out.println("Specialty: " + doctor1.getSpecialty()); 
        System.out.println("Visit Fee: " + doctor1.getVisitFee()); 
        //accesor methods for doctor 1

        
        System.out.println("Name: " + doctor2.getName()); 
        System.out.println("Specialty: " + doctor2.getSpecialty()); 
        System.out.println("Visit Fee: " + doctor2.getVisitFee()); 
        //accesor methods for doctor 2

        
        doctor1.setSpecialty("General Practitioner");
        doctor1.setVisitFee(250.0);
        // mutator  methods
        
        Doctor doctor3 = new Doctor("Dr.Susan", "General Practioner", 250.0);
        System.out.println ("Is the third doctor equal to the first? " 
                            + doctor3.equals(doctor1)); 
        System.out.println ("Is the third doctor equal to the second? " 
                            + doctor3.equals(doctor2)); 
        // equals method
    }
}
