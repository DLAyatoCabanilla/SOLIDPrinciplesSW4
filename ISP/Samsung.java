package ISP;

public class Samsung implements MessageDevice, CallDevice, BrowsingDevice, CameraDevice {
    @Override
    public void makeCalls(String number) {
        System.out.println("Samsung is Calling " + number);
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Samsung Sending message to " + number + "\nMessage: " + message);
    }


    @Override
    public void browseWeb(String url) {
        System.out.println("Samsung Browsing on the " + url);
    }

    @Override
    public void takePicture() {
        System.out.println("Samsung Took a nyelpie");
    }
}
