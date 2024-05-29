class Phone{
    void call(){
        System.out.println("Calling");
    }
    void sms(){
        System.out.println("Sending Message");
    }
}

interface Camera{
    void click();
    void record();
}

interface MusicPlayer{
    void Play();
    void Pause();
    void Stop();
}

class SmartPhone extends Phone implements Camera,MusicPlayer{
    void videoCall(){
        System.out.println("Starting Video Call");
    }
    @Override
    public void click(){
        System.out.println("Clicking Picture");
    }
    @Override
    public void record(){
        System.out.println("Starting Recording");
    }

    @Override
    public void Play(){
        System.out.println("Playing Song");
    }
     @Override
    public void Pause(){
        System.out.println("Pause Song");
    }

 @Override
    public void Stop(){
        System.out.println("Stop Song");
    }

}


public class interfaceExample2 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.Pause();
        sp.Play();
        sp.Stop();
        sp.call();
        sp.click();
        sp.record();
        sp.videoCall();
        sp.sms();
    }
}
