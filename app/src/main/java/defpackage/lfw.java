package defpackage;

import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfw implements Runnable {
    final /* synthetic */ lez a;
    final /* synthetic */ lgp b;

    public lfw(lgp lgpVar, lez lezVar) {
        this.a = lezVar;
        this.b = lgpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgp lgpVar = this.b;
        kzj kzjVar = lgpVar.b;
        if (kzjVar == null) {
            lbk lbkVar = lgpVar.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.c.a("Failed to send current screen to service");
            return;
        }
        try {
            lez lezVar = this.a;
            if (lezVar == null) {
                kzjVar.v(0L, null, null, lgpVar.y.a.getPackageName());
            } else {
                kzjVar.v(lezVar.c, lezVar.a, lezVar.b, lgpVar.y.a.getPackageName());
            }
            lgpVar.o();
        } catch (RemoteException e) {
            lbk lbkVar2 = this.b.y;
            lab labVar2 = lbkVar2.f;
            lbkVar2.o(labVar2);
            labVar2.c.b("Failed to send current screen to the service", e);
        }
    }
}
