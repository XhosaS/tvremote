package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fni extends ifj implements fnk {
    public fni(IBinder iBinder) {
        super(iBinder, "androidx.media3.session.IMediaController");
    }

    @Override // defpackage.fnk
    public final void a(int i, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        n(3009, parcelK);
    }

    @Override // defpackage.fnk
    public final void b(int i, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        n(3001, parcelK);
    }

    @Override // defpackage.fnk
    public final void c(int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        ifl.c(parcelK, bundle2);
        n(3005, parcelK);
    }

    @Override // defpackage.fnk
    public final void d(int i, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        n(3003, parcelK);
    }

    @Override // defpackage.fnk
    public final void e(int i, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        n(3008, parcelK);
    }

    @Override // defpackage.fnk
    public final void f(int i, Bundle bundle, boolean z) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        parcelK.writeInt(z ? 1 : 0);
        n(3007, parcelK);
    }

    @Override // defpackage.fnk
    public final void g(int i, Bundle bundle, Bundle bundle2) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        ifl.c(parcelK, bundle2);
        n(3013, parcelK);
    }

    @Override // defpackage.fnk
    public final void h(int i) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        n(3011, parcelK);
    }

    @Override // defpackage.fnk
    public final void i(int i, Bundle bundle) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        ifl.c(parcelK, bundle);
        n(3002, parcelK);
    }

    @Override // defpackage.fnk
    public final void j() {
        Parcel parcelK = k();
        parcelK.writeInt(0);
        n(3006, parcelK);
    }
}
