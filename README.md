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

* Create sub module and copy unpacked artifacts 'EDIFACT-XXX.dfdl.xsd' in the resources directory
...pom of module include `schema.pack.classifier` property to identify the version of EDIFACT schema.

* JAXB objects are packaged in jar.
```
mvn clean compile -Djdk.xml.maxOccurLimit=0
```
