package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmy extends ifj implements nmz {
    public nmy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // defpackage.nmz
    public final odd a() {
        odd odbVar;
        Parcel parcelL = l(5, k());
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
}
