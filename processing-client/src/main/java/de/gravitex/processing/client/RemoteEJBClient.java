/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.gravitex.processing.client;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import de.gravitex.processing.logic.TestRemote;

public class RemoteEJBClient {

    public static void main(String[] args) throws Exception {
      testRemote();
    }

    private static void testRemote() throws NamingException {
    	
        // Let's lookup the remote stateless calculator
        final TestRemote remote = lookupRemoteStatelessCalculator();
        remote.sayMoo();
    }

    @SuppressWarnings("unchecked")
	private static TestRemote lookupRemoteStatelessCalculator() throws NamingException {
    	
        final Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
        final Context context = new InitialContext(jndiProperties);

        return (TestRemote) context.lookup("ejb:/processing-server/TestBean!"
                + TestRemote.class.getName());
    }
}
