public class BeginnerProjectManager extends ProjectManager{
    //Fields
    private String supervisorName;

    //Constructors
    public BeginnerProjectManager(PersonalData data, String supervisorName){
        super(data);
        this.supervisorName = supervisorName;
    }
    public BeginnerProjectManager(PersonalData data, String projectName, double budget, Team team, String supervisorName){
        super(data, projectName, budget, team);
        this.supervisorName = supervisorName;
    }

    //Getter
    public String getSupervisorName(){
        return supervisorName;
    }

    //Setter
    public void setSupervisorName(String supervisorName){
        if (supervisorName == null || supervisorName.equals(""))
            this.supervisorName = supervisorName;
        else
            System.out.println("Ati transmis un string null");
    }

    //Method
    public void ask(String question){
        System.out.println(question + ", " + supervisorName);
    }

    //override
    public String toString(){
        return personalData.getFirstName() + " il are ca tutore pe " + supervisorName;
    }

}
