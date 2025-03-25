package ISP;

public class User {
    public static void main (String[] args){
        BasicPhone basicPhone = new BasicPhone();
        Samsung samsung = new Samsung();
        Iphone iphone = new Iphone();


        System.out.println();

        System.out.println("Basic Phone:");
        basicPhone.makeCalls("0912345678");
        basicPhone.sendSMS("0912345678", "How is life in Japan?");

        System.out.println();

        System.out.println("Samsung:");
        samsung.makeCalls("0912345678");
        samsung.sendSMS("0912345678", "How is life in Japan?");
        samsung.browseWeb("fb.com");
        samsung.takePicture();

        System.out.println();

        System.out.println("Iphone:");
        iphone.makeCalls("0912345678");
        iphone.sendSMS("0912345678", "How is life in Dubai?");
        iphone.browseWeb("fb.com");
        iphone.takePicture();

    }
}
