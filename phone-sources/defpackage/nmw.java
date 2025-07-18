package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmw extends ifj implements nmx {
    public nmw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // defpackage.nmx
    public final void a(njz njzVar, String str, String str2, boolean z) {
        Parcel parcelK = k();
        ifl.c(parcelK, njzVar);
        parcelK.writeString(str);
        parcelK.writeString(str2);
        parcelK.writeInt(z ? 1 : 0);
        m(4, parcelK);
    }

    @Override // defpackage.nmx
    public final void b(int i) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        m(5, parcelK);
    }

    @Override // defpackage.nmx
    public final void c(nve nveVar) {
        Parcel parcelK = k();
        ifl.c(parcelK, nveVar);
        m(3, parcelK);
    }

    @Override // defpackage.nmx
    public final void d(int i) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        m(2, parcelK);
    }

    @Override // defpackage.nmx
    public final void e(boolean z) {
        Parcel parcelK = k();
        int i = ifl.a;
        parcelK.writeInt(z ? 1 : 0);
        parcelK.writeInt(0);
        m(6, parcelK);
    }

    @Override // defpackage.nmx
    public final void f() {
        Parcel parcelK = k();
        ifl.c(parcelK, null);
        m(1, parcelK);
    }
}
