package net.fhirfactory.pegacorn.ladon.model.stimuli;

import net.fhirfactory.pegacorn.ladon.model.behaviours.BehaviourIdentifier;
import net.fhirfactory.pegacorn.ladon.model.twin.DigitalTwinIdentifier;
import net.fhirfactory.pegacorn.petasos.model.uow.UoW;

public class StimulusPackage {
    UoW stimulusUoW;
    DigitalTwinIdentifier targetTwin;
    BehaviourIdentifier targetBehaviour;

    public StimulusPackage(UoW stimulusUoW, DigitalTwinIdentifier targetTwin, BehaviourIdentifier targetBehaviour) {
        this.stimulusUoW = stimulusUoW;
        this.targetTwin = targetTwin;
        this.targetBehaviour = targetBehaviour;
    }

    public StimulusPackage(UoW stimulusUoW) {
        this.stimulusUoW = stimulusUoW;
        this.targetTwin = null;
        this.targetBehaviour = null;
    }

    public UoW getStimulusUoW() {
        return stimulusUoW;
    }

    public DigitalTwinIdentifier getTargetTwin() {
        return targetTwin;
    }

    public BehaviourIdentifier getTargetBehaviour() {
        return targetBehaviour;
    }

    public void setTargetTwin(DigitalTwinIdentifier targetTwin) {
        this.targetTwin = targetTwin;
    }

    public void setTargetBehaviour(BehaviourIdentifier targetBehaviour) {
        this.targetBehaviour = targetBehaviour;
    }
}
