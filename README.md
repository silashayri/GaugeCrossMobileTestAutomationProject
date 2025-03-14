# GaugeCrossMobileTestAutomation  

## **Requirements**  

- **Java Version** > 10.0.2  
- **BDD Framework** > Gauge-Java Version: 0.7.6  
- **Unit Testing Framework**: JUnit, Version: 4.13  
- **Java-Client**: 7.3.0 (Appium - Selenium: 3.141.59)  
- **Maven Project** > Maven-Compiler-Plugin Version: 3.8.1  
- **Gauge-Maven-Plugin** Version: 1.4.0  

## [Todo List Android Mobile App Source Code](https://github.com/android/architecture-samples/tree/todo-mvp)  

## **Installation Instructions**  

- [Gauge with IDE](https://docs.gauge.org/getting_started/installing-gauge?os=macos&language=java&ide=vscode)  
- [Gauge with Maven Plugin](https://github.com/getgauge-contrib/gauge-maven-plugin)  

## **Running Tests with Maven**  

### Executing Specs  

- Run the command below to execute all specifications in the `specs` directory:  
  ```sh
  mvn gauge:execute -DspecsDir=specs