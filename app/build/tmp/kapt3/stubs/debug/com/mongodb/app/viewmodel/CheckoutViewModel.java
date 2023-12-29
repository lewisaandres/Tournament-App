package com.mongodb.app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018R!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/mongodb/app/viewmodel/CheckoutViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_canUseGooglePay", "Landroidx/lifecycle/MutableLiveData;", "", "get_canUseGooglePay", "()Landroidx/lifecycle/MutableLiveData;", "_canUseGooglePay$delegate", "Lkotlin/Lazy;", "canUseGooglePay", "Landroidx/lifecycle/LiveData;", "getCanUseGooglePay", "()Landroidx/lifecycle/LiveData;", "paymentsClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "fetchCanUseGooglePay", "", "getLoadPaymentDataTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "priceCents", "", "app_debug"})
public final class CheckoutViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * A client for interacting with the Google Pay API.
     *
     * @see [PaymentsClient](https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient)
     */
    private final com.google.android.gms.wallet.PaymentsClient paymentsClient = null;
    private final kotlin.Lazy _canUseGooglePay$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> canUseGooglePay = null;
    
    public CheckoutViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> get_canUseGooglePay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getCanUseGooglePay() {
        return null;
    }
    
    /**
     * Determine the user's ability to pay with a payment method supported by your app and display
     * a Google Pay payment button.
     *
     * @return a [LiveData] object that holds the future result of the call.
     * @see [](https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient.html.isReadyToPay)
     *   )
     */
    private final void fetchCanUseGooglePay() {
    }
    
    /**
     * Creates a [Task] that starts the payment process with the transaction details included.
     *
     * @param priceCents the price to show on the payment sheet.
     * @return a [Task] with the payment information.
     * @see [](https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient#loadPaymentData(com.google.android.gms.wallet.PaymentDataRequest)
     *   )
     */
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.tasks.Task<com.google.android.gms.wallet.PaymentData> getLoadPaymentDataTask(long priceCents) {
        return null;
    }
}