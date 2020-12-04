package net.fhirfactory.pegacorn.ladon.model.virtualdb.mdr;

import net.fhirfactory.pegacorn.ladon.model.virtualdb.operations.VirtualDBActionStatusEnum;
import net.fhirfactory.pegacorn.ladon.model.virtualdb.operations.VirtualDBMethodOutcomeFactory;
import org.hl7.fhir.r4.model.IdType;
import org.hl7.fhir.r4.model.Reference;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ResourceSoTConduitActionResponseFactory {

    @Inject
    VirtualDBMethodOutcomeFactory outcomeFactory;

    public ResourceSoTConduitActionResponse createResourceConduitActionResponse(Reference originatingSystem, Reference originatingOrganization, IdType resourceId, VirtualDBActionStatusEnum status, String activityLocation){
        ResourceSoTConduitActionResponse sotConduitOutcome = new ResourceSoTConduitActionResponse(originatingSystem, originatingOrganization);
        outcomeFactory.populateResourceActivityOutcome(sotConduitOutcome, resourceId,  status, activityLocation);
        return(sotConduitOutcome);
    }
}
