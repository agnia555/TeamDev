public class Team {
    //Fields
    private String name;
    private int numOfPeople;

    //Constructors
    public Team(String name){
        this.name = name;
        numOfPeople = 0;
    }
    public Team(String name, int numOfPeople){
        this.name = name;
        this.numOfPeople = numOfPeople;
    }
    public Team(Team team){
        name = team.name;
        numOfPeople = team.numOfPeople;
    }

    //Getters
    public String getName(){
        return name;
    }
    public int getNumOfPeople(){
        return numOfPeople;
    }

    //Setters
    public void setName(String name){
        if (name == null || name.equals(""))
            System.out.println("Numele echipei trebuie sa contina cel putin un caracter");
        else
            this.name = name;

    }
    public void setNumOfPeople(int numOfPeople){
        this.numOfPeople = numOfPeople;
    }

    //Methods
    public void addPerson(String name){
        numOfPeople++;
        System.out.println(name + " este acum in echipa " + this.name);
    }
    public void removePerson(String nume){
        numOfPeople--;
        System.out.println(nume + " a fost transferat in alta echipa");
    }

    //override
    public String toString(){
        return "Echipa: "+ name + "    Nr. Peroane: " + numOfPeople +"";
    }

}
