package com.mongodb.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013\u00a8\u0006\u0018"}, d2 = {"Lcom/mongodb/app/Constants;", "", "()V", "COUNTRY_CODE", "", "CURRENCY_CODE", "DIRECT_TOKENIZATION_PARAMETERS", "", "getDIRECT_TOKENIZATION_PARAMETERS", "()Ljava/util/Map;", "DIRECT_TOKENIZATION_PUBLIC_KEY", "PAYMENTS_ENVIRONMENT", "", "PAYMENT_GATEWAY_TOKENIZATION_NAME", "PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS", "getPAYMENT_GATEWAY_TOKENIZATION_PARAMETERS", "SHIPPING_SUPPORTED_COUNTRIES", "", "getSHIPPING_SUPPORTED_COUNTRIES", "()Ljava/util/List;", "SUPPORTED_METHODS", "getSUPPORTED_METHODS", "SUPPORTED_NETWORKS", "getSUPPORTED_NETWORKS", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.mongodb.app.Constants INSTANCE = null;
    
    /**
     * Changing this to ENVIRONMENT_PRODUCTION will make the API return chargeable card information.
     * Please refer to the documentation to read about the required steps needed to enable
     * ENVIRONMENT_PRODUCTION.
     *
     * @value #PAYMENTS_ENVIRONMENT
     */
    public static final int PAYMENTS_ENVIRONMENT = com.google.android.gms.wallet.WalletConstants.ENVIRONMENT_TEST;
    
    /**
     * The allowed networks to be requested from the API. If the user has cards from networks not
     * specified here in their account, these will not be offered for them to choose in the popup.
     *
     * @value #SUPPORTED_NETWORKS
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> SUPPORTED_NETWORKS = null;
    
    /**
     * The Google Pay API may return cards on file on Google.com (PAN_ONLY) and/or a device token on
     * an Android device authenticated with a 3-D Secure cryptogram (CRYPTOGRAM_3DS).
     *
     * @value #SUPPORTED_METHODS
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> SUPPORTED_METHODS = null;
    
    /**
     * Required by the API, but not visible to the user.
     *
     * @value #COUNTRY_CODE Your local country
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COUNTRY_CODE = "US";
    
    /**
     * Required by the API, but not visible to the user.
     *
     * @value #CURRENCY_CODE Your local currency
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CURRENCY_CODE = "USD";
    
    /**
     * Supported countries for shipping (use ISO 3166-1 alpha-2 country codes). Relevant only when
     * requesting a shipping address.
     *
     * @value #SHIPPING_SUPPORTED_COUNTRIES
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> SHIPPING_SUPPORTED_COUNTRIES = null;
    
    /**
     * The name of your payment processor/gateway. Please refer to their documentation for more
     * information.
     *
     * @value #PAYMENT_GATEWAY_TOKENIZATION_NAME
     */
    private static final java.lang.String PAYMENT_GATEWAY_TOKENIZATION_NAME = "example";
    
    /**
     * Custom parameters required by the processor/gateway.
     * In many cases, your processor / gateway will only require a gatewayMerchantId.
     * Please refer to your processor's documentation for more information. The number of parameters
     * required and their names vary depending on the processor.
     *
     * @value #PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.String> PAYMENT_GATEWAY_TOKENIZATION_PARAMETERS = null;
    
    /**
     * Only used for `DIRECT` tokenization. Can be removed when using `PAYMENT_GATEWAY`
     * tokenization.
     *
     * @value #DIRECT_TOKENIZATION_PUBLIC_KEY
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DIRECT_TOKENIZATION_PUBLIC_KEY = "REPLACE_ME";
    
    /**
     * Parameters required for `DIRECT` tokenization.
     * Only used for `DIRECT` tokenization. Can be removed when using `PAYMENT_GATEWAY`
     * tokenization.
     *
     * @value #DIRECT_TOKENIZATION_PARAMETERS
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.String> DIRECT_TOKENIZATION_PARAMETERS = null;
    
    private Constants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSUPPORTED_NETWORKS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSUPPORTED_METHODS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getSHIPPING_SUPPORTED_COUNTRIES() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getPAYMENT_GATEWAY_TOKENIZATION_PARAMETERS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getDIRECT_TOKENIZATION_PARAMETERS() {
        return null;
    }
}