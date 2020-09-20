# maven-project-deploy-to-jfrog-artifactory example


This is an example to deploy our project a custom printer that print string with author name and date to an artifactory (jfrog) for reusing

## How to Run
``Clone the Repo first and open as a maven project. Install and setup jfrog artifactory. I used opensource windows installation. Add below server settings in settings.xml in maven. Change username and passwords as given in Artifactory user``

    <servers>
    	<server>
    		  <id>central</id>
    		  <username>admin</username>
    		  <password>123456789</password>
    	</server>
    </servers>

Then use command ``mvn deploy``

Then I can use the repository in future developments by simply adding maven dependency and remote repository like below

        <dependencies>
            <dependency>
                <groupId>com.hishan.printers</groupId>
                <artifactId>custom-printer</artifactId>
                <version>2</version>
            </dependency>
        </dependencies>
        
        <repositories>
            <repository>
                <id>central</id>
                <url>http://localhost:8081/artifactory/libs-release</url>
            </repository>
        </repositories>