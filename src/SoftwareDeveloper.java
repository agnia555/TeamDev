public class SoftwareDeveloper {
    //Fields
    protected PersonalData personalData;
    protected String projectName;
    protected boolean isProjectDone;

    //Constructors
    public SoftwareDeveloper(){
        //daca nu am constructor implicit nu merge clasa care extinde aceasta clasa
    }
    public SoftwareDeveloper(PersonalData personalData){
        this.personalData = new PersonalData(personalData);
        projectName = "";
        isProjectDone = true;
    }
    public SoftwareDeveloper(PersonalData personalData, String projectName){
        this.personalData = new PersonalData(personalData);
        this.projectName = projectName;
        isProjectDone = false;
    }

    //Getters
    public PersonalData getPersonalData(){
        return personalData;
    }
    public String getProjectName(){
        return projectName;
    }
    public boolean getIsProjectDone() {
        return isProjectDone;
    }

    //Setters
    public void setPersonalData(float salary){
        personalData.setSalary(salary);
    }
    public void setProjectName(String projectName) {
        if (projectName == null || projectName.equals(""))
            System.out.println("Numele proiectului trebuie sa includa cel putin un caracter.");
        else
            this.projectName = projectName;
    }

    //met
    public void finishProject(){
        System.out.println("proiectul " + projectName + " a fost finalizat.");
        projectName = "";
        isProjectDone = true;
    }
    //true - a fost adaugat un nou proiect
    //false - nu a fost adaugat un nou proeict
    public boolean addProject(String projectName){
        if (!isProjectDone){
            System.out.println(personalData.getFirstName() + " " + personalData.getLastName() + " lucreaza la proiectul " + this.projectName + " si nu poate lua inca un proiect.");
            return false;
        }
        if (projectName == null || projectName.equals("")) {
            System.out.println("Numele proiectului trebuie sa includa cel putin un caracter.");
            return false;
        }
        this.projectName = projectName;
        this.isProjectDone = false;
        System.out.println(personalData.getFirstName() + " a preluat proiectul " + projectName);
        return true;
    }

    //override
    public String toString(){
        String result = personalData.getFirstName() + " " + personalData.getLastName();
        if(isProjectDone)
            result += " nu lucreaza la nici un proiect";
        else
            result += " lucreaza la proiectul " + projectName;
        return result;
    }
}
