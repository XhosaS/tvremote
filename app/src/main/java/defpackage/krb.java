package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class krb extends eru implements krc {
    public krb() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
        O(parcel);
        f(bundle);
        parcel2.writeNoException();
        return true;
    }
}
