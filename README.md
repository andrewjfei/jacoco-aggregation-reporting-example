# JaCoCo Aggregation Reporting Example

This is an example of how **JaCoCo** can be used to generate an aggregated code coverage report for a multiple module 
project.

The project consists of three modules, two being "actual" modules with code implementation and one being an empty
aggregate module. The module names are listed below:

- `module-aggregate`
- `module-one`
- `module-two`

## Prerequisites

- JDK 17
- Maven 3.X.X

## Getting Started

Run `mvn clean install` to build the project. This will generate the individual module reports, as well as the
aggregated report for the entire project. All reports are located at `../target/jacoco/index.html` within their
respective modules.

## Notes

### 03-02-2023

- Currently, there is no way of running code coverage on an aggregated view of a multiple module project.
