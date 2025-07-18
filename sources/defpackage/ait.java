package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ait extends ack implements IInterface {
    private aib a;
    private final int b;

    public ait(aib aibVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = aibVar;
        this.b = i;
    }

    public final void b(int i, IBinder iBinder, Bundle bundle) {
        qp.q(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.v(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.ack
    protected final boolean z(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) acl.a(parcel, Bundle.CREATOR);
            acl.b(parcel);
            b(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            acl.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            aif aifVar = (aif) acl.a(parcel, aif.CREATOR);
            acl.b(parcel);
            aib aibVar = this.a;
            qp.q(aibVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            qp.p(aifVar);
            aibVar.m = aifVar;
            if (aibVar.A()) {
                aig aigVar = aifVar.d;
                ajc.a().b(aigVar == null ? null : aigVar.a);
            }
            b(i3, strongBinder2, aifVar.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public ait() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
