## Instructions

in termima;
mvn clean install
mvn install archetype:update-local-catalog
mvn archetype:crawl

in intellij
Create new project
select new archetype
enter

        version=3.0.2 (what ever the version is)
        groupId=com.hanfak.starter-project-archetype
        artifactId=starter-project-archetype

Choose correct version

Fill in details in popup

## TODO

- setup static analysis in maven, so they can run via command line