package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aflt extends aflu {
    public aflt(IBinder iBinder) {
        super(iBinder);
    }

    @Override // defpackage.aflu
    public final void a(int i, aflx aflxVar) throws RemoteException {
        Parcel parcelA = aflxVar.a();
        aflxVar.a = null;
        if (!b(i, parcelA)) {
            throw new RemoteException(a.a(i, "BinderProxy#transact(", ", FLAG_ONEWAY) returned false"));
        }
    }
}
