package pl.workshop.adapter;

import com.github.javafaker.Faker;

public class NotificationDispatcher {

    private final NotificationSender sender;
    private final Faker faker = new Faker();

    public NotificationDispatcher(NotificationSender sender) {
        this.sender = sender;
    }

    void start() {
        while(true) {
            sender.email(faker.internet().emailAddress(), faker.internet().emailAddress(), faker.lebowski().quote());
            sender.sms(faker.phoneNumber().cellPhone(), faker.lebowski().quote());
        }
    }


}
