
name=NotificationSrv

cd ../src/$name

mvn clean install

java -jar target/$name-1.0.0.jar server config.yml

