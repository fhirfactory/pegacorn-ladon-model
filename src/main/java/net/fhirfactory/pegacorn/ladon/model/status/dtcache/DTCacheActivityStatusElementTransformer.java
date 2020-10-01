package net.fhirfactory.pegacorn.ladon.model.status.dtcache;

import ca.uhn.fhir.rest.api.MethodOutcome;
import net.fhirfactory.pegacorn.ladon.model.fhir.r4.builders.DTCacheOperationOutcomeBuilder;
import net.fhirfactory.pegacorn.ladon.model.status.common.LadonComponentStatusElement;
import net.fhirfactory.pegacorn.ladon.model.status.common.LadonComponentStatusElementTransformerBase;
import org.hl7.fhir.r4.model.codesystems.OperationOutcome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DTCacheActivityStatusElementTransformer extends LadonComponentStatusElementTransformerBase {
    private static final Logger LOG = LoggerFactory.getLogger(DTCacheActivityStatusElementTransformer.class);

    @Inject
    DTCacheOperationOutcomeBuilder dtcacheOutcomeBuilder;

    @Override
    public MethodOutcome transformToMethodOutcome(LadonComponentStatusElement statusElement) {
        MethodOutcome outcome = new MethodOutcome();

        return(outcome);
    }

    @Override
    public OperationOutcome transformToOperationOutcome(LadonComponentStatusElement statusElement) {
        DTCacheActivityStatusElement dtcacheStatusElement = (DTCacheActivityStatusElement)statusElement;
        org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity severity;
        switch(dtcacheStatusElement.getErrorLevel()){
            case ERROR_LEVEL_FATAL:
                severity = org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity.FATAL;
                break;
            case ERROR_LEVEL_ERROR:
                severity = org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity.ERROR;
                break;
            case ERROR_LEVEL_WARNING:
                severity = org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity.WARNING;
                break;
            case ERROR_LEVEL_INFORMATION:
            case ERROR_LEVEL_INFORMATION_DEBUG:
            case ERROR_LEVEL_INFORMATION_TRACE:
                severity = org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity.INFORMATION;
                break;
            default:
                severity = org.hl7.fhir.r4.model.OperationOutcome.IssueSeverity.NULL;
        }
        org.hl7.fhir.r4.model.OperationOutcome.IssueType issueType;

        switch(dtcacheStatusElement.getAction()){
            case DT_CACHE_ACTION_RESOURCE_CREATE: {
                switch (dtcacheStatusElement.getStatus()) {
                    case DT_CACHE_ACTIVITY_RESOURCE_CREATION_START:
                    case DT_CACHE_ACTIVITY_RESOURCE_CREATION_IN_PROGRESS:
                    case DT_CACHE_ACTIVITY_RESOURCE_CREATION_FINISH:{
                        switch(dtcacheStatusElement.getOutcome()){
                            case DT_CACHE_OUTCOME_RESOURCE_CREATED:{
                                issueType = null;
                                break;
                            }

                        }
                    }
                    case DT_CACHE_ACTIVITY_RESOURCE_CREATION_FAILURE:

                    case DT_CACHE_ACTIVITY_RESOURCE_CREATED_PAUSED:
                    default:
                }
                break;
            }
            case DT_CACHE_ACTION_RESOURCE_REMOVE:{
                switch(dtcacheStatusElement.getStatus()){
                    case DT_CACHE_ACTIVITY_RESOURCE_REMOVE_START:
                    case DT_CACHE_ACTIVITY_RESOURCE_REMOVE_FINISH:
                    case DT_CACHE_ACTIVITY_RESOURCE_REMOVE_FAILURE:
                    case DT_CACHE_ACTIVITY_RESOURCE_REMOVE_IN_PROGRESS:
                    case DT_CACHE_ACTIVITY_RESOURCE_REMOVE_PAUSED:
                    default:
                }
                break;
            }
            case DT_CACHE_ACTION_RESOURCE_UPDATE:{
                switch(dtcacheStatusElement.getStatus()){
                    case DT_CACHE_ACTIVITY_RESOURCE_UPDATE_FINISH:
                    case DT_CACHE_ACTIVITY_RESOURCE_UPDATE_START:
                    case DT_CACHE_ACTIVITY_RESOURCE_UPDATE_FAILURE:
                    case DT_CACHE_ACTIVITY_RESOURCE_UPDATE_IN_PROGRESS:
                    case DT_CACHE_ACTIVITY_RESOURCE_UPDATE_PAUSED:
                    default:
                }
                break;
            }
            case DT_CACHE_ACTION_RESOURCE_RETRIEVE:{
                switch(dtcacheStatusElement.getStatus()){
                    case DT_CACHE_ACTIVITY_RESOURCE_RETRIEVED_START:
                    case DT_CACHE_ACTIVITY_RESOURCE_RETRIEVED_FINISH:
                    case DT_CACHE_ACTIVITY_RESOURCE_RETRIEVED_FAILURE:
                    case DT_CACHE_ACTIVITY_RESOURCE_RETRIEVED_IN_PROGRESS:
                    case DT_CACHE_ACTIVITY_RESOURCE_RETRIEVED_PAUSED:
                    default:
                }
                break;
            }

            case DT_CACHE_ACTION_RESOURCE_LOAD:{
                switch(dtcacheStatusElement.getStatus()){
                    case DT_CACHE_ACTIVITY_RESOURCE_LOADING_FINISH:
                    case DT_CACHE_ACTIVITY_RESOURCE_LOADING_FAILURE:
                    case DT_CACHE_ACTIVITY_RESOURCE_LOADING_START:
                    case DT_CACHE_ACTIVITY_RESOURCE_LOADING_IN_PROGRESS:
                    default:
                }
                break;
            }
            case DT_CACHE_ACTION_RESOURCE_SYNCHRONISE:
                switch(dtcacheStatusElement.getStatus()){
                    case DT_CACHE_ACTIVITY_RESOURCE_INSYNC:
                    case DT_CACHE_ACTIVITY_RESOURCE_SYNCHRONISING:
                    default:
                        issueType = org.hl7.fhir.r4.model.OperationOutcome.IssueType.INCOMPLETE;
                }
                break;
            default:
                issueType = org.hl7.fhir.r4.model.OperationOutcome.IssueType.INFORMATIONAL;
        }


        OperationOutcome outcome = null;
        return(outcome);
    }
}
