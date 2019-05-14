public abstract class Component {

    protected String name;
    protected String model;

    public Component(String name, String model){
        this.name = name;
        this.model = model;
    }

    public String playComponent(){
        return "Playing component";
    }
}
