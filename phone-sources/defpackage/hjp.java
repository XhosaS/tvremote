package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjp extends ifj implements IInterface {
    public hjp(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    public final int a(int i, String str, String str2) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        Parcel parcelL = l(1, parcelK);
        int i2 = parcelL.readInt();
        parcelL.recycle();
        return i2;
    }

    public final int b(int i, String str, String str2, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ifl.c(parcelK, bundle);
        Parcel parcelL = l(10, parcelK);
        int i2 = parcelL.readInt();
        parcelL.recycle();
        return i2;
    }
}
