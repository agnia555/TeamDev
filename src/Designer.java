public class Designer extends SoftwareDeveloper{
    //Fields
    protected String sketchDetails;

    //constructor
    public Designer(){
    }
    public Designer(PersonalData data){
        super(data);
        sketchDetails = "";
    }
    public Designer(PersonalData data, String projectName, String sketchDetails){
        super(data, projectName);
        this.sketchDetails = sketchDetails;
    }

    //Getter
    public String getSketchDetails(){
        return sketchDetails;
    }

    //Setter
    public void setSketchDetails(String sketchDetails){
        this.sketchDetails = sketchDetails;
    }

    //met
    public void createSketch(){
        System.out.println("A fost creata o noua schita comform detaliilor.");
    }

    //override
    public String toString(){
        return personalData.getFirstName() + " are urmatoarele detalii " + sketchDetails;
    }

}
