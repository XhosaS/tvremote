package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oar extends oal {
    public final IBinder g;
    final /* synthetic */ oat h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oar(oat oatVar, int i, IBinder iBinder, Bundle bundle) {
        super(oatVar, i, bundle);
        this.h = oatVar;
        this.g = iBinder;
    }

    @Override // defpackage.oal
    protected final void a(nve nveVar) {
        oat oatVar = this.h;
        pku pkuVar = oatVar.J;
        if (pkuVar != null) {
            pkuVar.a(nveVar);
        }
        oatVar.o(nveVar);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, nyc] */
    @Override // defpackage.oal
    protected final boolean b() throws RemoteException {
        try {
            IBinder iBinder = this.g;
            ocv.aF(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            oat oatVar = this.h;
            if (!oatVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + oatVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = oatVar.b(this.g);
            if (iInterfaceB == null || !(oatVar.S(2, 4, iInterfaceB) || oatVar.S(3, 4, iInterfaceB))) {
                return false;
            }
            oatVar.E = null;
            Bundle bundleL = oatVar.l();
            pku pkuVar = oatVar.K;
            if (pkuVar == null) {
                return true;
            }
            pkuVar.a.aD(bundleL);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
