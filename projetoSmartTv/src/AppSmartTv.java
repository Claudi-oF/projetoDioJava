public class AppSmartTv {
    
    boolean tvPower = false;
    int channel = 1;
    int volume = 10;

    //Metodo 1
    public void tvPowerOn(){
        tvPower = true;
    }

    //Metodo 2
    public void tvPowerOff() {
        tvPower = false;
    }

    public void changeChannel() {
        channel++;
    }

    public void newChannel(int newChannel) {
        channel = newChannel;
    }

}
