package example;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Collections;

public class Main {
    public static void main(final String[] args) {
        Project project = null;
        project = new Project("mydomain",
                "mydomain.com",
                Collections.singletonList(new Website("www", "web"))
                );
        App app = new App();
        new AppStack(project, app, project.getName() + "AppStack", StackProps.builder()
                .env(Environment.builder()
                        .account(System.getenv("CDK_DEFAULT_ACCOUNT"))
                        .region(System.getenv("CDK_DEFAULT_REGION"))
                        .build())
                .build());
        app.synth();
    }
}
