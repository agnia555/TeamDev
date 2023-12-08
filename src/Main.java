import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<PersonalData> workers = new ArrayList<PersonalData>();

        workers.add(new PersonalData("Ann", "Smith", 1998, 1111, 4000f));
        workers.add(new PersonalData("Teodor", "Willson", 2000, 2222, 3600f));
        workers.add(new PersonalData("Charlotte", "Stone", 1988, 3333, 5000f));
        workers.add(new PersonalData("Mark", "Levine",  2001, 4444, 4200f));
        workers.add(new PersonalData("Gary", "Bardot", 1999, 5555, 3100f));
        workers.add(new PersonalData("Mary", "Bennet", 1996, 6666, 5000f));
        workers.add(new PersonalData("Sharon", "Ruiz", 2002, 7777, 3600f));

        ArrayList<Team> teams = new ArrayList<Team>();

        teams.add(new Team("Fast working", 5));
        teams.add(new Team("Quality work", 3));

        SoftwareDeveloper softwareDev1 = new SoftwareDeveloper(workers.get(0));
        SoftwareDeveloper softwareDev2 = new SoftwareDeveloper(workers.get(1), "HealthApp");

        ProjectManager projectManager1 = new ProjectManager(workers.get(2), "Money", 20_000, teams.get(0));

        BeginnerProjectManager beginnerProjectManager1 = new BeginnerProjectManager(workers.get(3), softwareDev1.getPersonalData().getFirstName());
        BeginnerProjectManager beginnerProjectManager2 = new BeginnerProjectManager(workers.get(4), "CookingApp", 6_000, teams.get(1), projectManager1.getPersonalData().getFirstName());

        Designer designer = new Designer(workers.get(5), "DreamHouse", "Some details..");

        FrameworkDesigner frameworkDersigner1 = new FrameworkDesigner(workers.get(6));

        System.out.println("Compania consta din 7 lucratoti principali si inca 8 asistenti.");
        System.out.println("\nDezvoltatorii Software: \n" + softwareDev1 +"\n"+ softwareDev2);
        System.out.println("\nManageri de proiecte: \n"+projectManager1 + "\nIncepatori: " + beginnerProjectManager1 +"\n"+beginnerProjectManager2);
        System.out.println("\nProiectanti: "+ designer + "\nIncepatori: "+frameworkDersigner1);
    }
}