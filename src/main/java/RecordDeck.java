public class RecordDeck extends Component {

    private int speed;

    public RecordDeck(String name, String model, int speed){
        super(name, model);
        this.speed = speed;
    }

    public void changeSpeed(int newSpeed){
        speed = newSpeed;
    }

}
