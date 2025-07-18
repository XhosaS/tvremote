package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nud extends ifj implements IInterface {
    public nud(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(nuc nucVar, ntk ntkVar) {
        Parcel parcelK = k();
        ifl.e(parcelK, nucVar);
        ifl.c(parcelK, ntkVar);
        n(1, parcelK);
    }
}
