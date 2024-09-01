public class User {
    
    public static void main(String[] args) throws Exception {
    
        AppSmartTv appSmartTv = new AppSmartTv();

        System.out.println("TV Power ? " + appSmartTv.tvPower);
        System.out.println("TV channel : " + appSmartTv.channel);
        System.out.println("TV volume : " + appSmartTv.volume);
        
        appSmartTv.tvPowerOn();
        System.out.println("New TV Power ? " + appSmartTv.tvPower);

        appSmartTv.tvPowerOff();
        System.out.println("New TV Power ? " + appSmartTv.tvPower);

        appSmartTv.changeChannel();
        System.out.println("New TV Channel ? " + appSmartTv.channel);

        appSmartTv.newChannel(30);
        System.out.println("New TV Channel ? " + appSmartTv.channel);
    }
}
