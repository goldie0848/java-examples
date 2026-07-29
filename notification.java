class Notification {
    public void sendNotification() {
        System.out.println("Sending a generic notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending Email notification to the employee...");
    }
}

class SMSNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification to the employee...");
    }
}

class WhatsAppNotification extends Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending WhatsApp notification to the employee...");
    }
}

public class Main {
    public static void main(String[] args) {
        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();
        Notification whatsapp = new WhatsAppNotification();
        
        email.sendNotification();
        sms.sendNotification();
        whatsapp.sendNotification();
    }
}