# Build
mvn clean package && docker build -t com.mycompany/stockcontrol .

# RUN

docker rm -f stockcontrol || true && docker run -d -p 8080:8080 -p 4848:4848 --name stockcontrol com.mycompany/stockcontrol 

# System Test

Switch to the "-st" module and perform:

mvn compile failsafe:integration-test