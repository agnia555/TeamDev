public class PersonalData {
    //Fields
    private String firstName;
    private String lastName;
    private int birthYear;
    private int InsuranceNum;
    private float salary;

    //Constructors
    public PersonalData(String firstName, String lastName, int birthYear, int InsuranceNum, float salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.InsuranceNum = InsuranceNum;
        this.salary = salary;
    }
    public PersonalData(PersonalData data){
        this.firstName = data.firstName;
        this.lastName = data.lastName;
        this.birthYear = data.birthYear;
        this.InsuranceNum = data.InsuranceNum;
        this.salary = data.salary;
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getBithYear(){
        return birthYear;
    }
    public int getInsuranceNum(){
        return InsuranceNum;
    }

    public float getSalary() {
        return salary;
    }

    //Setter
    public void setSalary(float salary){
        if (salary > this.salary)
            this.salary = salary;
        else
            System.out.println("\nSalariul indicat este prea mic, regula 293.7 a companiei: nu micsoram salariile.\nSalariul indicat nu va fi setat.\n");
    }

    //Override
    public String toString(){
        return "\nDate personale: \nNume: "+ firstName + " " + lastName + "\nAnul nasterei: " + birthYear + "     Nr. Asigurare: " + InsuranceNum + "\nSalariu: " + salary +"\n";
    }
}
