package io.err0.gradle;

import org.gradle.api.tasks.TaskAction;

public class CheckTask  extends Err0Task {

    @TaskAction
    void run() {
        Err0Wrapper wrapper = new Err0Wrapper(this);
        wrapper.call(new String[] { "--token", this.getToken(), "--analyse", "--check", this.getBaseDir() });
    }

}
