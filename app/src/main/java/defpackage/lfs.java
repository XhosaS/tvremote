package defpackage;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfs implements Runnable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ krc b;
    final /* synthetic */ lgp c;

    public lfs(lgp lgpVar, AppMetadata appMetadata, krc krcVar) {
        this.a = appMetadata;
        this.b = krcVar;
        this.c = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar;
        lbk lbkVar;
        lao laoVar;
        String strF = null;
        try {
            try {
                lgpVar = this.c;
                lbkVar = lgpVar.y;
                laoVar = lbkVar.e;
                lbkVar.m(laoVar);
            } catch (RemoteException e) {
                lbk lbkVar2 = this.c.y;
                lab labVar = lbkVar2.f;
                lbkVar2.o(labVar);
                labVar.c.b("Failed to get app instance id", e);
            }
            if (laoVar.f().n(lcs.ANALYTICS_STORAGE)) {
                kzj kzjVar = lgpVar.b;
                if (kzjVar != null) {
                    strF = kzjVar.f(this.a);
                    if (strF != null) {
                        lbk lbkVar3 = lgpVar.y;
                        leo leoVar = lbkVar3.l;
                        lbkVar3.n(leoVar);
                        leoVar.c.set(strF);
                        lbkVar.m(laoVar);
                        laoVar.f.b(strF);
                    }
                    lgpVar.o();
                    return;
                }
                lab labVar2 = lbkVar.f;
                lbkVar.o(labVar2);
                labVar2.c.a("Failed to get app instance id");
            } else {
                lab labVar3 = lbkVar.f;
                lbkVar.o(labVar3);
                labVar3.h.a("Analytics storage consent denied; will not get app instance id");
                lbk lbkVar4 = lgpVar.y;
                leo leoVar2 = lbkVar4.l;
                lbkVar4.n(leoVar2);
                leoVar2.c.set(null);
                lbkVar.m(laoVar);
                laoVar.f.b(null);
            }
            lio lioVar = lbkVar.i;
            lbkVar.m(lioVar);
            lioVar.U(this.b, null);
        } finally {
            lbk lbkVar5 = this.c.y;
            lio lioVar2 = lbkVar5.i;
            lbkVar5.m(lioVar2);
            lioVar2.U(this.b, null);
        }
    }
}
