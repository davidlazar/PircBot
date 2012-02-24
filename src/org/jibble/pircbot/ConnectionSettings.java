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
}
