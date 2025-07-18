package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjo extends ifk implements IInterface {
    final hid a;
    final Boolean b;
    final /* synthetic */ hia c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjo(hia hiaVar, hid hidVar, Boolean bool) {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
        this.c = hiaVar;
        this.a = hidVar;
        this.b = bool;
    }

    private final void a(hid hidVar, hij hijVar, int i, boolean z, String str) {
        this.c.z(0);
        hidVar.d(hijVar, i, str, z);
        hidVar.b(hijVar);
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
        ifl.b(parcel);
        if (bundle == null) {
            hiy.e("BillingClient", "Response bundle is null.");
            a(this.a, hik.e, 131, this.b.booleanValue(), null);
        } else if (!bundle.containsKey("RESPONSE_CODE")) {
            a(this.a, hik.e, 138, this.b.booleanValue(), null);
        } else if (bundle.getInt("RESPONSE_CODE") != 0) {
            a(this.a, hik.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), 139, this.b.booleanValue(), "Response code from Phonesky: " + bundle.getInt("RESPONSE_CODE"));
        } else if (bundle.containsKey("BILLING_API_VERSION_KEY")) {
            int i2 = bundle.getInt("BILLING_API_VERSION_KEY");
            hia hiaVar = this.c;
            hiaVar.k(i2);
            hiaVar.h = i2 >= 5;
            hiaVar.g = i2 >= 3;
            Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
            if (bundle2 != null) {
                try {
                    bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
                } catch (Throwable th) {
                    hiy.f("BillingClient", "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString()), th);
                }
                try {
                    hil.a = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
                } catch (Throwable th2) {
                    hiy.f("BillingClient", "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th2);
                }
                try {
                    hil.b = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
                } catch (Throwable th3) {
                    hiy.f("BillingClient", "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString()), th3);
                }
                try {
                    hil.c = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
                } catch (Throwable th4) {
                    hiy.f("BillingClient", "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString()), th4);
                }
            }
            hia hiaVar2 = this.c;
            if (hiaVar2.i < 3) {
                hiy.e("BillingClient", "In-app billing API version 3 is not supported on this device.");
                a(this.a, hik.a, 36, this.b.booleanValue(), null);
            } else {
                hid hidVar = this.a;
                boolean zBooleanValue = this.b.booleanValue();
                hiaVar2.l(0);
                synchronized (hiaVar2.a) {
                    if (hiaVar2.b != 3) {
                        hidVar.a(zBooleanValue);
                        hidVar.b(hik.f);
                    }
                }
            }
        } else {
            hiy.e("BillingClient", "Billing API version not found in response bundle.");
            a(this.a, hik.e, 137, this.b.booleanValue(), null);
        }
        return true;
    }

    public hjo() {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
    }
}
