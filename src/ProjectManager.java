public class ProjectManager extends SoftwareDeveloper {
    //Fields
    protected double budget;
    protected Team team;

    //Constructors
    public ProjectManager(){
    }
    public ProjectManager(PersonalData data){
        super(data);
        budget = 0;
        team = null;
    }
    public ProjectManager(PersonalData data, String projectName, double budget, Team team){
        super(data, projectName);
        this.budget = budget;
        this.team = new Team(team);
    }

    //Getters
    public double getBudget() {
        return budget;
    }
    public Team getTeam(){
        return team;
    }

    //Setters
    public void setBudget(double budget){
        if (budget > 0)
            this.budget = budget;
        else
            System.out.println("Bugetul nu poate avea o valoare negativa!");
    }
    public void setTeam(Team team){
        this.team = team;
    }

    //Methods
    public void planDeadline(){
        System.out.println("Avem 2 saptamani la dispozitie!");
    }
    public void planBudget(String categoryA, String categoryB, String categoryC){
        //categoryA 60%, categoryB 30%, categoryC 10%
        double sumA = 6* budget /10;
        double sumB = 3* budget /10;
        double sumC = budget /10;
        System.out.println("Pentru " + categoryA + " avem un buget in suma de: "+ sumA+" lei\n" +
                            "Pentru " + categoryB + " avem un buget in suma de: "+ sumB+" lei\n" +
                            "Pentru " + categoryC + " avem un buget in suma de: "+ sumC+" lei\n");
    }

    public void taskDelegation(int numOfTasks){
        System.out.println("Toate cele " + numOfTasks + " au fost repartizate.");
    }

    //Override's methods
    public void finishProject(){
        super.finishProject();
        budget = 0;
    }
    public boolean addProject(String projectName, double budget){
        if (!isProjectDone){
            System.out.println(personalData.getFirstName() + " " + personalData.getLastName() + " lucreaza la proiectul " + projectName + " si nu poate lua inca un proiect.");
            return false;
        }
        if (projectName == null || projectName.equals("")) {
            System.out.println("Numele proiectului trebuie sa includa cel putin un caracter.");
            return false;
        }
        this.projectName = projectName;
        this.budget = budget;
        this.isProjectDone = false;
        System.out.println(personalData.getFirstName() + " a preluat proiectul " + projectName);
        return true;
    }

    //Override
    public String toString(){
        if (isProjectDone)
            return personalData.getFirstName() + ": nu are nici un proiect.";
        return personalData.getFirstName() + ": are proiectul " + projectName + " la care lucreaza echipa " + team.getName() + " cu bugetul de "+ budget +" lei.";
    }
}
