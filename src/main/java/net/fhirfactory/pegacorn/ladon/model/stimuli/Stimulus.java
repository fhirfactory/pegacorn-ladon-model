package net.fhirfactory.pegacorn.ladon.model.stimuli;

import net.fhirfactory.pegacorn.petasos.model.topics.TopicToken;
import net.fhirfactory.pegacorn.petasos.model.uow.UoW;
import net.fhirfactory.pegacorn.petasos.model.uow.UoWPayload;

public class Stimulus extends UoW {
    public Stimulus(UoWPayload inputPayload) {
        super(inputPayload);
    }

    public Stimulus(UoW originalUoW) {
        super(originalUoW);
    }

    public StimulusType getStimulusResourceType(){
        StimulusType stimulusTypeID = new StimulusType(this.getPayloadTopicID());
        return(stimulusTypeID);
    }
}
