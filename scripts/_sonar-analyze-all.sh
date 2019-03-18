cd ../src/CategorySrv/
mvn sonar:sonar
cd ../src/CustomerSrv/
mvn sonar:sonar
cd ../src/NotificationSrv/
mvn sonar:sonar
cd ../src/OrderSrv/
mvn sonar:sonar
cd ../src/ProductSrv/
mvn sonar:sonar
cd ../src/WarehouseSrv/
mvn sonar:sonar

# does not exist in workspace version 1:
cd ../src/OrderProcessSrv/
mvn sonar:sonar
cd ../src/ProductSrvFacade/
mvn sonar:sonar
