/*
 * Copyright (c) 2020 Mark A. Hunter
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.fhirfactory.pegacorn.ladon.model.virtualdb.mdr;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.ResourceType;
import org.slf4j.Logger;

import javax.annotation.PostConstruct;

public abstract class SoTResourceConduit implements SoTConduitInterface {
    private ResourceType resourceType;
    private SoTIdentifier sotIdentifier;

    abstract protected void registerWithSoTCConduitController();
    abstract protected Logger getLogger();
    abstract protected Identifier getBestIdentifier(MethodOutcome outcome);
    abstract protected void doSubclassInitialisations();

    public SoTIdentifier getSotIdentifier() {
        return sotIdentifier;
    }

    public void setSotIdentifier(SoTIdentifier sotIdentifier) {
        this.sotIdentifier = sotIdentifier;
    }

    public ResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
    }

    @PostConstruct
    public void initialise(){
        getLogger().debug(".initialise(): Entry");
        registerWithSoTCConduitController();
        doSubclassInitialisations();
        getLogger().debug(".initialise(): Exit");
    }
}
