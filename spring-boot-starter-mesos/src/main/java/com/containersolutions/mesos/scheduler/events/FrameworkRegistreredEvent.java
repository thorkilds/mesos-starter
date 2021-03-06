package com.containersolutions.mesos.scheduler.events;

import org.apache.mesos.Protos;

public class FrameworkRegistreredEvent extends MesosEvent {
    private final Protos.MasterInfo masterInfo;

    public FrameworkRegistreredEvent(Protos.FrameworkID frameworkID, Protos.MasterInfo masterInfo) {
        super(frameworkID);
        this.masterInfo = masterInfo;
    }

    public Protos.FrameworkID getFrameworkID() {
        return (Protos.FrameworkID) getSource();
    }

    public Protos.MasterInfo getMasterInfo() {
        return masterInfo;
    }
}
