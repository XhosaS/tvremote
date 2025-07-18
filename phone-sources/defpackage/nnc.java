package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnc extends ifj implements nnd {
    public nnc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // defpackage.nnd
    public final int a() {
        Parcel parcelL = l(17, k());
        int i = parcelL.readInt();
        parcelL.recycle();
        return i;
    }

    @Override // defpackage.nnd
    public final int b() {
        Parcel parcelL = l(18, k());
        int i = parcelL.readInt();
        parcelL.recycle();
        return i;
    }

    @Override // defpackage.nnd
    public final odd c() {
        odd odbVar;
        Parcel parcelL = l(1, k());
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            odbVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            odbVar = iInterfaceQueryLocalInterface instanceof odd ? (odd) iInterfaceQueryLocalInterface : new odb(strongBinder);
        }
        parcelL.recycle();
        return odbVar;
    }

    @Override // defpackage.nnd
    public final void d(int i) {
        Parcel parcelK = k();
        parcelK.writeInt(i);
        m(13, parcelK);
    }

    @Override // defpackage.nnd
    public final boolean e() {
        Parcel parcelL = l(5, k());
        boolean zF = ifl.f(parcelL);
        parcelL.recycle();
        return zF;
    }

    @Override // defpackage.nnd
    public final boolean f() {
        Parcel parcelL = l(6, k());
        boolean zF = ifl.f(parcelL);
        parcelL.recycle();
        return zF;
    }

    @Override // defpackage.nnd
    public final boolean g() {
        Parcel parcelL = l(9, k());
        boolean zF = ifl.f(parcelL);
        parcelL.recycle();
        return zF;
    }

    @Override // defpackage.nnd
    public final void h() {
        Parcel parcelK = k();
        parcelK.writeInt(2153);
        m(15, parcelK);
    }

    @Override // defpackage.nnd
    public final void i() {
        Parcel parcelK = k();
        parcelK.writeInt(2151);
        m(12, parcelK);
    }
}
