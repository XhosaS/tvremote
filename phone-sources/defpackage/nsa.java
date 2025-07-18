package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nsa extends ifj implements IInterface {
    public nsa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    public final void a(nwl nwlVar) {
        Parcel parcelK = k();
        ifl.c(parcelK, nwlVar);
        n(1, parcelK);
    }

    public final void b(String str, String str2, nlb nlbVar, nwl nwlVar) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ifl.c(parcelK, nlbVar);
        ifl.c(parcelK, nwlVar);
        n(14, parcelK);
    }

    public final void c(String str, nlc nlcVar, nwl nwlVar) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, nlcVar);
        ifl.c(parcelK, nwlVar);
        n(13, parcelK);
    }

    public final void d(String str, nwl nwlVar) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, nwlVar);
        n(11, parcelK);
    }

    public final void e(String str, String str2, long j, nwl nwlVar) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeLong(j);
        ifl.c(parcelK, nwlVar);
        n(9, parcelK);
    }

    public final void f(String str, nwl nwlVar) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, nwlVar);
        n(5, parcelK);
    }

    public final void g(String str, nwl nwlVar) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, nwlVar);
        n(12, parcelK);
    }
}
