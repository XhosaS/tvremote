package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class noj extends ifj implements nok {
    public noj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // defpackage.nok
    public final int a() {
        Parcel parcelL = l(7, k());
        int i = parcelL.readInt();
        parcelL.recycle();
        return i;
    }

    @Override // defpackage.nok
    public final void b(String str, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, bundle);
        m(1, parcelK);
    }

    @Override // defpackage.nok
    public final void c(String str, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, bundle);
        m(2, parcelK);
    }

    @Override // defpackage.nok
    public final void d(String str, String str2, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ifl.c(parcelK, bundle);
        m(9, parcelK);
    }

    @Override // defpackage.nok
    public final void e(String str, String str2, Bundle bundle, int i) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ifl.c(parcelK, bundle);
        parcelK.writeInt(i);
        m(10, parcelK);
    }

    @Override // defpackage.nok
    public final void f(String str, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, bundle);
        m(3, parcelK);
    }

    @Override // defpackage.nok
    public final void g(String str, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, bundle);
        m(4, parcelK);
    }

    @Override // defpackage.nok
    public final void h(String str, String str2, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeString(str2);
        ifl.c(parcelK, bundle);
        m(8, parcelK);
    }

    @Override // defpackage.nok
    public final void i(String str, Bundle bundle, int i) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        ifl.c(parcelK, bundle);
        parcelK.writeInt(i);
        m(6, parcelK);
    }
}
