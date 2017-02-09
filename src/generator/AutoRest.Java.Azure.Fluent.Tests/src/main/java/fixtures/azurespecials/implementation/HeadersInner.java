/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import fixtures.azurespecials.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Headers.
 */
public class HeadersInner {
    /** The Retrofit service to perform REST calls. */
    private HeadersService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of HeadersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HeadersInner(Retrofit retrofit, AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = retrofit.create(HeadersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Headers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeadersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestId" })
        @POST("azurespecials/customNamedRequestId")
        Observable<Response<ResponseBody>> customNamedRequestId(@Header("foo-client-request-id") String fooClientRequestId, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: fixtures.azurespecials.Headers customNamedRequestIdParamGrouping" })
        @POST("azurespecials/customNamedRequestIdParamGrouping")
        Observable<Response<ResponseBody>> customNamedRequestIdParamGrouping(@Header("accept-language") String acceptLanguage, @Header("foo-client-request-id") String fooClientRequestId, @Header("User-Agent") String userAgent);

    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     */
    public void customNamedRequestId(String fooClientRequestId) {
        customNamedRequestIdWithServiceResponseAsync(fooClientRequestId).toBlocking().single().body();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromHeaderResponse(customNamedRequestIdWithServiceResponseAsync(fooClientRequestId), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<Void> customNamedRequestIdAsync(String fooClientRequestId) {
        return customNamedRequestIdWithServiceResponseAsync(fooClientRequestId).map(new Func1<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner>> customNamedRequestIdWithServiceResponseAsync(String fooClientRequestId) {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        return service.customNamedRequestId(fooClientRequestId, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner> clientResponse = customNamedRequestIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeadersInner> customNamedRequestIdDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HeaderCustomNamedRequestIdHeadersInner.class);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     */
    public void customNamedRequestIdParamGrouping(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        customNamedRequestIdParamGroupingWithServiceResponseAsync(headerCustomNamedRequestIdParamGroupingParameters).toBlocking().single().body();
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Void> customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.fromHeaderResponse(customNamedRequestIdParamGroupingWithServiceResponseAsync(headerCustomNamedRequestIdParamGroupingParameters), serviceCallback);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<Void> customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        return customNamedRequestIdParamGroupingWithServiceResponseAsync(headerCustomNamedRequestIdParamGroupingParameters).map(new Func1<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner>, Void>() {
            @Override
            public Void call(ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public Observable<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner>> customNamedRequestIdParamGroupingWithServiceResponseAsync(HeaderCustomNamedRequestIdParamGroupingParametersInner headerCustomNamedRequestIdParamGroupingParameters) {
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            throw new IllegalArgumentException("Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null.");
        }
        Validator.validate(headerCustomNamedRequestIdParamGroupingParameters);
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.fooClientRequestId();
        return service.customNamedRequestIdParamGrouping(this.client.acceptLanguage(), fooClientRequestId, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner> clientResponse = customNamedRequestIdParamGroupingDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeadersInner> customNamedRequestIdParamGroupingDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HeaderCustomNamedRequestIdParamGroupingHeadersInner.class);
    }

}
