# Шаблон для создания шаблонов

Референсы:
- [обзорная статья](https://dev.to/thilanka/creating-custom-archetypes-in-maven-16o0);
- [более подробная статья](https://javapro.io/2025/09/05/unleashing-the-power-of-maven-archetypes/);
- [документация](https://maven.apache.org/guides/mini/guide-creating-archetypes.html#1-create-a-new-project-and-pom-xml-for-the-archetype-artifact).

## Создать свой архетип

```sh
mvn archetype:generate \
  -DgroupId=ru.senioravanti \
  -DartifactId=archetype \
  -Dversion=1.0.0 \
  -DarchetypeArtifactId=maven-archetype-archetype
```

Где `artifactId` :: название генерируемого архетипа 

`mvn install` :: Установить архетип в локальный репозиторий.

## Создать проект на основе архетипа

Без префикса `archetype` указывают с-ва, определённые в archetype-metadata.xml

```sh
mvn archetype:generate \
  -DarchetypeGroupId=ru.senioravanti \
  -DarchetypeArtifactId=archetype \
  -DarchetypeVersion=1.0.0 \
  -DgroupId=ru.senioravanti.ml \
  -DartifactId=lab1
```
