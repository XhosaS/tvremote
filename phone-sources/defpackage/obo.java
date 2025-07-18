package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obo extends ifj implements obq {
    public obo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.obq
    public final int aB() {
        Parcel parcelL = l(2, k());
        int i = parcelL.readInt();
        parcelL.recycle();
        return i;
    }

    @Override // defpackage.obq
    public final odd b() {
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
}
