package com.batuhanaslan.springbootrabbitmq.listener;

import com.batuhanaslan.springbootrabbitmq.model.Notification;

public class NotificationListener {

    public void handleMessage(Notification notification){

        System.out.println(notification.toString());
    }
}
