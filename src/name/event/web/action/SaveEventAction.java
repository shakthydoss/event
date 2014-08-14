//******************************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//******************************************************************************
package name.event.web.action;

import name.event.web.model.Event;

public class SaveEventAction {

    private Event event;

    public String execute() {
        return "success";
    }

    public Event getEvent() {
        return this.event;
    }

    public void setEvent(final Event event) {

        this.event = event;

    }

}
