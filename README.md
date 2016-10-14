# Fedora RDF Vocabularies

This modules provides JAVA representations of certain common RDF vocabularies used in the Fedora Commons software.

Specific vocabularies include:

  * `Fedora`: `http://fedora.info/definitions/v4/repository#`
  * `Event`: `http://fedora.info/definitions/v4/event#`
  * `WebAC`: `http://fedora.info/definitions/v4/webac#`
  * `LDP`: `http://www.w3.org/ns/ldp#`
  * `PROV`: `http://www.w3.org/ns/prov#`

## Building

You can build and install this project with Maven:

    mvn install

## Including in your project

Maven (pom.xml)

    <dependency>
      <groupId>org.fcrepo</groupId>
      <artifactId>fcrepo-vocabulary</artifactId>
      <version>${fcrepo-vocabulary.version}</version>
    </dependency>

Gradle (build.gradle)

    dependencies {
        compile group: 'org.fcrepo', name: 'fcrepo-vocabulary', version: fcrepoVocabularyVersion
    }

## Maintainers

  * [Aaron Coburn](https://github.com/acoburn)

