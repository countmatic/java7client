# CounterApi

All URIs are relative to *https://api.countmatic.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCounter**](CounterApi.md#addCounter) | **GET** /counter/add | Add another counter for your access token, this makes it a so called \&quot;grouptoken\&quot;
[**deleteCounter**](CounterApi.md#deleteCounter) | **GET** /counter/delete | Delete that counter without a trace
[**getCurrentReading**](CounterApi.md#getCurrentReading) | **GET** /counter/current | Get current reading of the counters for that token
[**getNewCounter**](CounterApi.md#getNewCounter) | **GET** /counter/new | Create new counter and retrieve an access token for it. All counters and tokens have a default TTL of one week. That means, that all data is removed automatically after one week of \&quot;uselessness\&quot;.
[**getReadOnlyToken**](CounterApi.md#getReadOnlyToken) | **GET** /counter/readonly | Request read-only access token for that token
[**nextNumber**](CounterApi.md#nextNumber) | **GET** /counter/next | Increment and get current reading of that counter
[**previousNumber**](CounterApi.md#previousNumber) | **GET** /counter/previous | Decrement and get current reading of that counter
[**resetCounter**](CounterApi.md#resetCounter) | **GET** /counter/reset | Reset that counter


<a name="addCounter"></a>
# **addCounter**
> Counter addCounter(token, name, initialvalue)

Add another counter for your access token, this makes it a so called \&quot;grouptoken\&quot;

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |
 **name** | **String**| The name of the counter |
 **initialvalue** | **Long**| Initial value for the counter, default is 0 | [optional]

### Return type

[**Counter**](Counter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteCounter"></a>
# **deleteCounter**
> Counter deleteCounter(token, name)

Delete that counter without a trace

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String token = "token_example"; // String | Your access token
String name = "name_example"; // String | Optionally the name of the requested counter, mandatory for grouptokens
try {
    Counter result = apiInstance.deleteCounter(token, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#deleteCounter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |
 **name** | **String**| Optionally the name of the requested counter, mandatory for grouptokens | [optional]

### Return type

[**Counter**](Counter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentReading"></a>
# **getCurrentReading**
> Counters getCurrentReading(token, name)

Get current reading of the counters for that token

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String token = "token_example"; // String | Your access token
String name = "name_example"; // String | Optionally the name of the requested counter
try {
    Counters result = apiInstance.getCurrentReading(token, name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#getCurrentReading");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |
 **name** | **String**| Optionally the name of the requested counter | [optional]

### Return type

[**Counters**](Counters.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getNewCounter"></a>
# **getNewCounter**
> Token getNewCounter(name, initialvalue)

Create new counter and retrieve an access token for it. All counters and tokens have a default TTL of one week. That means, that all data is removed automatically after one week of \&quot;uselessness\&quot;.

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String name = "name_example"; // String | The name of the counter
Long initialvalue = 789L; // Long | Initial value for the counter, default is 0
try {
    Token result = apiInstance.getNewCounter(name, initialvalue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#getNewCounter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the counter |
 **initialvalue** | **Long**| Initial value for the counter, default is 0 | [optional]

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReadOnlyToken"></a>
# **getReadOnlyToken**
> Token getReadOnlyToken(token)

Request read-only access token for that token

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String token = "token_example"; // String | Your access token
try {
    Token result = apiInstance.getReadOnlyToken(token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#getReadOnlyToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |

### Return type

[**Token**](Token.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="nextNumber"></a>
# **nextNumber**
> Counter nextNumber(token, name, increment)

Increment and get current reading of that counter

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String token = "token_example"; // String | Your access token
String name = "name_example"; // String | Optionally the name of the requested counter, mandatory for grouptokens
Long increment = 789L; // Long | Value to add to the current counter's value, default is 1
try {
    Counter result = apiInstance.nextNumber(token, name, increment);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#nextNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |
 **name** | **String**| Optionally the name of the requested counter, mandatory for grouptokens | [optional]
 **increment** | **Long**| Value to add to the current counter&#39;s value, default is 1 | [optional]

### Return type

[**Counter**](Counter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="previousNumber"></a>
# **previousNumber**
> Counter previousNumber(token, name, decrement)

Decrement and get current reading of that counter

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String token = "token_example"; // String | Your access token
String name = "name_example"; // String | Optionally the name of the requested counter, mandatory for grouptokens
Long decrement = 789L; // Long | Value to substract from the counter's current value, default is 1
try {
    Counter result = apiInstance.previousNumber(token, name, decrement);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#previousNumber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |
 **name** | **String**| Optionally the name of the requested counter, mandatory for grouptokens | [optional]
 **decrement** | **Long**| Value to substract from the counter&#39;s current value, default is 1 | [optional]

### Return type

[**Counter**](Counter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="resetCounter"></a>
# **resetCounter**
> Counter resetCounter(token, name, initialvalue)

Reset that counter

### Example
```java
// Import classes:
//import io.countmatic.api.v2.ApiException;
//import io.countmatic.api.v2.CounterApi;


CounterApi apiInstance = new CounterApi();
String token = "token_example"; // String | Your access token
String name = "name_example"; // String | Optionally the name of the requested counter, mandatory for grouptokens
Long initialvalue = 789L; // Long | New value for the counter, default is 1
try {
    Counter result = apiInstance.resetCounter(token, name, initialvalue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CounterApi#resetCounter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Your access token |
 **name** | **String**| Optionally the name of the requested counter, mandatory for grouptokens | [optional]
 **initialvalue** | **Long**| New value for the counter, default is 1 | [optional]

### Return type

[**Counter**](Counter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

