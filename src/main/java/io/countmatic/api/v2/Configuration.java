/*
 * countmatic api
 * countmatic is a service to provide counters as web service. Sure, counters are simple artefacts of IT systems. But they are part of *every* system. There are numerous use cases where you need distributed enumerators in IoT manufacturing or i.e. production reporting.    Find out more [https://countmatic.io](https://countmatic.io).
 *
 * OpenAPI spec version: 2.0.2
 * Contact: countmaster@countmatic.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.countmatic.api.v2;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-13T08:49:11.883+01:00")
public class Configuration {
    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
