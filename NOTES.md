# Notes

# Servidor postgresql

```
docker run --name hotel-reservation-postgres -e POSTGRES_PASSWORD=mysecretpassword -d -p 5432:5432 postgres:13
```

# Usuario de testing

```
firstuser@ces.com.uy
firstuser
gslcrpEg1jaHJvb0UyBg
```

# Ejecución de test por tag

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.22.2</version>
            <configuration>
                <includes>
                    <include>@Tag("sanity")</include>
                </includes>
            </configuration>
        </plugin>
    </plugins>
</build>

```


```bash
mvn test -Dgroups=sanity

```



