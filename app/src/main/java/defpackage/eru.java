package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class eru extends Binder implements IInterface {
    private static erw globalInterceptor;

    protected eru(String str) {
        attachInterface(this, str);
    }

    protected boolean N(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    protected final void O(Parcel parcel) {
        erw erwVar = globalInterceptor;
        if (erwVar != null) {
            erwVar.a();
            return;
        }
        ClassLoader classLoader = erv.a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        erw erwVar = globalInterceptor;
        return erwVar == null ? N(i, parcel, parcel2) : erwVar.b();
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
