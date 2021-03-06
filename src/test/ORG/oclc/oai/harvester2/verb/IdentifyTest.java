/**
 Copyright 2006 OCLC, Online Computer Library Center
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
 http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package test.ORG.oclc.oai.harvester2.verb;

import junit.framework.TestCase;
import ORG.oclc.oai.harvester2.verb.Identify;

public class IdentifyTest extends TestCase {
    public IdentifyTest(String name) {
        super(name);
    }
    
    public void test11() {
        try {
            Identify identify = new Identify("http://scholar.lib.vt.edu/theses/OAI/cgi-bin/index.pl");
            assertTrue("1.1".equals(identify.getProtocolVersion()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void test20() {
        try {
            Identify identify = new Identify("http://alcme.oclc.org/xtcat/servlet/OAIHandler");
            assertTrue("2.0".equals(identify.getProtocolVersion()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void testhttps() {
        try {
            Identify identify = new Identify("https://dspace.mit.edu/dspace-oai/request");
            assertTrue("2.0".equals(identify.getProtocolVersion()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
