cd ../src/CategorySrv/
mvn clean verify sonar:sonar
cd ../src/CustomerSrv/
mvn clean verify sonar:sonar
cd ../src/NotificationSrv/
mvn clean verify sonar:sonar
cd ../src/OrderSrv/
mvn clean verify sonar:sonar
cd ../src/ProductSrv/
mvn clean verify sonar:sonar
cd ../src/WarehouseSrv/
mvn clean verify sonar:sonar

# does not exist in workspace version 1:
cd ../src/OrderProcessSrv/
mvn clean verify sonar:sonar
cd ../src/ProductSrvFacade/
mvn clean verify sonar:sonar
