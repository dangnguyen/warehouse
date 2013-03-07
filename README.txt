 start orbd -ORBInitialPort 1050
 java -classpath ";mysql-connector-java-5.1.23-bin.jar" WServer -ORBInitialPort 1050 -ORBInitialHost localhost&
 java HelloClient -ORBInitialPort 1050 -ORBInitialHost localhost
 idlj -pkgPrefix Warehouse java_code -fall Hello.idl
 javac *.java java_code/Warehouse/*.java