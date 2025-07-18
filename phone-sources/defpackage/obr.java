package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class obr extends ifk implements IInterface {
    private oat a;
    private final int b;

    public obr(oat oatVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.a = oatVar;
        this.b = i;
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        ocv.aG(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.p(i, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) ifl.a(parcel, Bundle.CREATOR);
            ifl.b(parcel);
            a(i2, strongBinder, bundle);
        } else if (i == 2) {
            parcel.readInt();
            ifl.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            oax oaxVar = (oax) ifl.a(parcel, oax.CREATOR);
            ifl.b(parcel);
            oat oatVar = this.a;
            ocv.aG(oatVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ocv.aF(oaxVar);
            oatVar.G = oaxVar;
            if (oatVar.f()) {
                oay oayVar = oaxVar.d;
                oca.a().b(oayVar == null ? null : oayVar.a);
            }
            a(i3, strongBinder2, oaxVar.a);
        }
        parcel2.writeNoException();
        return true;
    }

    public obr() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
