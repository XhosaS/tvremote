package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kra extends ert implements krc {
    public kra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.krc
    public final void f(Bundle bundle) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        J(1, parcelA);
    }
}
