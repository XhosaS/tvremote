package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nna extends ifj implements nnb {
    public nna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // defpackage.nnb
    public final int a(Intent intent, int i, int i2) {
        Parcel parcelK = k();
        ifl.c(parcelK, intent);
        parcelK.writeInt(i);
        parcelK.writeInt(i2);
        Parcel parcelL = l(2, parcelK);
        int i3 = parcelL.readInt();
        parcelL.recycle();
        return i3;
    }

    @Override // defpackage.nnb
    public final IBinder b(Intent intent) {
        Parcel parcelK = k();
        ifl.c(parcelK, intent);
        Parcel parcelL = l(3, parcelK);
        IBinder strongBinder = parcelL.readStrongBinder();
        parcelL.recycle();
        return strongBinder;
    }

    @Override // defpackage.nnb
    public final void c() {
        m(1, k());
    }

    @Override // defpackage.nnb
    public final void d() {
        m(4, k());
    }
}
