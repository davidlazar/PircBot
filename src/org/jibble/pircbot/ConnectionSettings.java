/*
Author: David Lazar
*/
package org.jibble.pircbot;

public class ConnectionSettings {
    public String server = null;
    public int port = 6667;
    public boolean useSSL = false;
    public boolean verifySSL = false;
    public String password = null;

    public ConnectionSettings(String server) {
        this.server = server;
    }

    public ConnectionSettings clone() {
        ConnectionSettings cs = new ConnectionSettings(server);
        cs.port = port;
        cs.useSSL = useSSL;
        cs.verifySSL = verifySSL;
        cs.password = password;
        return cs;
    }
}
