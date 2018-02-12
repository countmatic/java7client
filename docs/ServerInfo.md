
# ServerInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**server** | **String** | the server software running at the backend |  [optional]
**persistentBackend** | **String** | the software used for persistent data |  [optional]
**volatileBackend** | **String** | the software used to keep volatile data |  [optional]
**apiVersion** | **String** | the countmatic API version of this server |  [optional]
**maxNamesPerToken** | **Long** | maximum number of counters in a grouptoken |  [optional]
**capacityLoad** | **Integer** | capacity load of the server at a scale of 0-100 |  [optional]
**runtimeLoad** | **Integer** | performance load of the server at a scale of 0-100 |  [optional]
**currentCounters** | **Long** | number of active counters in that server |  [optional]
**maxCounters** | **Long** | limit of active counters that server can manage (or 0 for unlimited) |  [optional]



