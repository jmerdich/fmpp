/*
 * Copyright 2014 Attila Szegedi, Daniel Dekany, Jonathan Revusky
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package fmpp.testsuite;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;

import fmpp.Engine;
import fmpp.LocalDataBuilder;
import fmpp.TemplateEnvironment;

/**
 * @author D�niel D�k�ny
 * @version $Id: TestXmlLocalDataBuilder.java,v 1.1 2004/01/19 20:08:30 ddekany Exp $
 */
public class TestXmlLocalDataBuilder implements LocalDataBuilder {

    public Map build(Engine eng, TemplateEnvironment env) throws Exception {
        Document doc = (Document) env.getXmlDocument();
        
        Map ld = new HashMap();
        
        ld.put("a", doc.getDocumentElement().getLocalName());
        
        return ld;
    }
}