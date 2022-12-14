package io.err0.gradle;

import org.gradle.api.tasks.TaskAction;

public abstract class InsertTask extends Err0Task {

    @TaskAction
    void run() {
        Err0Wrapper wrapper = new Err0Wrapper(this);
        wrapper.call(new String[] { "--token", this.getToken(), "--insert", this.getBaseDir() });
    }

}
