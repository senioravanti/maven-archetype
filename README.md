# Шаблон для создания шаблонов

Референсы:
- [обзорная статья](https://dev.to/thilanka/creating-custom-archetypes-in-maven-16o0);
- [более подробная статья](https://javapro.io/2025/09/05/unleashing-the-power-of-maven-archetypes/);
- [документация](https://maven.apache.org/guides/mini/guide-creating-archetypes.html#1-create-a-new-project-and-pom-xml-for-the-archetype-artifact).

```sh
clear
mvn archetype:generate \
  -DgroupId=ru.senioravanti \
  -DartifactId=archetype \
  -Dversion=1.0.0 \
  -DarchetypeArtifactId=maven-archetype-archetype
```
