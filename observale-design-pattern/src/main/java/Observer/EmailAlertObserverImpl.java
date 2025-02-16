package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable observable){
        this.email = email;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String email){
        System.out.println("Email sent to: " + email + " " + "product is in stock hurry up");
    }
}
