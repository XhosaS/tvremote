package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obt extends ifj implements IInterface {
    public obt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final nvw a(nvv nvvVar) {
        Parcel parcelK = k();
        ifl.c(parcelK, nvvVar);
        Parcel parcelL = l(6, parcelK);
        nvw nvwVar = (nvw) ifl.a(parcelL, nvw.CREATOR);
        parcelL.recycle();
        return nvwVar;
    }

    public final boolean b() {
        Parcel parcelL = l(7, k());
        boolean zF = ifl.f(parcelL);
        parcelL.recycle();
        return zF;
    }
}
