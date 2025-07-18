package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjy extends ert implements kka {
    public kjy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.kka
    public final int d() {
        Parcel parcelB = b(2, a());
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }

    @Override // defpackage.kka
    public final kme e() {
        kme kmcVar;
        Parcel parcelB = b(1, a());
        IBinder strongBinder = parcelB.readStrongBinder();
        if (strongBinder == null) {
            kmcVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            kmcVar = iInterfaceQueryLocalInterface instanceof kme ? (kme) iInterfaceQueryLocalInterface : new kmc(strongBinder);
        }
        parcelB.recycle();
        return kmcVar;
    }
}
