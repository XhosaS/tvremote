package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kix extends kio {
    public final IBinder g;
    final /* synthetic */ kiz h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kix(kiz kizVar, int i, IBinder iBinder, Bundle bundle) {
        super(kizVar, i, bundle);
        this.h = kizVar;
        this.g = iBinder;
    }

    @Override // defpackage.kio
    protected final void a(ConnectionResult connectionResult) {
        kiq kiqVar = this.h.k;
        if (kiqVar != null) {
            kiqVar.c(connectionResult);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.kio
    protected final boolean b() throws RemoteException {
        try {
            IBinder iBinder = this.g;
            kkk.k(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            kiz kizVar = this.h;
            if (!kizVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + kizVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = kizVar.b(this.g);
            if (iInterfaceB == null || !(kizVar.D(2, 4, iInterfaceB) || kizVar.D(3, 4, iInterfaceB))) {
                return false;
            }
            kizVar.o = null;
            kip kipVar = kizVar.j;
            if (kipVar == null) {
                return true;
            }
            kipVar.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
