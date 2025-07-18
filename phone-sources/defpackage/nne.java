package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nne extends ifj implements nnf {
    public nne(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // defpackage.nnf
    public final odd a() {
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

    @Override // defpackage.nnf
    public final odd b() {
        odd odbVar;
        Parcel parcelL = l(7, k());
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

    @Override // defpackage.nnf
    public final void c(boolean z) {
        Parcel parcelK = k();
        int i = ifl.a;
        parcelK.writeInt(1);
        parcelK.writeInt(z ? 1 : 0);
        m(6, parcelK);
    }

    @Override // defpackage.nnf
    public final void d(nng nngVar) {
        Parcel parcelK = k();
        ifl.e(parcelK, nngVar);
        m(2, parcelK);
    }

    @Override // defpackage.nnf
    public final void e(nng nngVar) {
        Parcel parcelK = k();
        ifl.e(parcelK, nngVar);
        m(3, parcelK);
    }
}
