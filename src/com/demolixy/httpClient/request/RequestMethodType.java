/**
 * 
 */
package com.demolixy.httpClient.request;

/**
 * @author lixy
 *
 */
public enum RequestMethodType {
    
    PUT("PUT"),
    GET("GET"),
    DELETE("DELETE"),
    POST("POST"),
    HEAD("HEAD");
    
    private String methodName;
    
    private RequestMethodType(String methodName) {
        this.methodName = methodName;
    }

    /**
     * @return the methodName
     */
    public String getMethodName() {
        return methodName;
    }

}
