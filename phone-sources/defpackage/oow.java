package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oow extends ifj implements IInterface {
    public oow(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void a(njq njqVar, oov oovVar) {
        Parcel parcelK = k();
        ifl.e(parcelK, njqVar);
        ifl.e(parcelK, oovVar);
        m(4, parcelK);
    }
}
