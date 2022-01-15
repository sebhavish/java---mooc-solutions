
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("Bhavish", "hi dude?");
        MessagingService service = new MessagingService();
        service.add(message);
        System.out.println(service.getMessages());
    }
}
