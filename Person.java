//Ashley Gutierrez Carreto
//November 28th, 2023
//Lab 11 Person
//8.1 listing of Person.java, it is the same code but in a file
public class Person 
{
    private String name;

    public Person() 
    {
        name = "No name yet";
    }

    public Person(String initialName) 
    {
        name = initialName;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName() 
    {
        return name;
    }

    public void writeOutput() 
    {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person otherPerson) 
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}

