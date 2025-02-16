package Observer;

import Observable.StockObservable;

public class PhoneAlertObserverImpl implements NotificationAlertObserver{
    String mobile;
    StockObservable observable;

    public PhoneAlertObserverImpl(String mobile, StockObservable observable){
        this.mobile = mobile;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendMessageOnMobile(mobile);
    }
    private void sendMessageOnMobile(String mobile){
        System.out.println("Sent message on mobile: "+ mobile + " product is in stock hurry up");
    }
}
