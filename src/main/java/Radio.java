public class Radio extends Component {

    private float tuning;

    public Radio(String name, String model) {
        super(name, model);
        this.tuning = 0;
    }

    public changeTuning( float changeAmount){
        tuning += changeAmount;
    }

    public String tune(float tuning){
        if (tuning < 90) return "Radio 2";
        if (tuning < 93) return "Radio 3";
        if (tuning < 95) return "BBC Radio Scotland";
        return "Radio Forth";
    }
}
