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


package io.countmatic.api_v2;

import io.countmatic.api_v2.ApiCallback;
import io.countmatic.api_v2.ApiClient;
import io.countmatic.api_v2.ApiException;
import io.countmatic.api_v2.ApiResponse;
import io.countmatic.api_v2.Configuration;
import io.countmatic.api_v2.Pair;
import io.countmatic.api_v2.ProgressRequestBody;
import io.countmatic.api_v2.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.countmatic.api_v2.model.Counter;
import io.countmatic.api_v2.model.Error;
import io.countmatic.api_v2.model.ServerInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatsApi {
    private ApiClient apiClient;

    public StatsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StatsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getNumberOfCounters
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getNumberOfCountersCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stats/counters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getNumberOfCountersValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getNumberOfCountersCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Request the number of currently open counters on that countmatic backend
     * 
     * @return Counter
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Counter getNumberOfCounters() throws ApiException {
        ApiResponse<Counter> resp = getNumberOfCountersWithHttpInfo();
        return resp.getData();
    }

    /**
     * Request the number of currently open counters on that countmatic backend
     * 
     * @return ApiResponse&lt;Counter&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Counter> getNumberOfCountersWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getNumberOfCountersValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Counter>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Request the number of currently open counters on that countmatic backend (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNumberOfCountersAsync(final ApiCallback<Counter> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getNumberOfCountersValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Counter>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getServerInfo
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getServerInfoCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/stats/serverinfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getServerInfoValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getServerInfoCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Request information about the cm backend and its load
     * 
     * @return ServerInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ServerInfo getServerInfo() throws ApiException {
        ApiResponse<ServerInfo> resp = getServerInfoWithHttpInfo();
        return resp.getData();
    }

    /**
     * Request information about the cm backend and its load
     * 
     * @return ApiResponse&lt;ServerInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ServerInfo> getServerInfoWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getServerInfoValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ServerInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Request information about the cm backend and its load (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getServerInfoAsync(final ApiCallback<ServerInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getServerInfoValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ServerInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}