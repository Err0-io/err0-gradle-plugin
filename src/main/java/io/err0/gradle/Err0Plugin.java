package io.err0.gradle;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class Err0Plugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().register("err0-insert", InsertTask.class);
        project.getTasks().register("err0-check", CheckTask.class);
    }
}