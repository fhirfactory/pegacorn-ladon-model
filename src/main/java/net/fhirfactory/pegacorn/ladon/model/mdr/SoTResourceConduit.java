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
package net.fhirfactory.pegacorn.ladon.model.mdr;

import org.hl7.fhir.r4.model.Property;

import java.util.HashMap;

public abstract class SoTResourceConduit implements SoTConduitInterface {
    private HashMap<Property,SoTAttributeReader> attributeSoTReader;
    private HashMap<Property,SoTAttributeWriter> attributeSoTWriter;
    private boolean whollyDerivedFromSingleSource;
    private boolean builtUsingBaseSource;
    private SoTIdentifier primarySoT;

    public HashMap<Property, SoTAttributeReader> getAttributeSoTReader() {
        return attributeSoTReader;
    }

    public void setAttributeSoTReader(HashMap<Property, SoTAttributeReader> attributeSoTReader) {
        this.attributeSoTReader = attributeSoTReader;
    }

    public HashMap<Property, SoTAttributeWriter> getAttributeSoTWriter() {
        return attributeSoTWriter;
    }

    public void setAttributeSoTWriter(HashMap<Property, SoTAttributeWriter> attributeSoTWriter) {
        this.attributeSoTWriter = attributeSoTWriter;
    }

    public boolean isWhollyDerivedFromSingleSource() {
        return whollyDerivedFromSingleSource;
    }

    public void setWhollyDerivedFromSingleSource(boolean whollyDerivedFromSingleSource) {
        this.whollyDerivedFromSingleSource = whollyDerivedFromSingleSource;
    }

    public boolean isBuiltUsingBaseSource() {
        return builtUsingBaseSource;
    }

    public void setBuiltUsingBaseSource(boolean builtUsingBaseSource) {
        this.builtUsingBaseSource = builtUsingBaseSource;
    }

    public SoTIdentifier getPrimarySoT() {
        return primarySoT;
    }

    public void setPrimarySoT(SoTIdentifier primarySoT) {
        this.primarySoT = primarySoT;
    }
}
