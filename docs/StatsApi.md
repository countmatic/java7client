# StatsApi

All URIs are relative to *https://api.countmatic.io/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNumberOfCounters**](StatsApi.md#getNumberOfCounters) | **GET** /stats/counters | Request the number of currently open counters on that countmatic backend
[**getServerInfo**](StatsApi.md#getServerInfo) | **GET** /stats/serverinfo | Request information about the cm backend and its load


<a name="getNumberOfCounters"></a>
# **getNumberOfCounters**
> Counter getNumberOfCounters()

Request the number of currently open counters on that countmatic backend

### Example
```java
// Import classes:
//import io.countmatic.api_v2.ApiException;
//import io.countmatic.api_v2.StatsApi;


StatsApi apiInstance = new StatsApi();
try {
    Counter result = apiInstance.getNumberOfCounters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#getNumberOfCounters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Counter**](Counter.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getServerInfo"></a>
# **getServerInfo**
> ServerInfo getServerInfo()

Request information about the cm backend and its load

### Example
```java
// Import classes:
//import io.countmatic.api_v2.ApiException;
//import io.countmatic.api_v2.StatsApi;


StatsApi apiInstance = new StatsApi();
try {
    ServerInfo result = apiInstance.getServerInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatsApi#getServerInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ServerInfo**](ServerInfo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

