# Petclinic Tests

Additional tests for [Spring Petclinic](https://github.com/spring-projects/spring-petclinic)

## Selenium

Uses the FireFox Driver (requires FireFox and geckodriver).
Run with:
```
cd selenium; gradle -Dbase.url=http://localhost:8080/petclinic - test
```

## Gatling

Uses the Gatling Tool to run stress test.
Run with:
```
./gradlew -Dbase.url=http://192.168.33.100:8080/petclinic gatling
```
