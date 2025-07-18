package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.ConnectionInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kkb extends eru implements kkc {
    public kkb() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
            O(parcel);
            c(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            O(parcel);
            e();
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            ConnectionInfo connectionInfo = (ConnectionInfo) erv.a(parcel, ConnectionInfo.CREATOR);
            O(parcel);
            d(i3, strongBinder2, connectionInfo);
        }
        parcel2.writeNoException();
        return true;
    }
}
