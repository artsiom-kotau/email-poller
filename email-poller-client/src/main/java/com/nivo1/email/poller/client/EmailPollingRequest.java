package com.nivo1.email.poller.client;

public class EmailPollingRequest {
    private String emailUsername;
    private String emailServerHost;
    private String emailServerProtocol;
    private String emailServerPort;
    private String emailPassword;
    private String emailHost;

    public String getEmailUsername() {
        return emailUsername;
    }

    public void setEmailUsername(String emailUsername) {
        this.emailUsername = emailUsername;
    }

    public String getEmailServerHost() {
        return emailServerHost;
    }

    public void setEmailServerHost(String emailServerHost) {
        this.emailServerHost = emailServerHost;
    }

    public String getEmailServerProtocol() {
        return emailServerProtocol;
    }

    public void setEmailServerProtocol(String emailServerProtocol) {
        this.emailServerProtocol = emailServerProtocol;
    }

    public String getEmailServerPort() {
        return emailServerPort;
    }

    public void setEmailServerPort(String emailServerPort) {
        this.emailServerPort = emailServerPort;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    public String getEmailHost() {
        return emailHost;
    }

    public void setEmailHost(String emailHost) {
        this.emailHost = emailHost;
    }
}
