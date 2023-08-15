# GaugeMobileAppTestAutomation

# **Requirements**

### Java Version > 10.0.2

### BDD Framework > Gauge-Java Version : 0.7.6

### Unit Testing Framework : Junit, Version : 4.13

### Java-Client : 7.3.0 (appium - selenium:3.141.59)

### Maven Project > Maven-Compiler-Plugin Version : 3.8.1

### Gauge-Maven-Plugin Version : 1.4.0

## [Todo List Android Mobile App Source Code Link ](https://github.com/android/architecture-samples/tree/todo-mvp)

# **Installing Instructions**
* [Gauge with IDE](https://docs.gauge.org/getting_started/installing-gauge?os=macos&language=java&ide=vscode) 
* [Gauge with Maven Plugin](https://github.com/getgauge-contrib/gauge-maven-plugin)

# **Running Tests with Maven**
* Executing specs
Run the below command to execute all specifications in specs directory

`mvn gauge:execute -DspecsDir=specs`
* Run the below command to execute a single specification

`mvn gauge:execute -DspecsDir=specs/example.spec`
* Run the below command to execute specifications in specs and specDir directories

`mvn gauge:execute -DspecsDir="specs,specDir"`
* Run the below command to execute the failed scenarios

`mvn gauge:execute -Dflags="--failed"`
* Run the below command to execute the repeat scenarios

`mvn gauge:execute -Dflags="--repeat"`
* Note mvn test-compile should be used for the tool to get latest changes of user code.

* Execute specs In parallel
`mvn gauge:execute -DspecsDir=specs -DinParallel=true`
* Execute specs by tags expression
`mvn gauge:execute -DspecsDir=specs -Dtags="!in-progress"`
* Execute spec by scenario name
`mvn gauge:execute -DspecsDir=specs -Dscenario="Scenario Name"`
* Specifying execution environment
`mvn gauge:execute -DspecsDir=specs -Denv="dev"`
