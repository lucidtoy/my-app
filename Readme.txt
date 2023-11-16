# My-App Java Application

## Build Instructions using Jenkins

1. Open Jenkins: http://localhost:8080/
2. Create a new job with the following configuration:
   - Source Code Management: Git, Repository URL: your-repository-url
   - Build: Invoke top-level Maven targets, Goals: clean install
   - Post-Build Actions: Archive the artifacts, Files to archive: target/*.jar
3. Save the job and click on "Build Now" to trigger the build.
4. Monitor the build progress on the Jenkins job page.
5. If successful, the JAR file will be archived in the 'target' directory.
6. To run the application, use the following command:
   ##from command
   java -jar target/my-app-1.0-SNAPSHOT.jar
