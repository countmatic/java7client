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

import io.countmatic.api.v2.ApiException;
import io.countmatic.api.v2.model.Counter;
import io.countmatic.api.v2.model.Counters;
import io.countmatic.api.v2.model.Error;
import io.countmatic.api.v2.model.Token;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CounterApi
 */
@Ignore
public class CounterApiTest {

    private final CounterApi api = new CounterApi();

    
    /**
     * Add another counter for your access token, this makes it a so called \&quot;grouptoken\&quot;
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addCounterTest() throws ApiException {
        String token = null;
        String name = null;
        Long initialvalue = null;
        Counter response = api.addCounter(token, name, initialvalue);

        // TODO: test validations
    }
    
    /**
     * Delete that counter without a trace
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCounterTest() throws ApiException {
        String token = null;
        String name = null;
        Counter response = api.deleteCounter(token, name);

        // TODO: test validations
    }
    
    /**
     * Get current reading of the counters for that token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrentReadingTest() throws ApiException {
        String token = null;
        String name = null;
        Counters response = api.getCurrentReading(token, name);

        // TODO: test validations
    }
    
    /**
     * Create new counter and retrieve an access token for it. All counters and tokens have a default TTL of one week. That means, that all data is removed automatically after one week of \&quot;uselessness\&quot;.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNewCounterTest() throws ApiException {
        String name = null;
        Long initialvalue = null;
        Token response = api.getNewCounter(name, initialvalue);

        // TODO: test validations
    }
    
    /**
     * Request read-only access token for that token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getReadOnlyTokenTest() throws ApiException {
        String token = null;
        Token response = api.getReadOnlyToken(token);

        // TODO: test validations
    }
    
    /**
     * Increment and get current reading of that counter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void nextNumberTest() throws ApiException {
        String token = null;
        String name = null;
        Long increment = null;
        Counter response = api.nextNumber(token, name, increment);

        // TODO: test validations
    }
    
    /**
     * Decrement and get current reading of that counter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void previousNumberTest() throws ApiException {
        String token = null;
        String name = null;
        Long decrement = null;
        Counter response = api.previousNumber(token, name, decrement);

        // TODO: test validations
    }
    
    /**
     * Reset that counter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetCounterTest() throws ApiException {
        String token = null;
        String name = null;
        Long initialvalue = null;
        Counter response = api.resetCounter(token, name, initialvalue);

        // TODO: test validations
    }
    
}