/*
 * Copyright 2010 JBoss, a divison Red Hat, Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.errai.bus.client.tests;

import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.MessageCallback;
import org.jboss.errai.bus.client.api.RemoteCallback;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.protocols.MessageParts;
import org.jboss.errai.bus.client.tests.support.RandomProvider;
import org.jboss.errai.bus.client.tests.support.SType;
import org.jboss.errai.bus.client.tests.support.TestRPCServiceRemote;

/**
 * User: christopherbrock
 * Date: 26-Jul-2010
 * Time: 3:21:22 PM
 */
public class BusCommunicationTests extends AbstractErraiTest {
    @Override
    public String getModuleName() {
        return "org.jboss.errai.bus.ErraiBusTests";
    }

    public void testBasicRoundTrip() {
        runAfterInit(new Runnable() {
            public void run() {
                bus.subscribe("MyTestService", new MessageCallback() {
                    public void callback(Message message) {
                        System.out.println("GOT ECHO");
                        finishTest();
                    }
                });

                MessageBuilder.createMessage()
                        .toSubject("ServerEchoService")
                        .with(MessageParts.ReplyTo, "MyTestService")
                        .done().sendNowWith(bus);
            }
        });

     }

    public static class GWTRandomProvider implements RandomProvider {
          private static char[] CHARS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                  'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

          public boolean nextBoolean() {
              return com.google.gwt.user.client.Random.nextBoolean();
          }

          public int nextInt(int upper) {
              return com.google.gwt.user.client.Random.nextInt(upper);
          }

          public double nextDouble() {
              return com.google.gwt.user.client.Random.nextDouble();
          }

          public char nextChar() {
              return CHARS[com.google.gwt.user.client.Random.nextInt(1000) % CHARS.length];
          }

          public String randString() {
              StringBuilder builder = new StringBuilder();
              int len = nextInt(25) + 5;
              for (int i = 0; i < len; i++) {
                  builder.append(nextChar());
              }
              return builder.toString();
          }
      }


    public void testSerializableCase() {
        runAfterInit(new Runnable() {
            public void run() {
                try {
                    final SType sType1 = SType.create(new GWTRandomProvider());
                    bus.subscribe("ClientReceiver", new MessageCallback() {
                        public void callback(Message message) {
                            SType type = message.get(SType.class, "SType");

                            try {
                                assertNotNull(type);
                                assertTrue(sType1.equals(type));
                                System.out.println("CLIENT: " + type.toString());
                                finishTest();
                                return;
                            }
                            catch (Throwable e) {
                                e.printStackTrace();

                            }
                            fail();
                        }
                    });

                    MessageBuilder.createMessage()
                            .toSubject("TestService1")
                            .with("SType", sType1)
                            .with(MessageParts.ReplyTo, "ClientReceiver")
                            .done().sendNowWith(bus);
                }
                catch (Throwable t) {
                    t.printStackTrace(System.out);
                }
            }
        });
    }

    public void testRPCCall() {
        runAfterInit(new Runnable() {
            public void run() {
                TestRPCServiceRemote remote = MessageBuilder.createCall(new RemoteCallback<Boolean>() {
                    int count = 0;
                    public void callback(Boolean response) {
                        ++count;
                        System.out.println("response (" + count + ")" + response);
                        assertTrue(response);
                        if (count == 3) finishTest();
                    }
                }, TestRPCServiceRemote.class);

                remote.isGreaterThan(10,5);
                remote.isGreaterThan(5,1);
                remote.isGreaterThan(11, 3);
            }
        });
    }
}
