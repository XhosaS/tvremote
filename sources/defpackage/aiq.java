package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiq extends acj implements ais {
    public aiq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.ais
    public final int a() {
        Parcel parcelD = d(2, c());
        int i = parcelD.readInt();
        parcelD.recycle();
        return i;
    }

    @Override // defpackage.ais
    public final ajy y() {
        ajy ajwVar;
        Parcel parcelD = d(1, c());
        IBinder strongBinder = parcelD.readStrongBinder();
        if (strongBinder == null) {
            ajwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            ajwVar = iInterfaceQueryLocalInterface instanceof ajy ? (ajy) iInterfaceQueryLocalInterface : new ajw(strongBinder);
        }
        parcelD.recycle();
        return ajwVar;
    }
}
