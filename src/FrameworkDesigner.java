public class FrameworkDesigner extends Designer{
    //constructor
    public FrameworkDesigner(PersonalData data){
        super(data);
    }

    //Method
    public void createFramework(String frameworkName){
        System.out.println("A fost creat un framework cu numele "+ frameworkName);
    }

    //override
    public String toString(){
        return personalData.getFirstName() + " este proiectant de frameworkuri.";
    }

}
