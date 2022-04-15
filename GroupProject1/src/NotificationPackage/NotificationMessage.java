package NotificationPackage;

import java.util.Scanner;

public class NotificationMessage {
    private String message_content;

    /**
     * Asks the user to enter the message used in the notification.
     */
    public void createMessage() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the content of your notification message you wish to receive:");
        String message = scan.nextLine();

        this.message_content = message;
    }


    public void sendMessage() {
        System.out.println(this.message_content);
    }

    public static void main(String[] args) {
        NotificationMessage msg = new NotificationMessage();
        msg.createMessage();
    }
}
