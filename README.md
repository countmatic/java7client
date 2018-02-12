# cm-java7client-v2

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.countmatic.api</groupId>
    <artifactId>cm-java7client-v2</artifactId>
    <version>2.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.countmatic.api:cm-java7client-v2:2.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/cm-java7client-v2-2.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.countmatic.api_v2.*;
import io.countmatic.api_v2.auth.*;
import io.countmatic.api_v2.model.*;
import io.countmatic.api_v2.CounterApi;

import java.io.File;
import java.util.*;

public class CounterApiExample {

    public static void main(String[] args) {
        
        CounterApi apiInstance = new CounterApi();
        String token = "token_example"; // String | Your access token
        String name = "name_example"; // String | The name of the counter
        Long initialvalue = 789L; // Long | Initial value for the counter, default is 0
        try {
            Counter result = apiInstance.addCounter(token, name, initialvalue);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CounterApi#addCounter");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.countmatic.io/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CounterApi* | [**addCounter**](docs/CounterApi.md#addCounter) | **GET** /counter/add | Add another counter for your access token, this makes it a so called \&quot;grouptoken\&quot;
*CounterApi* | [**deleteCounter**](docs/CounterApi.md#deleteCounter) | **GET** /counter/delete | Delete that counter without a trace
*CounterApi* | [**getCurrentReading**](docs/CounterApi.md#getCurrentReading) | **GET** /counter/current | Get current reading of the counters for that token
*CounterApi* | [**getNewCounter**](docs/CounterApi.md#getNewCounter) | **GET** /counter/new | Create new counter and retrieve an access token for it. All counters and tokens have a default TTL of one week. That means, that all data is removed automatically after one week of \&quot;uselessness\&quot;.
*CounterApi* | [**getReadOnlyToken**](docs/CounterApi.md#getReadOnlyToken) | **GET** /counter/readonly | Request read-only access token for that token
*CounterApi* | [**nextNumber**](docs/CounterApi.md#nextNumber) | **GET** /counter/next | Increment and get current reading of that counter
*CounterApi* | [**previousNumber**](docs/CounterApi.md#previousNumber) | **GET** /counter/previous | Decrement and get current reading of that counter
*CounterApi* | [**resetCounter**](docs/CounterApi.md#resetCounter) | **GET** /counter/reset | Reset that counter
*StatsApi* | [**getNumberOfCounters**](docs/StatsApi.md#getNumberOfCounters) | **GET** /stats/counters | Request the number of currently open counters on that countmatic backend
*StatsApi* | [**getServerInfo**](docs/StatsApi.md#getServerInfo) | **GET** /stats/serverinfo | Request information about the cm backend and its load


## Documentation for Models

 - [Counter](docs/Counter.md)
 - [Counters](docs/Counters.md)
 - [Error](docs/Error.md)
 - [ServerInfo](docs/ServerInfo.md)
 - [Token](docs/Token.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

countmaster@countmatic.io

