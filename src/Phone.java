public abstract class Phone {
    private String number;
    private String model;
    private double weight;



    {
        number = "Missing number";
        model = "Missing model";
        weight = 0.0;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    public Phone(){}

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public String getNumber(){
        return number;
    }
    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }
    public abstract void info();

}
