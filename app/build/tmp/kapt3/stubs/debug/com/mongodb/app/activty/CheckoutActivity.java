package com.mongodb.app.activty;

import java.lang.System;

/**
 * Checkout implementation for the app
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u00152\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0015H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/mongodb/app/activty/CheckoutActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "amount", "Landroid/widget/TextView;", "detail", "googlePayButton", "Landroid/view/View;", "layoutBinding", "Lcom/mongodb/app/databinding/ActivityCheckoutPayBinding;", "model", "Lcom/mongodb/app/viewmodel/CheckoutViewModel;", "getModel", "()Lcom/mongodb/app/viewmodel/CheckoutViewModel;", "model$delegate", "Lkotlin/Lazy;", "resolvePaymentForResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "handleError", "", "statusCode", "", "message", "", "handlePaymentSuccess", "paymentData", "Lcom/google/android/gms/wallet/PaymentData;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "requestPayment", "setGooglePayAvailable", "available", "", "app_debug"})
public final class CheckoutActivity extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy model$delegate = null;
    private com.mongodb.app.databinding.ActivityCheckoutPayBinding layoutBinding;
    private android.view.View googlePayButton;
    private android.widget.TextView amount;
    private android.widget.TextView detail;
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> resolvePaymentForResult = null;
    private java.util.HashMap _$_findViewCache;
    
    public CheckoutActivity() {
        super();
    }
    
    private final com.mongodb.app.viewmodel.CheckoutViewModel getModel() {
        return null;
    }
    
    /**
     * Initialize the Google Pay API on creation of the activity
     *
     * @see AppCompatActivity.onCreate
     */
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * If isReadyToPay returned `true`, show the button and hide the "checking" text. Otherwise,
     * notify the user that Google Pay is not available. Please adjust to fit in with your current
     * user flow. You are not required to explicitly let the user know if isReadyToPay returns `false`.
     *
     * @param available isReadyToPay API response.
     */
    private final void setGooglePayAvailable(boolean available) {
    }
    
    private final void requestPayment() {
    }
    
    /**
     * PaymentData response object contains the payment information, as well as any additional
     * requested information, such as billing and shipping address.
     *
     * @param paymentData A response object returned by Google after a payer approves payment.
     * @see [Payment
     * Data](https://developers.google.com/pay/api/android/reference/object.PaymentData)
     */
    private final void handlePaymentSuccess(com.google.android.gms.wallet.PaymentData paymentData) {
    }
    
    /**
     * At this stage, the user has already seen a popup informing them an error occurred. Normally,
     * only logging is required.
     *
     * @param statusCode will hold the value of any constant from CommonStatusCode or one of the
     * WalletConstants.ERROR_CODE_* constants.
     * @see [
     * Wallet Constants Library](https://developers.google.com/android/reference/com/google/android/gms/wallet/WalletConstants.constant-summary)
     */
    private final void handleError(int statusCode, java.lang.String message) {
    }
}