public class Stereo {

    private String name;
    private Radio radio;
    private RecordDeck recordDeck;
    private CdPlayer cdPlayer;
    private CassettePlayer cassettePlayer;
    private int volume = 0;

    public Stereo(String name){

        this.name = "MyHappyStereo";
        this.radio = new Radio("Panasonic", "MyHappyRadio");
        this.recordDeck = new RecordDeck("Panasonic", "MyHappyRecordDeck");
        this.cdPlayer = new CdPlayer("Panasonic", "MyHappyCDPlayer");
        this.cassettePlayer = new CassettePlayer("Panasonic", "MyHappyCassettePlayer");
    }
    public String play(){
        return "I only play Happy Music";
    }
}
