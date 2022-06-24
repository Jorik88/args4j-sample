## args4j-sample

### This application is an example of parsing command line arguments with args4j library.

# How to build executable jar
``
mvn clean compile assembly:single
``
# Some command examples
In the next command we need to specify `-dbName` argument because it marked as required <br />

``java -jar args4j-sample-1.0-SNAPSHOT.jar -dbName test1``

In the next command we will override default value for `tableName` configuration <br />

``java -jar args4j-sample-1.0-SNAPSHOT.jar -dbName test1 -tableName new_table_name``

We also could specify arguments with `=`sign <br />

``java -jar args4j-sample-1.0-SNAPSHOT.jar -dbName=test1 -tableName=new_table_name``

# All configuration parameters
| Parameter Name  | Required  |  Default Value |  Example | Description  |
|:---:|:---:|:---:|:---:|:---:|
| dbName | YES | N/A | weather  | database name  |
| tableName | NO | some_table_name | stations  | table name  |
| enableLogging | NO | false | true  | switch for logging  |
| counter | NO | 2 | any number  | some counter  |

## Documentation
Library docs https://args4j.kohsuke.org/ <br />
More examples https://github.com/kohsuke/args4j/blob/master/args4j/examples/SampleMain.java 
