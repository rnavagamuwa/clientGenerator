package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiInvoker;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DefaultApi {
  String basePath = "https://localhost";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Send userId to get details of the user
   * 
   * @param userId 
   * @return void
   */
  public void  abcWebresUsersPost (String userId) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
       throw new ApiException(400, "Missing the required parameter 'userId' when calling abcWebresUsersPost");
    }
    

    // create path and map variables
    String path = "/abc/webres/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/x-www-form-urlencoded"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (userId != null) {
        builder.addTextBody("userId", ApiInvoker.parameterToString(userId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("userId", ApiInvoker.parameterToString(userId));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * https://drive.google.com/file/d/0BxPZWaQn4WLaaXRWa1NTZjFKQjA/view
   * 
   * @param apiKey 
   * @param deviceId 
   * @param message 
   * @return void
   */
  public void  sendWebresSendPushPost (String apiKey, String deviceId, String message) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'apiKey' is set
    if (apiKey == null) {
       throw new ApiException(400, "Missing the required parameter 'apiKey' when calling sendWebresSendPushPost");
    }
    
    // verify the required parameter 'deviceId' is set
    if (deviceId == null) {
       throw new ApiException(400, "Missing the required parameter 'deviceId' when calling sendWebresSendPushPost");
    }
    

    // create path and map variables
    String path = "/send/webres/sendPush".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      
      if (apiKey != null) {
        builder.addTextBody("apiKey", ApiInvoker.parameterToString(apiKey), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (deviceId != null) {
        builder.addTextBody("DeviceId", ApiInvoker.parameterToString(deviceId), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      
      if (message != null) {
        builder.addTextBody("Message", ApiInvoker.parameterToString(message), ApiInvoker.TEXT_PLAIN_UTF8);
      }
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      formParams.put("apiKey", ApiInvoker.parameterToString(apiKey));
      formParams.put("DeviceId", ApiInvoker.parameterToString(deviceId));
      formParams.put("Message", ApiInvoker.parameterToString(message));
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
