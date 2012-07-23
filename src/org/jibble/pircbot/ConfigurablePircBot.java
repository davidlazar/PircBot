/*
Author: David Lazar
*/
package org.jibble.pircbot;

import java.io.*;
import org.apache.commons.configuration.*;

public abstract class ConfigurablePircBot extends PircBot {
    private Configuration configuration;

    public Configuration getConfiguration() {
        return configuration;
    }

    public void initBot(String fileName) throws Exception {
        initBot(new File(fileName));
    }

    public void initBot(File file) throws Exception {
        PropertiesConfiguration c = new PropertiesConfiguration();
        c.setDelimiterParsingDisabled(true);
        c.load(file);
        initBot(c);
    }

    public void initBot(Configuration c) throws Exception {
        this.configuration = c;

        if (c.containsKey("Verbose")) {
            setVerbose(c.getBoolean("Verbose"));
        }

        if (c.containsKey("Nick")) {
            setName(c.getString("Nick"));
        }

        if (c.containsKey("UserName")) {
            setUserName(c.getString("UserName"));
        }

        if (c.containsKey("RealName")) {
            setRealName(c.getString("RealName"));
        }

        if (c.containsKey("Version")) {
            setVersion(c.getString("Version"));
        }

        if (c.containsKey("Finger")) {
            setFinger(c.getString("Finger"));
        }

        if (c.containsKey("Server")) {
            ConnectionSettings cs = new ConnectionSettings(c.getString("Server"));

            if (c.containsKey("Port")) {
                cs.port = c.getInt("Port");
            }

            if (c.containsKey("SSL")) {
                cs.useSSL = c.getBoolean("SSL");
            }

            if (c.containsKey("VerifySSL")) {
                cs.verifySSL = c.getBoolean("VerifySSL");
            }

            if (c.containsKey("Password")) {
                cs.password = c.getString("Password");
            }

            connect(cs);

            if (c.containsKey("Channels")) {
                joinChannel(c.getString("Channels"));
            }
        }
    }
}
