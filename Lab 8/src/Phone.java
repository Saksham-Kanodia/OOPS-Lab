public class Phone {
    String brand;
    int memCapacity;

    interface Callable{
        void makeAudioCall(String cellNum);
        void makeVideoCall(String cellNum);
    }
}

class BasicPhone extends Phone{
    void makeAudioCall(String cellNum){
        System.out.println("Audio Call is being made.");
    }
    void makeVideoCall(String cellNum){
        System.out.println("Video call can't be made.");
    }
}

class SmartPhone extends Phone{
    void makeAudioCall(String cellNum){
        System.out.println("Audio Call is being made.");
    }
    void makeVideoCall(String cellNum){
        System.out.println("Video call can be made.");
        System.out.println("Made the video call.");
    }
}

class Main4{
    public static void main(String[] args){
        BasicPhone p1 = new BasicPhone();
        SmartPhone p2 = new SmartPhone();

        p1.brand = "Nokia";
        p2.brand = "Iphone";

        p1.makeAudioCall("9653081670");
        p1.makeVideoCall("9653081670");

        p2.makeAudioCall("9653081670");
        p2.makeVideoCall("9653081670");
    }
}


