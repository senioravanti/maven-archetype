package ${package}.models;

public record ConfigurationProperties(
    App app
) {
    public record App(
        String groupId,
        String artifactId,
        String version
    ) {
    }
}
