package com.focusit.queuedispatcher;

import hudson.Extension;
import hudson.model.Descriptor;
import jenkins.model.GlobalConfiguration;
import net.sf.json.JSONObject;
import org.kohsuke.stapler.StaplerRequest;

import java.util.logging.Logger;

/**
 * Created by doki on 11.10.17.
 */
@Extension
public class GlobalQueueDispatcherConfig extends GlobalConfiguration {
    private static final Logger LOGGER = Logger.getLogger(Descriptor.class.getName());
    private String canTakeScript;
    private String canRunScript;

    public GlobalQueueDispatcherConfig() {
        load();
    }

    @Override
    public boolean configure(StaplerRequest req, JSONObject json) throws FormException {
        req.bindJSON(this,json);
        save();
        return true;
    }

    public String getCanTakeScript() {
        return canTakeScript;
    }

    public void setCanTakeScript(String canTakeScript) {
        this.canTakeScript = canTakeScript;
    }

    public String getCanRunScript() {
        return canRunScript;
    }

    public void setCanRunScript(String canRunScript) {
        this.canRunScript = canRunScript;
    }
}
