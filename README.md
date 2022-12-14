# err0 gradle plugin

## testing locally

```
$ ./gradlew publishToMavenLocal
```

## to run the plugin - it is always manual

1) insert codes into your project: ```./gradlew err0-insert```
2) check codes are canonical, e.g. in build pipeline: ```./gradlew err0-check```

## include in your project

Just add the plugin `err0-gradle-plugin` to your plugins block.

## publishing to gradle plugin repo

https://docs.gradle.org/current/userguide/publishing_gradle_plugins.html

```
$ ./gradlew publishPlugins
```