package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmu extends ifj implements nmv {
    public nmu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // defpackage.nmv
    public final Bundle a() {
        Parcel parcelL = l(1, k());
        Bundle bundle = (Bundle) ifl.a(parcelL, Bundle.CREATOR);
        parcelL.recycle();
        return bundle;
    }

    @Override // defpackage.nmv
    public final nmz b() {
        nmz nmyVar;
        Parcel parcelL = l(6, k());
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nmyVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            nmyVar = iInterfaceQueryLocalInterface instanceof nmz ? (nmz) iInterfaceQueryLocalInterface : new nmy(strongBinder);
        }
        parcelL.recycle();
        return nmyVar;
    }

    @Override // defpackage.nmv
    public final nnf c() {
        nnf nneVar;
        Parcel parcelL = l(5, k());
        IBinder strongBinder = parcelL.readStrongBinder();
        if (strongBinder == null) {
            nneVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            nneVar = iInterfaceQueryLocalInterface instanceof nnf ? (nnf) iInterfaceQueryLocalInterface : new nne(strongBinder);
        }
        parcelL.recycle();
        return nneVar;
    }

    @Override // defpackage.nmv
    public final void d(nmt nmtVar) {
        Parcel parcelK = k();
        ifl.e(parcelK, nmtVar);
        m(3, parcelK);
    }

    @Override // defpackage.nmv
    public final void e(String str, Map map) {
        Parcel parcelK = k();
        parcelK.writeString(str);
        parcelK.writeMap(map);
        m(11, parcelK);
    }
}
