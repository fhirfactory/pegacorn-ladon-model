/*
 * Copyright (c) 2020 Mark A. Hunter (ACT Health)
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
package net.fhirfactory.pegacorn.ladon.model.status.dtcache;

import net.fhirfactory.pegacorn.ladon.model.status.common.LadonComponentErrorLevelEnum;
import net.fhirfactory.pegacorn.ladon.model.status.common.LadonComponentStatusElement;
import org.hl7.fhir.r4.model.IdType;

import java.time.LocalDateTime;

public class DTCacheActivityStatusElement extends LadonComponentStatusElement {
    private IdType resourceId;
    private DTCacheActivityActionEnum action;
    private DTCacheActivityStatusEnum status;
    private DTCacheActivityOutcomeEnum outcome;
    private LadonComponentErrorLevelEnum errorLevel;
    private LocalDateTime updateDate;
    private String commentary;

    public LadonComponentErrorLevelEnum getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(LadonComponentErrorLevelEnum errorLevel) {
        this.errorLevel = errorLevel;
    }

    public DTCacheActivityOutcomeEnum getOutcome() {
        return outcome;
    }

    public void setOutcome(DTCacheActivityOutcomeEnum outcome) {
        this.outcome = outcome;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public IdType getResourceId() {
        return resourceId;
    }

    public void setResourceId(IdType resourceId) {
        this.resourceId = resourceId;
    }

    public DTCacheActivityActionEnum getAction() {
        return action;
    }

    public void setAction(DTCacheActivityActionEnum action) {
        this.action = action;
    }

    public DTCacheActivityStatusEnum getStatus() {
        return status;
    }

    public void setStatus(DTCacheActivityStatusEnum status) {
        this.status = status;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }
}
