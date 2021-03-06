# cm-java7client-v2

countmatic api
- API version: 2.0.2
  - Build date: 2018-02-12T17:36:10.819Z

countmatic is a service to provide counters as web service. Sure, counters are simple artefacts of IT systems. But they are part of *every* system. There are numerous use cases where you need distributed enumerators in IoT manufacturing or i.e. production reporting.    Find out more [https://countmatic.io](https://countmatic.io).


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle# cm-java7client-v2


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

package io.countmtic.test;

import io.countmatic.api.v2.ApiException;
import io.countmatic.api.v2.CounterApi;
import io.countmatic.api.v2.model.Counter;
import io.countmatic.api.v2.model.Counters;
import io.countmatic.api.v2.model.Token;

public class JavaTestclient {

	static final String COUNTER_NAME = "JavaTestCounter";
	static final String ANOTHER_COUNTER = "AnotherJavaTestCounter";
	
	public static void main(String[] args) throws ApiException {
		// get a api client
		CounterApi counterApi = new CounterApi();
		System.out.println("Testing countmatic.io");
		
		// create a new counter
		Token token = counterApi.getNewCounter(COUNTER_NAME, 10l);
		System.out.println("\n(1) Got a token: " + token.getToken());
		
		// increment counter
		Counter counter = counterApi.nextNumber(token.getToken(), COUNTER_NAME, 1l);
		System.out.println("\n(2) Got a counter: " + counter.toString());		
		
		// add another counter with 42 initial
		counter = counterApi.addCounter(token.getToken(), ANOTHER_COUNTER, 42l);
		System.out.println("\n(3) Got another counter: " + counter.toString());	
		
		// get readonly token
		Token readonlyToken = counterApi.getReadOnlyToken(token.getToken());
		System.out.println("\n(4) Got a readonly-token: " + readonlyToken.getToken());
		
		// read the current values with the readonly token
		Counters counters = counterApi.getCurrentReading(readonlyToken.getToken(), null);
		System.out.println("\n(5) Got some readings: " + counters.toString());	
		
	}

}

```

Output will be similar to this

```

Testing countmatic.io

(1) Got a token: 0c6d0737-b81c-43f2-909b-f1578daba785-rw

(2) Got a counter: class Counter {
    name: JavaTestCounter
    count: 11
    modified: 0
}

(3) Got another counter: class Counter {
    name: AnotherJavaTestCounter
    count: 42
    modified: 1518446153593
}

(4) Got a readonly-token: 5c02c4fd-32e7-4b8a-af12-2c0c5b8e0974-ro

(5) Got some readings: class Counters {
    [class Counter {
        name: JavaTestCounter
        count: 11
        modified: 1518446153566
    }, class Counter {
        name: AnotherJavaTestCounter
        count: 42
        modified: 1518446153593
    }]
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

