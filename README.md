# EDI JAXB entities & EDI Schema

[smooks-edi-cartridge](https://github.com/smooks/smooks-edi-cartridge) is a powerful tool to read and write EDIFACT documents. 
The background of Smooks EDI Cartridge is generating standard EDIFACT XSD from UN EDIFACT specification documents. So now you can populate JAXB entities from the standard EDIFACT schemas.

However to accommodate customised EDIFACT message between EDI partners requires to modify either UN EDIFACT specification documents or Smooks standard schemas.

This project showing how to generate JAXB entity from modified schemas.    

### How do I get set up? ###

* Unpacking Smooks EDIFACT schemas
...maven-dependecy-plugin supports unpack artifacts from repository. The following example showing how to unpack EDIFACT schema from Smooks library by `mvn dependency:unpack'
```
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-dependency-plugin</artifactId>
	<version>3.1.2</version>
	<id>unpack</id>
	<phase>generate-sources</phase>
	<goals>
		<goal>unpack</goal>
	</goals>
	<configuration>
		<artifactItems>
			<artifactItem>
				<groupId>org.smooks.cartridges.edi</groupId>
				<artifactId>edi-schemas</artifactId>
				<outputDirectory>${project.build.directory}/generated-resources</outputDirectory>
			</artifactItem>
			<artifactItem>
				<groupId>org.smooks.cartridges.edi</groupId>
				<artifactId>edifact-schemas</artifactId>
				<classifier>d95b</classifier>
				<outputDirectory>${project.build.directory}/generated-resources</outputDirectory>
			</artifactItem>
		</artifactItems>
	</configuration>
</plugin>
```  

* Build EDIFACT schema from UN EDIFACT specifications
...Check it out [edifact-schemas](https://github.com/smooks/smooks-edi-cartridge/tree/master/edifact-schemas), you can have an ideas how to build the schema from EDIFACT specification.
...For example, you can add any custom code or qualifier in the specification to create new schema to reflect new code.
```
<plugin>
	<groupId>org.codehaus.mojo</groupId>
	<artifactId>exec-maven-plugin</artifactId>
	<version>3.0.0</version>
	<configuration>
		<mainClass>org.smooks.edi.edg.EdifactDfdlSchemaGenerator</mainClass>
		<addResourcesToClasspath>true</addResourcesToClasspath>
	</configuration>
	<executions>
		<execution>
			<id>generate-schemas</id>
			<phase>generate-resources</phase>
			<goals>
				<goal>java</goal>
			</goals>
			<configuration>
				<arguments>                                
					<argument>/d03b.zip,org.smooks.edi.ect.formats.unedifact.parser.UnEdifactDirectoryParser</argument>
					<argument>/d95b.zip,org.smooks.edi.ect.formats.unedifact.parser.D95BDirectoryParser</argument>
					<argument>/d96a.zip,org.smooks.edi.ect.formats.unedifact.parser.D96ADirectoryParser</argument>
					<argument>${project.build.directory}/classes</argument>
				</arguments>
				<includePluginDependencies>true</includePluginDependencies>
			</configuration>
		</execution>
	</executions>
	<dependencies>
		<dependency>
			<groupId>org.smooks.cartridges.edi</groupId>
			<artifactId>smooks-edg</artifactId>
			<version>${project.version}</version>
		</dependency>
		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-slf4j-impl</artifactId>
			<version>${log4j-slf4j-imp.version}</version>
		</dependency>
	</dependencies>
</plugin>
```

* Create sub module and copy unpacked artifacts 'EDIFACT-XXX.dfdl.xsd' in the resources directory
...pom of module include `schema.pack.classifier` property to identify the version of EDIFACT schema.

* JAXB objects are packaged in jar.
```
mvn clean compile -Djdk.xml.maxOccurLimit=0
```
