package com.mongodb.app.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/mongodb/app/util/PaymentsUtil;", "", "()V", "CENTS", "Ljava/math/BigDecimal;", "getCENTS", "()Ljava/math/BigDecimal;", "allowedCardAuthMethods", "Lorg/json/JSONArray;", "allowedCardNetworks", "baseRequest", "Lorg/json/JSONObject;", "merchantInfo", "baseCardPaymentMethod", "cardPaymentMethod", "createPaymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "context", "Landroid/content/Context;", "gatewayTokenizationSpecification", "getPaymentDataRequest", "priceCemts", "", "getTransactionInfo", "price", "", "isReadyToPayRequest", "app_debug"})
public final class PaymentsUtil {
    @org.jetbrains.annotations.NotNull()
    public static final com.mongodb.app.util.PaymentsUtil INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.math.BigDecimal CENTS = null;
    
    /**
     * Create a Google Pay API base request object with properties used in all requests.
     *
     * @return Google Pay API base request object.
     * @throws JSONException
     */
    private static final org.json.JSONObject baseRequest = null;
    
    /**
     * Card networks supported by your app and your gateway.
     *
     *
     * TODO: Confirm card networks supported by your app and gateway & update in Constants.java.
     *
     * @return Allowed card networks
     * See [CardParameters](https://developers.google.com/pay/api/android/reference/object.CardParameters)
     */
    private static final org.json.JSONArray allowedCardNetworks = null;
    
    /**
     * Card authentication methods supported by your app and your gateway.
     *
     *
     * TODO: Confirm your processor supports Android device tokens on your supported card networks
     * and make updates in Constants.java.
     *
     * @return Allowed card authentication methods.
     * See [CardParameters](https://developers.google.com/pay/api/android/reference/object.CardParameters)
     */
    private static final org.json.JSONArray allowedCardAuthMethods = null;
    
    /**
     * Information about the merchant requesting payment information
     *
     * @return Information about the merchant.
     * @throws JSONException
     * See [MerchantInfo](https://developers.google.com/pay/api/android/reference/object.MerchantInfo)
     */
    private static final org.json.JSONObject merchantInfo = null;
    
    private PaymentsUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.math.BigDecimal getCENTS() {
        return null;
    }
    
    /**
     * Gateway Integration: Identify your gateway and your app's gateway merchant identifier.
     *
     *
     * The Google Pay API response will return an encrypted payment method capable of being charged
     * by a supported gateway after payer authorization.
     *
     *
     * TODO: Check with your gateway on the parameters to pass and modify them in Constants.java.
     *
     * @return Payment data tokenization for the CARD payment method.
     * @throws JSONException
     * See [PaymentMethodTokenizationSpecification](https://developers.google.com/pay/api/android/reference/object.PaymentMethodTokenizationSpecification)
     */
    private final org.json.JSONObject gatewayTokenizationSpecification() {
        return null;
    }
    
    /**
     * Describe your app's support for the CARD payment method.
     *
     *
     * The provided properties are applicable to both an IsReadyToPayRequest and a
     * PaymentDataRequest.
     *
     * @return A CARD PaymentMethod object describing accepted cards.
     * @throws JSONException
     * See [PaymentMethod](https://developers.google.com/pay/api/android/reference/object.PaymentMethod)
     */
    private final org.json.JSONObject baseCardPaymentMethod() {
        return null;
    }
    
    /**
     * Describe the expected returned payment data for the CARD payment method
     *
     * @return A CARD PaymentMethod describing accepted cards and optional fields.
     * @throws JSONException
     * See [PaymentMethod](https://developers.google.com/pay/api/android/reference/object.PaymentMethod)
     */
    private final org.json.JSONObject cardPaymentMethod() {
        return null;
    }
    
    /**
     * An object describing accepted forms of payment by your app, used to determine a viewer's
     * readiness to pay.
     *
     * @return API version and payment methods supported by the app.
     * See [IsReadyToPayRequest](https://developers.google.com/pay/api/android/reference/object.IsReadyToPayRequest)
     */
    @org.jetbrains.annotations.Nullable()
    public final org.json.JSONObject isReadyToPayRequest() {
        return null;
    }
    
    /**
     * Creates an instance of [PaymentsClient] for use in an [Context] using the
     * environment and theme set in [Constants].
     *
     * @param context from the caller activity.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.wallet.PaymentsClient createPaymentsClient(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    /**
     * Provide Google Pay API with a payment amount, currency, and amount status.
     *
     * @return information about the requested payment.
     * @throws JSONException
     * See [TransactionInfo](https://developers.google.com/pay/api/android/reference/object.TransactionInfo)
     */
    @kotlin.jvm.Throws(exceptionClasses = {org.json.JSONException.class})
    private final org.json.JSONObject getTransactionInfo(java.lang.String price) throws org.json.JSONException {
        return null;
    }
    
    /**
     * An object describing information requested in a Google Pay payment sheet
     *
     * @return Payment data expected by your app.
     * See [PaymentDataRequest](https://developers.google.com/pay/api/android/reference/object.PaymentDataRequest)
     */
    @org.jetbrains.annotations.NotNull()
    public final org.json.JSONObject getPaymentDataRequest(long priceCemts) {
        return null;
    }
}