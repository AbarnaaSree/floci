package io.github.hectorvent.floci.services.cognito.model;

public class EmailMfaSettings {

    private boolean enabled;
    private boolean preferredMfa;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isPreferredMfa() {
        return preferredMfa;
    }

    public void setPreferredMfa(boolean preferredMfa) {
        this.preferredMfa = preferredMfa;
    }
}