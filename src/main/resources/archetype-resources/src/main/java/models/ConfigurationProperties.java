package ${package}.models;

public record ConfigurationProperties(
    App app,
    Loggers loggers
) {
    public record App (
        String groupId,
        String artifactId,
        String version
    ){
    }

    public record Loggers (
        Integer maxExternalFrames,
        Integer maxCauseDepth
    ){
    }
}
