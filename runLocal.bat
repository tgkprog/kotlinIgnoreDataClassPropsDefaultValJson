set AWS_ACCESS_KEY_ID=anyKeyForLocal
set AWS_SECRET_ACCESS_KEY=AnySecretForLocal
set AWS_DEFAULT_REGION=us-west-2
set MICRONAUT_ENVIRONMENTS=local
set ENV=local
rem gradlew clean -x test run
rem # gradlew clean build run
rem # gradlew clean build -x test 
rem # gradlew clean build 
rem # gradlew clean build -x test run
gradlew run