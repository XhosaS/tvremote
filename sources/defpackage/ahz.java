package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahz extends aht {
    public final IBinder g;
    final /* synthetic */ aib h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahz(aib aibVar, int i, IBinder iBinder, Bundle bundle) {
        super(aibVar, i, bundle);
        this.h = aibVar;
        this.g = iBinder;
    }

    @Override // defpackage.aht
    protected final void a(aeq aeqVar) {
        byj byjVar = this.h.q;
        if (byjVar != null) {
            byjVar.i(aeqVar);
        }
        System.currentTimeMillis();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [agx, java.lang.Object] */
    @Override // defpackage.aht
    protected final boolean b() throws RemoteException {
        try {
            IBinder iBinder = this.g;
            qp.p(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            aib aibVar = this.h;
            if (!aibVar.c().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + aibVar.c() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceB = aibVar.b(this.g);
            if (iInterfaceB == null || !(aibVar.x(2, 4, iInterfaceB) || aibVar.x(3, 4, iInterfaceB))) {
                return false;
            }
            aibVar.k = null;
            byj byjVar = aibVar.r;
            if (byjVar == null) {
                return true;
            }
            byjVar.a.b();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
