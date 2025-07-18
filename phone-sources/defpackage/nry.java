package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nry extends ifk implements nrz {
    public nry() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
        ifl.b(parcel);
        a(bundle);
        return true;
    }
}
