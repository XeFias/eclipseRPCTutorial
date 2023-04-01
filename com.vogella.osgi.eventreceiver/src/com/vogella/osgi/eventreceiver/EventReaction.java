package com.vogella.osgi.eventreceiver;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;

import com.vogella.events.VogellaEventConstants;

@Component(
    property = {
    		EventConstants.EVENT_TOPIC + "=" + VogellaEventConstants.TOPIC_UPDATE,
            EventConstants.EVENT_TOPIC + "=" + VogellaEventConstants.TOPIC_SWITCH,
            EventConstants.EVENT_TOPIC + "=" + VogellaEventConstants.TOPIC_HELP
    })

public class EventReaction implements EventHandler {

    public EventReaction() {
        System.out.println("construct Reaction");
    }
    
    @Override
    public void handleEvent(Event event) {
        System.out.println("I will now update: "
        + event.getProperty(VogellaEventConstants.PROPERTY_KEY_TARGET));
    }
}
