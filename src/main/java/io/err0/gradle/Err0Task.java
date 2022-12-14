package io.err0.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;

import java.io.File;

public abstract class Err0Task extends DefaultTask {

    @Internal
    public String getBaseDir() {
        return getProject().hasProperty("err0.basedir") ? ((String)getProject().property("err0.basedir")) : ".";
    }

    @Internal
    public String getToken() {
        if (! getProject().hasProperty("err0.token")) {
            throw new Err0Exception("gradle.properties property err0.token not defined, please add path to err0 token json.");
        }
        return (String) getProject().property("err0.token");
    }

    @Internal
    public String getAgentDirectory() {
        return getProject().hasProperty("err0.agentdir") ? ((String)getProject().property("err0.agentdir")) : "build";
    }

    @Internal
    public final String getErr0AgentJar() {
        return this.getAgentDirectory() + File.separator + "err0agent-java_1_8-fat.jar";
    }

}
