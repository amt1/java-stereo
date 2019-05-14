public class CassettePlayer extends Component {

    private int side;

    public CassettePlayer(String name, String model){
        super(name, model);
        this.side = 1;
    }

    public void changeSide(){
        if (side == 1){
            side = 2;
        } else {
            side = 1;
        }
    }
}
